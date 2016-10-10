/**
 * blog: http://www.jcore.cn/
 * Created by zjj on 15-1-1.
 */
// 迷宫锁函数
var MazeLock = (function(global, doc){

    var _canvas, _context, _circles, _callback,
        //_isAndroid = navigator.userAgent.match(/android/i),
        _isAndroid = false;
        //_isTouch    = document.hasOwnProperty("ontouchstart"),  // 判断是否支持手机事件
        _isTouch    = true;
        _touchStart = _isTouch ? 'touchstart' : 'mousedown',    // 点击
        _touchMove  = _isTouch ? 'touchmove'  : 'mousemove',    // 拖动
        _touchEnd   = _isTouch ? 'touchend'   : 'mouseup';      // 抬起

    // 获取画布 Context
    function Context(config){
        var _config  = config || {},
            _wrap    = _config.wrap;

        _canvas  = doc.createElement("canvas"); // 构造canvas

        /* 解决某些andriod机重影的bug */
        _wrap.style.overflow = "visible" ;
        _wrap.style.webkitTransform = "translateZ(0)";

        /* 阻止滑动时屏幕跟随移动 */
        _canvas.addEventListener(_touchMove,function(e){e.preventDefault();});

        _wrap.appendChild(_canvas);

        return {
            init : function(boxSize){

                // 初始化画布宽高
                _canvas.width  = boxSize;
                _canvas.height = boxSize;

                _context = _canvas.getContext("2d");
            }
        }
    }

    // 画圆函数
    function Circles(config) {

        var _config = config || {},
            _circle = { // 初始化参数
                radius      : _config.radius  || 30, // 半径
                gap         : _config.gap     || 10, // 间隔
                size        : _config.size    || 3,  // 行列个数
                lineColor   : _config.lineColor || "#00ade9" // 线颜色
            },
            _radius         = _circle.radius,   // 半径
            _gap            = _circle.gap,      // 间隔
            _size           = _circle.size,     // 行列个数
            _lineColor      = _circle.lineColor,// 线颜色
            _circles        = [], // 圆数组存储
            _circlesList    = [], // 选中的圆
            _radiusTemp     = (_radius + _gap), // 单个圆的范围
            _boxSize        = (_radius + _gap) * 2 * _size, // 迷宫锁范围大小
            _self           = this;

        /* 基础圆函数 */
        function Circle(x, y, index, hasChoose){
            return { // 圆对象
                x : x, // x轴
                y : y, // y轴
                index : index, // 下标
                hasChoose : hasChoose || false // 是否选中
            };
        }

        /* 画圆函数 */
        function DrawCircle(index, config){
            var _config = config || {},
                _x      = _circles[index].x, // 圆X轴
                _y      = _circles[index].y, // 圆Y轴
                _solid  = _config.solid || false,  // 是否实心
                _c1     = _config.c1 || "#00ade9", // 圆颜色
                _c2     = _config.c2 || "#e2f8ff"; // 圆颜色

            _context.globalAlpha=1; // 设置透明度

            if(!_solid) { // 空心圆
                _context.beginPath();
                var x = _circles[index].x;
                var y = _circles[index].y;
                _context.arc(x, y, _radius, 0, Math.PI*2, true);
                _context.lineWidth = 1.5;
                _context.strokeStyle = "#ffffff";
                _context.stroke();
                _context.closePath();
            } else { // 实心圆
                //画外面的圆
                _context.beginPath();
                _context.arc(_x, _y, _radius, 0, Math.PI*2, true);
                _context.fillStyle = _c2;
                _context.lineWidth = 1.0;
                _context.strokeStyle = _c1;
                _context.fill();
                _context.stroke();
                _context.closePath();
                //画小圆
                _context.beginPath();
                _context.arc(_x, _y, 10, 0, Math.PI*2, true);
                _context.fillStyle = _c1;
                _context.fill();
                _context.closePath();
            }
        }

        /**
         * 生成一条线连接两个圆
         * @param startIndex起始圆的位置
         * @param endIndex结束圆的位置
         */
        function ConnectCircle(startIndex,endIndex,color){
            var _x1 = _circles[startIndex].x,
                _y1 = _circles[startIndex].y,
                _x2 = _circles[endIndex].x,
                _y2 = _circles[endIndex].y;
            _context.beginPath(); // 开始路径绘制
            _context.moveTo(_x1, _y1);
            _context.lineTo(_x2, _y2);
            _context.lineWidth = 3.0; // 设置线宽
            _context.strokeStyle = color || _lineColor ; // 设置线的颜色
            _context.stroke();  // 进行线的着色，这时整条线才变得可见
            _context.closePath();
        }

        /**
         * 画正在移动的线
         * @param startX 起始点的X
         * @param startY 起始点的Y
         * @param posX 结束点的X
         * @param posY 结束点的Y
         */
        function DrawMoveLine(startX,startY,posX,posY){
            _context.beginPath();
            _context.moveTo(startX, startY);
            _context.lineTo(posX,posY);
            _context.lineWidth = 3.0;
            _context.strokeStyle = _lineColor;
            _context.stroke();
            _context.closePath();
        }

        /* x，y轴是否在圆内，选中返回下标，否则返回 null */
        function CheckInCircle(x, y){
            var col = Math.floor(x  / _radiusTemp / 2);
            var row = Math.floor(y  / _radiusTemp / 2);
            if(col >= _size || row >= _size || col < 0 || row < 0){
                return null;
            }
            var circle = _circles[row * _size + col];
            if( x <= circle.x + _radius && x >= circle.x - _radius &&
                y <= circle.y + _radius && y >= circle.y - _radius
                ){
                return circle.index;
            }else {
                return null;
            }
        }

        return {
            list : _circles, // 所有圆数组
            selected : _circlesList, // 进过选中圆数组
            boxSize : _boxSize, // 初始化圆范围
            /* 初始化圆函数 */
            init : function(){
                for(var i = 0 ; i < _size ; i++){ //rows
                    for(var j = 0; j < _size ; j++){ //cols
                        var x = _radiusTemp + j * _radiusTemp * 2,
                            y = _radiusTemp + i * _radiusTemp * 2,
                            index = _circles.length;
                        _circles.push(Circle(x,y,index));
                        DrawCircle(index);
                    }
                }
            },
            /* 是否在圆的范围之内函数 */
            CheckInCircle : CheckInCircle,
            DrawMoveLine  : DrawMoveLine,
            DrawClearCircle : function(){
                clearCanvas(); // 清空画布
                for(var i = 0; i< _circles.length ; i++){
                    _circles[i].hasChoose = false;
                    DrawCircle(_circles[i].index); // 重新画空心圆
                }
                this.selected = []; // 清空选中格子
            },
            DrawSuccessCircle : function(){
                clearCanvas(); // 清空画布
                for(var i = 0 ; i < _circles.length; i++){ // 画正确圆
                    DrawCircle(i, _circles[i].hasChoose ? { solid : true } : null);
                }

                for(var i = 0 ; i < this.selected.length - 1; i++){ // 画正确圆循环连接线
                    ConnectCircle(this.selected[i], this.selected[i+1]);
                }
            },
            DrawErrorCircle : function(callback){
                clearCanvas(); // 清空画布
                for(var i = 0 ; i < _circles.length; i++){ // 画错误圆
                    DrawCircle(i, _circles[i].hasChoose ? { solid : true, c1: '#f7574b', c2: '#f8d0cd' } : null);
                }
                for(var i = 0 ; i < this.selected.length - 1; i++){ // 画错误圆循环连接线
                    ConnectCircle(this.selected[i], this.selected[i+1],'#f7574b');
                }
                if(callback) callback();
            }
        }
    }

    /**
     * 捕捉坐标函数
     * @param element 触摸节点对象
     * @returns {{x: null, y: null, isPressed: boolean, event: null}}
     */
    function CapturesCoord(element) {

        var body_scrollLeft = doc.body.scrollLeft, // body左滚动位置
            body_scrollTop = doc.body.scrollTop,   // body上滚动位置
            element_scrollLeft = doc.documentElement.scrollLeft, // 节点左滚动位置
            element_scrollTop = doc.documentElement.scrollTop,   // 节点上滚动位置
            offsetLeft = element.offsetLeft, // 节点左移动位置
            offsetTop = element.offsetTop;   // 节点上移动位置

        function Coord(x, y, isPressed, isMove, event){
            return {
                x: x || null, // x轴
                y: y || null, // y轴
                isPressed: isPressed || false, // 是否点击
                isMove: isMove || false, // 是否移动
                event: event || null     // 目标事件
            }
        }

        /* 点击坐标函数 */
        function StartCoord(event){
            var coord = new Coord();
            var _coord = GetCoord(event);
            coord.isPressed = true;
            coord.x = _coord.x;
            coord.y = _coord.y;
            coord.event = event;
            return coord;
        }

        /* 结束坐标函数 */
        function EndCoord(event){
            var coord = new Coord();
            coord.isPressed = false;
            coord.isMove = false;
            coord.x = null;
            coord.y = null;
            coord.event = event;
            return coord;
        }

        /* 移动坐标函数 */
        function MoveCoord(event){
            var coord = new Coord();
            var _coord = GetCoord(event);
            coord.isMove = true;
            coord.x = _coord.x;
            coord.y = _coord.y;
            coord.event = event;
            return coord;
        }

        /* 获取坐标 */
        function GetCoord(event){
            var x, y, _event = _isTouch ? event.touches[0] : event;

            if (_event.pageX || _event.pageY) {
                x = _event.pageX;
                y = _event.pageY;
            } else {
                x = _event.clientX + body_scrollLeft + element_scrollLeft;
                y = _event.clientY + body_scrollTop + element_scrollTop;
            }
            x -= offsetLeft;
            y -= offsetTop;

            return { x : x, y : y }
        }

        /* 返回当前坐标函数 */
        return {
            StartCoord : StartCoord,
            MoveCoord  : MoveCoord,
            EndCoord   : EndCoord
        };

    };

    /* 监听事件 */
    function Listeners(element) {

        var _capturesCoord = new CapturesCoord(element), // 坐标函数
            _point = {}, // 临时点函数
            _drawing = false; // 是否选中

        /* 点击事件监听器 */
        function StartListener(event){
            event.preventDefault();
            if(_drawing) return;
            Log("start...");
            var _coord = _capturesCoord.StartCoord(event);
            _point = _coord;
            var _index = _circles.CheckInCircle(_coord.x, _coord.y);
            if(_index!==null){
                _drawing = true;
                var _circlesList = _circles.list[_index];
                _circles.selected.push(_index);
                _circlesList.hasChoose = true;
                _circles.DrawSuccessCircle();
            }

            // 添加移动和离开事件
            element.addEventListener(_touchMove, MoveListener, false);
            element.addEventListener(_touchEnd,  EndListener,  false);
        }

        /* 拖动事件监听器 */
        function MoveListener(event){
            event.preventDefault();
            if(!_drawing) return;
            Log("move...");
            var _coord = _capturesCoord.MoveCoord(event);
            var _index = _circles.CheckInCircle(_coord.x, _coord.y);
            _circles.DrawSuccessCircle();
            var _circlesList = _circles.list[_index];
            if(_index===null || _circlesList.hasChoose){
                var _startX = _point.x,
                    _startY = _point.y,
                    _posX   = _coord.x,
                    _posY   = _coord.y;
                _circles.DrawMoveLine(_startX, _startY, _posX, _posY);
            }else{
                _point["x"] = _circlesList.x;
                _point["y"] = _circlesList.y;
                _circles.selected.push(_index);
                _circlesList.hasChoose = true;
            }

        }

        /* 离开事件监听器 */
        function EndListener(event){
            event.preventDefault();
            if(!_drawing) return;
            Log("end...");
            _capturesCoord.EndCoord(event);

            _callback(_circles.selected);

            _drawing = false;

            // 移除移动和离开事件
            element.removeEventListener(_touchMove, MoveListener, false);
            element.removeEventListener(_touchEnd,  EndListener,  false);
        }

        /* 返回监听函数 */
        return {
            StartListener : StartListener,
            MoveListener  : MoveListener,
            EndListener   : EndListener
        }
    }

    /**
     * 清空canvas画布的内容
     */
    function clearCanvas(){
        _context.clearRect(0, 0, _canvas.width, _canvas.height);
        if( _isAndroid ) { /* 安卓下clearRect无效时的hack */
            _canvas.style.display = 'none';// Detach from DOM
            _canvas.offsetHeight; // Force the detach
            _canvas.style.display = 'inherit'; // Reattach to DOM
        }
    }

    /**
     * 简易日志函数
     * @param infoStr 日志字符串
     */
    function Log( infoStr ){
        //console.log( infoStr );
    }

    // 返回函数体
    return function(config){

        var _config     = config || {},
            _wrap       = _config.wrap || doc.querySelector("body"),
            _context    = new Context({ wrap :  _wrap}),
            _listeners  = new Listeners(_canvas);

        _callback   = _config.callback || function(){}
        _circles    = new Circles({
            radius  : _config.radius,   // 半径
            gap     : _config.gap,      // 间隔
            size    : _config.size,      // 行列个数
			lineColor : _config.lineColor      
			 
        })

        return {
            init : function(){
                _context.init(_circles.boxSize)
                _circles.init();
                _canvas.addEventListener(_touchStart, _listeners.StartListener, false); // 绑定点击事件
            },
            drawClearPanel : function(){
                _circles.DrawClearCircle();
            },
            drawErrorPanel : function(){
                _circles.DrawErrorCircle(function(){
                	setTimeout(function(){
                        _circles.DrawClearCircle();
                    },300);
                });
            },
            clearCanvas : function(){
                clearCanvas();
                // 删除画布事件
                _canvas.removeEventListener(_touchStart, _listeners.StartListener, false);
                _canvas.removeEventListener(_touchMove,  _listeners.MoveListener,  false);
                _canvas.removeEventListener(_touchEnd,   _listeners.EndListener,   false);
            }

        }

    }

})(window, document);