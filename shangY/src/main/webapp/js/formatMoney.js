/**
 *格式化金额，整数部分每3位进行分割，小数部分截取2位，如：3229323.347 转换后 3,229,323.34
 */
function formatMoney(s){
	s = s + "";
	if(s.length < 1){
		return "0.00";
	}
	var index = s.indexOf(".");
	var buff1 = "";
	var buff2 = "";
	if(index > 0){
		//截取整数部分
		var str1 = "";
		if(s.indexOf("-") >= 0){
			str1 = s.substring(1,index);
			buff2 = "-";
		}else{
			str1 = s.substring(0,index);
		}
		var m = 1;
		for(var i = str1.length-1; i >= 0;i--){
			buff1 = buff1 + str1.charAt(i);
			if(i>0 && m%3==0){
				buff1 = buff1 + ",";
			}
			m = m + 1;
		}
		for(var i = buff1.length-1; i >= 0;i--){
			buff2 = buff2 + buff1.charAt(i);
		}
		buff2 = buff2 + s.substring(index,index+3);
	}else{
		buff2 = formatNumber(s)+".00";
	}
	return buff2;
}

/**
 *格式化整数，每3位进行分割
 */
function formatNumber(s){
	str1 = s + "";
	if(str1.length < 1){
		return "0";
	}
	var m = 1;
	var buff1 = "";
	var buff2 = "";
	for(var i = str1.length-1; i >= 0;i--){
		buff1 = buff1 + str1.charAt(i);
		if(i>0 && m%3==0){
			buff1 = buff1 + ",";
		}
		m = m + 1;
	}
	for(var i = buff1.length-1; i >= 0;i--){
		buff2 = buff2 + buff1.charAt(i);
	}
	return buff2;
}

/**
 * 不用千位进行分隔
 * @param s
 * @returns {String}
 */
function formatMoneyNoSplit(s){
	s = s + "";
	if(s.length < 1){
		return "0.00";
	}
	var index = s.indexOf(".");
	var buff1 = "";
	var buff2 = "";
	if(index > 0){
		//截取整数部分
		var str1 = "";
		if(s.indexOf("-") >= 0){
			str1 = s.substring(1,index);
			buff2 = "-";
		}else{
			str1 = s.substring(0,index);
		}
		var m = 1;
		for(var i = str1.length-1; i >= 0;i--){
			buff1 = buff1 + str1.charAt(i);
			if(i>0 && m%3==0){
				buff1 = buff1+"";
			}
			m = m + 1;
		}
		for(var i = buff1.length-1; i >= 0;i--){
			buff2 = buff2 + buff1.charAt(i);
		}
		buff2 = buff2 + s.substring(index,index+3);
	}else{
		buff2 = formatNumberNoSplit(s);
	}
	return buff2;
}

/**
 *格式化整数，不进行分割
 */
function formatNumberNoSplit(s){
	str1 = s + "";
	if(str1.length < 1){
		return "0";
	}
	var m = 1;
	var buff1 = "";
	var buff2 = "";
	for(var i = str1.length-1; i >= 0;i--){
		buff1 = buff1 + str1.charAt(i);
		if(i>0 && m%3==0){
			buff1 = buff1 + "";
		}
		m = m + 1;
	}
	for(var i = buff1.length-1; i >= 0;i--){
		buff2 = buff2 + buff1.charAt(i);
	}
	return buff2;
}