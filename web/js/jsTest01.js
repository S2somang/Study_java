function answer01(){
	 var num = document.getElementById("q01_num").value;
//	 console.log(parseInt(num));
	 if(isNaN(parseInt(num))){
		 alert("숫자가 아닙니다.");
	 }else{
		 alert("숫자 입니다..");
	 }
 }


function answer02(){
	var nameList = document.getElementById("nameList").innerHTML;
	console.log(nameList);
	
	var name = document.getElementsByTagName('input')[1].value;
	console.log(name);
	
	var somang = nameList.split(' ');
	
	console.log(somang);
	for(var name in somang) {
		console.log(somang[name]);
	}
}

