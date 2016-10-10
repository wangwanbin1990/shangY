(
	function($)//帮助中心
	{
		$.fn.accordion = function(options)
		{
		return this.each(function() {
			var settings = $.extend(
			{
            multiExpand: false,
            slideSpeed: 200,
            dropDownIcon: '&#xe614'
         }, options );
        
			$(this).children("h1").each(
				function()
				{
					$(this).next('div').andSelf().wrapAll("<div class='accordion-item'></div>");
				}
			);
			$(this).children().children('div').addClass("accordion-content");
			$(this).find("h1").wrap("<div class='accordion-header'></div>");
			$(this).find("h1").after("<div class='accordion-header-icon'>"+settings.dropDownIcon+"</div>");
			$(this).children('.accordion-item').wrap('<div class="drawer"></div>');
			$(this).find(".accordion-header").click(
				function()
				{
					if(settings.multiExpand==false){
						if(!$(this).hasClass('accordion-header-active'))
						{
							$(this).parent().parent().parent().find(".accordion-header-active").removeClass('accordion-header-active');
							$(this).parent().parent().parent().find(".accordion-item-active").children(".accordion-content").slideUp(settings.slideSpeed);
							$(this).parent().parent().parent().find(".accordion-header-icon-active").removeClass("accordion-header-icon-active");
							$(this).parent().parent().parent().find(".accordion-item-active").removeClass("accordion-item-active");
						}
					}
					$(this).toggleClass("accordion-header-active");
					$(this).parent().toggleClass("accordion-item-active");
					$(this).next().slideToggle(settings.slideSpeed);
					$(this).children(".accordion-header-icon").toggleClass("accordion-header-icon-active");
				}
			);	
		});
		}
	}
(jQuery));