<%@ page contentType="text/html;charset=utf-8"%>

<html>
	<head>
		<base href="${pageContext.request.contextPath}/">
		<link style="text/css" rel="stylesheet" href="css/common.css">
		<style>
			div0{
				height:100%;
				width:100%;
			}
			.tbl{
				width:30%;
				text-align: center;
			}
		</style>
	</head>
	<body>
		<div id="div0">
			<table class="tbl">
				<tr>
					<td><img width="80" height="80" src="${currUser.headImg}"/></td>
				</tr>
				<tr>
					<td>${currUser.nickName }</td>
				</tr>
			</table>
		</div>
		
	</body>
</html>
<!-- 

session was closed
LazyInitializedException

 -->