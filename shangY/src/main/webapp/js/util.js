/**
 * 返回上一页
 */
function back(){
	window.history.back();
}
function refresh(){
	window.location.reload();
}
$(document).ready(function() {
	if(window.history.length<2){
		$(".back").remove();
	}
});
/**
 * 批量显示或隐藏对象(有display属性的html元素都可使用)
 * @param objs 参数：id-none/block,多个用|分隔
 * @param displayValue 可不传值
 * 调用示例：
 * 1、displaySet('mortgageDiv-none|mortgageTypeDiv-block')
 * 2、displaySet('mortgageDiv|mortgageTypeDiv','none')
 */
function displaySet(objs,displayValue){
	displayValue = displayValue || 0;
	var objAry = objs.split('|');
	for(var i=0;i<objAry.length;i++){
		var obj = objAry[i].split('-');
		if(displayValue==0){
			$('#'+obj[0]+'').css('display',obj[1]);
		}else{
			$('#'+obj[0]+'').css('display',displayValue);
		}
	}
}




/**
 * 批量设置对象属性值
 * @param objs 参数:id-attrName-attrValue 或者 id-attrValue
 * @param attrName 属性名称,可不传值
 * 
 * 调用示例:
 * 1、设置同一属性的值 attrSet('guarantyOrganization-Require|pledgeSel-|creditSel-','dataType');
 * 2、单独指定每个对象的属性值 attrSet('guarantyOrganization-msg-不能为空|guarantyOrganization-dataType-Require|creditSel-dataType-');
 */
function attrSet(objs,attrName){
	attrName = attrName || 0;
	var objAry = objs.split('|');
	for(var i=0;i<objAry.length;i++){
		var obj = objAry[i].split('-');
		if(attrName==0){
			$('#'+obj[0]+'').attr(obj[1],obj[2]);
		}else{
			$('#'+obj[0]+'').attr(attrName,obj[1]);
		}
	}
}

/**
 * 清除首尾空格
 * @param obj 
 */
function forbidBlank(obj){
	obj.value = obj.value.replace(/(^\s*)|(\s*$)/g,"");
}

/**
 * 加载验证码
 * @param id
 * @param path
 */
function loadRandCodeImg(id,path){
	document.getElementById(id).src=path+'/random.jsp?'+Math.random();
}
function loadRandCodeImg1(id,path){
	document.getElementById(id).src=path+'/random.jsp?'+Math.random();
}
/**
 * 加载列表(参数依次是：页码，拼接页码前的url,点击的按钮id，加载到的大列表的id)
 */
function getFirstListData(version,realPath,urlStr,clickElementId,toElementId){
	var _load = layer.load('数据加载中..');
	$.ajax({
		url : urlStr+"/1",
		type : 'post',
		dataType : 'text',
		success : function(data){
			layer.close(_load);
			if(data==null||$.trim(data)==''){
				$('#'+toElementId).append("<div class='mx-none'><p><i class='iconfont'>&#xe604;</i></p><span>暂无数据</span></div><div style='height:4rem;'></div>");
			}else{
				$('#'+toElementId).append(data);
				$('#'+clickElementId).bind("click",{pageNum:2,urlStr:urlStr,clickElementId:clickElementId,toElementId:toElementId},addList);
			}
		},
		error : function(data) {
			layer.close(_load);
			layer.msg('网络连接异常，请刷新页面或稍后重试！', 1, 5);
	    }
	});
}

/**
 * 加载列表(参数依次是：页码，拼接页码前的url,点击的按钮id，加载到的大列表的id)
 */
function addList(event){
	var _load = layer.load('数据加载中..');
	$.ajax({
		url : event.data.urlStr+"/"+event.data.pageNum,
		type : 'post',
		dataType : 'text',
		success : function(data){
			layer.close(_load);
			$('#'+event.data.clickElementId).remove();
			$('#'+event.data.toElementId).append(data);
			$('#'+event.data.clickElementId).bind("click",{pageNum:event.data.pageNum+1,urlStr:event.data.urlStr,clickElementId:event.data.clickElementId,toElementId:event.data.toElementId},addList);
		},
		error : function(data) {
			layer.close(_load);
			layer.msg('网络连接异常，请刷新页面或稍后重试！', 1, 5);
	    }
	});
}

