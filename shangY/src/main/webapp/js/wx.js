/*
 * 注意：
 * 1. 所有的JS接口只能在公众号绑定的域名下调用，公众号开发者需要先登录微信公众平台进入“公众号设置”的“功能设置”里填写“JS接口安全域名”。
 * 2. 如果发现在 Android 不能分享自定义内容，请到官网下载最新的包覆盖安装，Android 自定义分享接口需升级至 6.0.2.58 版本及以上。
 */
wx.ready(function () {
  // 1 判断当前版本是否支持指定 JS 接口，支持批量判断
    wx.checkJsApi({
      jsApiList: [
        'onMenuShareTimeline'
      ],
      success: function (res) {
      },
    });
  // 2.2 监听“分享到朋友圈”按钮点击、自定义分享内容及分享结果接口
    wx.onMenuShareTimeline({
      link: shareData,
      success: function (res) {
    	  //分享成功，做后台处理，记录分享日志
    	  $.ajax({
    			type : "post",
    			url : "http://test.gcjr.com/cxdai_wx/share/shareResult",
    			success : function(data) {
    				alert("分享成功");
    			},
    			error : function(data){
    				alert(data);
    			}
    		})
      },
      cancel: function (res) {
    	  alert("分享取消");
      },
      fail: function (res) {
        alert(JSON.stringify(res));
      }
    });
});

wx.error(function (res) {
  alert(res.errMsg);
});

function onBridgeReady(){
	 WeixinJSBridge.call('showOptionMenu');
}