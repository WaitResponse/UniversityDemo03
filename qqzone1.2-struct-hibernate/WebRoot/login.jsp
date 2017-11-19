<%@ page contentType="text/html;charset=utf-8"%>
<html>
    <head>
        <meta charset="utf-8" />
        <title>QQ空间</title>
        <link rel="stylesheet" href="/css/login.css" />
    </head>
  
    <body>
		<div id="formContainer">
			<form id="login" method="post" action="login_UserAction">
				<input type="text" name="user.loginId" id="loginEmail" value="账号" />
				<input type="password" name="user.pwd" id="loginPass" value="密码" />
				<input type="submit"  value="登录" />
				<input type="reset" value="重置"/>
			</form>
			
			<form id="recover" method="post" action="./">
				<a href="#" id="flipToLogin" class="flipLink">Forgot?</a>
				<input type="text" name="recoverEmail" id="recoverEmail" value="Email" />
				<input type="submit" name="submit" value="Recover" />
			</form>
		</div>
        <footer>
	        <h2><i>QQ空间—</i>分享生活   留住感动</h2>
        </footer>
		<!-- <script src="http://code.jquery.com/jquery-1.7.1.min.js"></script> -->
		<script src="/js/login.js"></script>

    </body>
</html>

