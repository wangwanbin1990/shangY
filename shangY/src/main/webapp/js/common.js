// JavaScript Document
var net={};
net.tab={};
if (typeof($) == 'undefined') {
  $ = function(elem) {
    if (arguments.length > 1) {
      for (var i = 0, elems = [], length = arguments.length; i < length; i++)
        elems.push($(arguments[i]));
      return elems;
    }
    if (typeof elem == 'string') {
      return document.getElementById(elem);
    } else {
    	return elem;
    }
  };
}
//按钮点击时事件
net.tab.objSelect=function(clickobj,obj,elems){
	for(var i=0;i<obj.length;i++)
	{
		obj[i].className="";
		elems[i].style.display="none";
	}
	clickobj.className="selected";
	elems[clickobj.getAttribute("name")].style.display="";
}
//初始话按钮状态
net.tab.menuEvent=function(elem,num){
	var objs=$(elem).getElementsByTagName("li");
	var conobjs=$(elem+"-content").getElementsByTagName("div");
	objs[num].className="selected";
	conobjs[num].style.display="";
	net.tab.addEvent(objs,function (){
		net.tab.objSelect(this,objs,conobjs);
	});
}
//添加按钮事件
net.tab.addEvent=function(elems,fun){
	for (var i=0;i<elems.length;i++)
	{
		elems[i].setAttribute("name",i);
		elems[i].onclick=fun;
	}
}
window.onload=function(){
	net.tab.menuEvent("nav",0)
}

$(function(){//产品介绍
	$(".moredown").click(function(){
		$('.pro-con').removeClass('hh'); 
		$('.moredown').css('display','none'); 
		$('.moreup').css('display','inline-block'); 
		//$(".pro-con").toggle("");
//$('.moreup').css('display','inline-block'); 
		});
	$(".moreup1").click(function(){
		//$(".link-more .more").toggle("");
		$('.pro-con1').addClass('hh'); 
		$('.moreup1').css('display','none'); 
		$('.moredown1').css('display','inline-block'); 
		});
	$(".moredown1").click(function(){
		$('.pro-con1').removeClass('hh'); 
		$('.moredown1').css('display','none'); 
		$('.moreup1').css('display','inline-block'); 
		//$(".pro-con").toggle("");
//$('.moreup').css('display','inline-block'); 
		});
	$(".moreup").click(function(){
		//$(".link-more .more").toggle("");
		$('.pro-con').addClass('hh'); 
		$('.moreup').css('display','none'); 
		$('.moredown').css('display','inline-block'); 
		});
});
