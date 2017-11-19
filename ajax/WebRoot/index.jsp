<%@page contentType="text/html;charset=utf-8"%>
<html>
	<head>
	<script type="text/javascript">
	window.onload=function(){
		document.getElementById("li01").getElementsByTagName("li")[0].innerHTML="并不是";
	}	
	function fn1(){
		//1.创建ajax引擎对象------所有的操作的是通过引擎对象
		var xmlHttp = new XMLHttpRequest;
		
		//2.绑定监听
		xmlHttp.onreadystatechange = function(){
		if(xmlHttp.readyState==4&&xmlHttp.status==200){
				//5.接受相应数据
			var res = xmlHttp.responseText;
			alert(res);
		}		
		}
		//3.绑定地址
		xmlHttp.open("GET","zz.do",true);
		//4.发送请求
		xmlHttp.send();
	}	
	</script>
	</head>
	<body>
		<input type="button" value="异步访问服务器端" onclick="fn1()"/> 
	</body>
</html>