/**
 * 加载列表(参数依次是：页码，拼接页码前的url,点击的按钮id，加载到的大列表的id)
 */
function getMoreData(version,realPath,urlStr,clickElementId,toElementId,toShowElementId){
	var _load = layer.load('数据加载中..');
	$.ajax({
		url : urlStr+"/1",
		type : 'post',
		dataType : 'text',
		success : function(data){
			layer.close(_load);
			if(data==null||$.trim(data)==''){
				$('#'+toShowElementId).append("<div class='mx-none'><p><i class='iconfont'>&#xe604;</i></p><span>暂无数据</span></div><div style='height:4rem;'></div>");
			}else{
				$('#'+toElementId).append(data);
				$('#'+clickElementId).bind("click",{pageNum:2,urlStr:urlStr,clickElementId:clickElementId,toElementId:toElementId,toShowElementId:toShowElementId},addMoreList);
			}
		},
		error : function(data) {
			layer.close(_load);
			layer.msg('网络连接异常，请刷新页面或稍后重试！', 1, 5);
	    }
	});
}
/**
 * 加载列表(参数依次是：页码，拼接页码前的url,点击的按钮id，加载到的大列表的id)
 */
function addMoreList(event){
	var _load = layer.load('数据加载中..');
	$.ajax({
		url : event.data.urlStr+"/"+event.data.pageNum,
		type : 'post',
		dataType : 'text',
		success : function(data){
			layer.close(_load);
			$('#'+event.data.clickElementId).remove();
			$('#'+event.data.toElementId).append(data);
			$('#'+event.data.clickElementId).bind("click",{pageNum:event.data.pageNum+1,urlStr:event.data.urlStr,clickElementId:event.data.clickElementId,toElementId:event.data.toElementId,toShowElementId:event.data.toShowElementId},addList);
		},
		error : function(data) {
			layer.close(_load);
			layer.msg('网络连接异常，请刷新页面或稍后重试！', 1, 5);
	    }
	});
}

/**
 * 金额转换为大写
 * @param Num
 * @returns
 */
function numToChinese(Num) {
	for (i = Num.length - 1; i >= 0; i--) {
		Num = Num.replace(",", "");
		Num = Num.replace(" ", "");
	}
	Num = Num.replace("￥", "")
	if (isNaN(Num)) {
		layer.msg("金额格式不正确。", 2, 5);
		return;
	}
	part = String(Num).split(".");
	newchar = "";
	for (i = part[0].length - 1; i >= 0; i--) {
		tmpnewchar = ""
		perchar = part[0].charAt(i);
		switch (perchar) {
		case "0":
			tmpnewchar = "零" + tmpnewchar;
			break;
		case "1":
			tmpnewchar = "壹" + tmpnewchar;
			break;
		case "2":
			tmpnewchar = "贰" + tmpnewchar;
			break;
		case "3":
			tmpnewchar = "叁" + tmpnewchar;
			break;
		case "4":
			tmpnewchar = "肆" + tmpnewchar;
			break;
		case "5":
			tmpnewchar = "伍" + tmpnewchar;
			break;
		case "6":
			tmpnewchar = "陆" + tmpnewchar;
			break;
		case "7":
			tmpnewchar = "柒" + tmpnewchar;
			break;
		case "8":
			tmpnewchar = "捌" + tmpnewchar;
			break;
		case "9":
			tmpnewchar = "玖" + tmpnewchar;
			break;
		}
		switch (part[0].length - i - 1) {
		case 0:
			tmpnewchar = tmpnewchar + "元";
			break;
		case 1:
			if (perchar != 0)
				tmpnewchar = tmpnewchar + "拾";
			break;
		case 2:
			if (perchar != 0)
				tmpnewchar = tmpnewchar + "佰";
			break;
		case 3:
			if (perchar != 0)
				tmpnewchar = tmpnewchar + "仟";
			break;
		case 4:
			tmpnewchar = tmpnewchar + "万";
			break;
		case 5:
			if (perchar != 0)
				tmpnewchar = tmpnewchar + "拾";
			break;
		case 6:
			if (perchar != 0)
				tmpnewchar = tmpnewchar + "佰";
			break;
		case 7:
			if (perchar != 0)
				tmpnewchar = tmpnewchar + "仟";
			break;
		case 8:
			tmpnewchar = tmpnewchar + "亿";
			break;
		case 9:
			tmpnewchar = tmpnewchar + "拾";
			break;
		}
		newchar = tmpnewchar + newchar;
	}
	if (Num.indexOf(".") != -1) {
		if (part[1].length > 2) {
			part[1] = part[1].substr(0, 2)
		}
		for (i = 0; i < part[1].length; i++) {
			tmpnewchar = ""
			perchar = part[1].charAt(i)
			switch (perchar) {
			case "0":
				tmpnewchar = "零" + tmpnewchar;
				break;
			case "1":
				tmpnewchar = "壹" + tmpnewchar;
				break;
			case "2":
				tmpnewchar = "贰" + tmpnewchar;
				break;
			case "3":
				tmpnewchar = "叁" + tmpnewchar;
				break;
			case "4":
				tmpnewchar = "肆" + tmpnewchar;
				break;
			case "5":
				tmpnewchar = "伍" + tmpnewchar;
				break;
			case "6":
				tmpnewchar = "陆" + tmpnewchar;
				break;
			case "7":
				tmpnewchar = "柒" + tmpnewchar;
				break;
			case "8":
				tmpnewchar = "捌" + tmpnewchar;
				break;
			case "9":
				tmpnewchar = "玖" + tmpnewchar;
				break;
			}
			if (i == 0)
				tmpnewchar = tmpnewchar + "角";
			if (i == 1)
				tmpnewchar = tmpnewchar + "分";
			newchar = newchar + tmpnewchar;
		}
	}
	while (newchar.search("零零") != -1)
		newchar = newchar.replace("零零", "零");
		newchar = newchar.replace("零亿", "亿");
		newchar = newchar.replace("亿万", "亿");
		newchar = newchar.replace("零万", "万");
		newchar = newchar.replace("零元", "元");
		newchar = newchar.replace("零角", "");
		newchar = newchar.replace("零分", "");
	if (newchar.charAt(newchar.length - 1) == "元" || newchar.charAt(newchar.length - 1) == "角")
		newchar = newchar + "整";
	return newchar;
}

