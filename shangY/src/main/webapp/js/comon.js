

$(document).ready(function() {	//tbl切换
    $(".tbl-itme li").click(function(){
		tabIndex = $(this).index();
		$(this).siblings("li").removeClass("active");
		$(this).addClass("active");
		$(".tbl-main").children(".tab-main-detail").hide();
		$(".tbl-main").children(".tab-main-detail").eq(tabIndex).show();
		});
});
$(document).ready(function(){//导航下拉
	//$.easing.def = "easeOutBounce";
	$(".dropdowmlist").click(function(e){
		//alert("00")
		$(".dropdown").fadeToggle("fast", "linear");
	})
	
});
$(function() {//进度条百分比
    $('.circle').each(function(index, el) {
        var num = $(this).find('span').text() * 3.6;
        if (num<=180) {
            $(this).find('.right').css('transform', "rotate(" + num + "deg)");
        } else {
            $(this).find('.right').css('transform', "rotate(180deg)");
            $(this).find('.left').css('transform', "rotate(" + (num - 180) + "deg)");
        };
    });

});
$(document).ready(function(e) {//底部导航
    $(".footnav li").click(function(){
		$(this).siblings("li").removeClass("active");
		 $(this).addClass("active");
		})

	$("li.sign").click(function(){
		$("span.signtext").addClass("active");
		});

});
$(document).ready(function(e) {
	$(".checkbox label").click(function(){
		$(this).siblings("label").removeClass("active");
		$(this).addClass("active");
		}); 
	$("button.btn").click(function(e) {
        $(this).toggleClass("active");
    });
	$("li.ifrom").click(function(){
		$(".info-text").toggleClass("show")
		});   
});

$(document).ready(function(){//焦点图

	$(".main_visual").hover(function(){
		$("#btn_prev,#btn_next").fadeIn()
	},function(){
		$("#btn_prev,#btn_next").fadeOut()
	});
	
	$dragBln = false;
	
	$(".main_image").touchSlider({
		flexible : true,
		speed : 200,
		btn_prev : $("#btn_prev"),
		btn_next : $("#btn_next"),
		paging : $(".flicking_con a"),
		counter : function (e){
			$(".flicking_con a").removeClass("on").eq(e.current-1).addClass("on");
		}
	});
	
	$(".main_image").bind("mousedown", function() {
		$dragBln = false;
	});
	
	$(".main_image").bind("dragstart", function() {
		$dragBln = true;
	});
	
	$(".main_image a").click(function(){
		if($dragBln) {
			return false;
		}
	});
	
	timer = setInterval(function(){
		$("#btn_next").click();
	}, 5000);
	
	$(".main_visual").hover(function(){
		clearInterval(timer);
	},function(){
		timer = setInterval(function(){
			$("#btn_next").click();
		},5000);
	});
	
	$(".main_image").bind("touchstart",function(){
		clearInterval(timer);
	}).bind("touchend", function(){
		timer = setInterval(function(){
			$("#btn_next").click();
		}, 5000);
	});
	
});
