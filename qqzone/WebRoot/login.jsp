<%@page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title>用户登录</title>
	<link rel="stylesheet" type="text/css" href="css/common.css"/>
	<link rel="stylesheet" type="text/css" href="css/login.css"/>
	<script language="javascript" src="js/login.js"></script>
</head>
	<body>
		<div id="div0">
			<div id="login_div">
			  <form action="login_UserAction" method="post">
			  <h2 class="titleStyle">QQ空间-分享生活 留住感动</h2>
				<table class="tbl">
					<tr>
						<th>账号:</th>
						<td><input type="text" name="user.loginId"/></td>					
					</tr>
					<tr>
						<th>密码:</th>
						<td><input type="password" name="user.pwd"/></td>					
					</tr>
					<tr>
						<th colspan="2">
						<input type="submit" name="loginButton" value="登录" style="border-radius:5px;"/>	
						<a href="regist"><input type="button" name="regist" value="注册" style="border-radius:5px;"/></a>		
						</th>	
					</tr>
				</table>
			</form>
		</div>
	</div>	
	</body>
</html>