function downloadApp(path){
	/* 
	* 智能机浏览器版本信息: 
	*/ 
	var browser={ 
			versions:function(){ 
				var u = navigator.userAgent, app = navigator.appVersion; 
				return {//移动终端浏览器版本信息 
					trident: u.indexOf('Trident') > -1, //IE内核 
					presto: u.indexOf('Presto') > -1, //opera内核 
					webKit: u.indexOf('AppleWebKit') > -1, //苹果、谷歌内核 
					gecko: u.indexOf('Gecko') > -1 && u.indexOf('KHTML') == -1, //火狐内核 
					mobile: !!u.match(/AppleWebKit.*Mobile.*/)||!!u.match(/AppleWebKit/), //是否为移动终端 
					ios: !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/), //ios终端 
					android: u.indexOf('Android') > -1 || u.indexOf('Linux') > -1, //android终端或者uc浏览器 
					iPhone: u.indexOf('iPhone') > -1 || u.indexOf('Mac') > -1, //是否为iPhone或者QQ HD浏览器 
					iPad: u.indexOf('iPad') > -1, //是否iPad 
					webApp: u.indexOf('Safari') == -1 //是否web应该程序，没有头部与底部 
				}; 
			}(), 
			language:(navigator.browserLanguage || navigator.language).toLowerCase() 
		}; 
		if(browser.versions.ios){
			window.location.href="https://itunes.apple.com/us/app/id1086548123";
		}else if(browser.versions.android){
			window.location.href=path +"/images/download/android/zgz_v1.0.apk";
		}else{
			window.location.href=path +"/images/download/android/zgz_v1.0.apk";
		}
}

/**
 * 格式化金额
 * @param s
 * @param n
 * @returns {string}
 */
function fmoney(s, n)
{
	n = n > 0 && n <= 20 ? n : 2;
	s = parseFloat((s + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";
	var l = s.split(".")[0].split("").reverse(),
		r = s.split(".")[1];
	t = "";
	for(i = 0; i < l.length; i ++ )
	{
		t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");
	}
	return t.split("").reverse().join("") + "." + r;
}