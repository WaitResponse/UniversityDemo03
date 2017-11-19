<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<head>
		<base href="${pageContext.request.contextPath}/">
		<style type="text/css">
			div{
				float:left;
				position:relative;
				border:0px solid red ;
			}
			body{
				background-color: darkgray;
			}
			#div0{
				width:70%;
				margin-left:15%;
				height:100%;
				background-image: url(imgs/61958PICJDB_1024.jpg);
			}
			#div_top{
				width:100%;
				height:20%;
			}
			#div_top iframe{
				
			}
			#div_left{
				width:20%;
				height:80%;
			}
			#div_left iframe{
				
			}
			#div_main{
				width:80%;
				height:70%;
			}
			#div_main iframe{
				
			}
			#div_bottom{
				width:80%;
				height:10%;
			}
			#div_bottom iframe{
				
			}
		</style>
	</head>
	<body>
		<div id="div0">
			<div id="div_top">
				<iframe src="frames/top.jsp" frameborder="0" width="100%" height="100%"></iframe>
			</div>
			<div id="div_left">
				<iframe src="frames/left.jsp" frameborder="0" width="100%" height="100%"></iframe>
			</div>
			<div id='div_main'>
				<iframe src="frames/main.jsp" name="main" frameborder="0" width="100%" height="100%"></iframe>
			</div>
			<div id="div_bottom">
				<iframe src="frames/bottom.jsp" frameborder="0" width="100%" height="100%"></iframe>
			</div>
		</div>
	</body>
</html>