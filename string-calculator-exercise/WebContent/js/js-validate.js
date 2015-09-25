//1.Create a simple String calculator with a method int Add(string numbers)
function add(str){
	if(str===""){
	  return 0;
	}
	var arrNum = str.split(',');
	var sum = 0;
	if(arrNum.length==1) {
		return arrNum[0];
	}
	else{
		sum =parseInt(arrNum[0])+parseInt(arrNum[1]);
		return sum;
	}
}
//2.Allow the Add method to handle an unknown amount of numbers
function addUnknownAmount(str){
	if(str===""){
	  return 0;
	}
	var arrNum = str.split(',');
	if(arrNum.length===0)
	   return 0;
	 else if(arrNum.length==1)
	   return parseInt(arrNum[0]);
	var sum = 0;
	for (var i = 0; i < arrNum.length; i++) {
		sum += parseInt(arrNum[i]);
	}
	return sum;
}

//3. Allow the Add method to handle new lines between numbers (instead of commas).
function addWithNewLine(str){
	var arrNum = str.split("\n");
	var sum = 0;
	for (var i = 0; i < arrNum.length; i++) {
		sum += parseInt(arrNum[i]);
	}
	return sum;
}

function checkString(str){
	if(str.indexOf(',\n')){
	  alert("Input \",\\n\" is not allow ");
	  return false;
	}
	return true;
}

//4. Support different delimiters
function addWithDelimiter(str){	
    var arrNum = str.match(/(\d+)/g);
	var sum = 0;
	for (var i = 0; i < arrNum.length; i++) {
		sum += parseInt(arrNum[i]);
	}
	return sum;
}

//5. Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message
function addWithNegative(str){	
    var arrNum = str.match(/-?\d+/g);
	var sum = 0;
	for (var i = 0; i < arrNum.length; i++) {
		sum += parseInt(arrNum[i]);
	}
	return sum;
}

function output(res,appendcl){
		var outp="<span>"+res+"</span>";
		$(outp).appendTo(appendcl);
}

//main function
$(document).ready(function() {
		//1
	$("#btn-add1").click(function() {		
	    $('.ans01').empty();
		var str = $.trim($("#txt-input1").val());
		var sum =add(str);
		output(sum,'.ans01');
	});
	
	//2
	$("#btn-add2").click(function() {
		$('.ans02').empty();
		var str = $.trim($("#txt-input2").val());
		var sum =addUnknownAmount(str);
		output(sum,'.ans02');
	});
	
	//3
	$("#btn-add3").click(function() {
		$('.ans03').empty();
		var str = $.trim($("#txt-mul-input").val());
		if(checkString(str)===false)
		  return 0;
		var sum =addWithNewLine(str);
		output(sum,'.ans03');
	});
	
	//4
	$("#btn-add4").click(function() {
		$('.ans04').empty();
		var str = $.trim($("#txt-mul-input2").val());
		var sum =addWithDelimiter(str);
		output(sum,'.ans04');
	});
	
	//5
	$("#btn-add5").click(function() {
		$('.ans05').empty();
		var str = $.trim($("#txt-input3").val());
		var sum =addWithNegative(str);
		output(sum,'.ans05');
	});
});
