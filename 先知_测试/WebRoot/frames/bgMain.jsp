<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>main.jsp</title>
 <base href="${pageContext.request.contextPath}/">
<link type="text/css" rel="stylesheet"  href="css/style.css"/>
<style type="text/css">
#userType {
	margin-top: 20px;
	margin-left: 20px;
}

 .userType {
	float: left;
	display: block;
	background-color: write;
	margin-left:50px;
	
}

.userType li {
	float: left;
	width: 87px;
	height: 30px;
	border-radius: 3px;
	border: 1px solid burlywood;
	text-align: center;
	line-height: 30px;
	font-size: 15px;
	font-weight: bold;
	cursor: pointer;
}
.userType li.active{
	float: left;
	width: 87px;
	height: 30px;
	border-radius: 3px;
	border: 1px solid burlywood;
	text-align: center;
	line-height: 30px;
	font-size: 15px;
	font-weight: bold;
	cursor: pointer;
	background-color: #2B7FB5;
	color: #fff;
}
 .userType li a {
	display: block;
	width: 87px;
	height: 30px;
	text-align: center;
	line-height: 30px;
	-moz-transition: none;
	transition: background-color 0.3s linear;
	-moz-transition: background-color 0.3s linear;
	-webkit-transition: background-color 0.3s linear;
	-o-transition: background-color 0.3s linear;
}
 
.userType li :hover {
	display: block;
	background-color: #000;
	color: #fff;
	background: none repeat scroll 0% 0% rgb(43, 127, 181);
}

#userSerach {
	margin-left: 100px;
	float: left;
}

.searchUser input[type=text] {
	width: 250px;
	height: 30px;
	border: 1px solid black;
	font-size: 15px;
	font-weight: lighter;
}

.searchBtn {
	width: 80px;
	height: 32px;
	border: 1px solid;
	background-color: #3EAFE0;
}

.searchUser {
	float: left;
}

.searchUser li {
	float: left;
}

#page_div {
	width: 500px;
	height: 50px;
	text-align: center;
	float: left;
	margin-left: 240px;
}

#page_div .btn {
	width:50px;
	height:25px;
	font-size: 15px;
	background-color:orangered;
	color: black;
	margin-left:30px;
}

#page_div input[type="text"] {
	width: 40px;
	height: 50px;
	border: 0px;
	font-size: 15px;
	background-color: #FFFFFF;
	text-align: right;
}
.newlia{
	display: block;
	background-color: #000;
	color: #fff;
	background: none repeat scroll 0% 0% rgb(43, 127, 181);
}
</style>
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">

	function toPage(pageNum) {
		window.location.href = "preIndex_UserAction?currPage=" + pageNum;
	}

	function bannedUser(userid) {
		if (confirm('是否封禁此用户? ')) {
			window.location.href = " bannedAndDeblock_UserAction?user.id=" + userid;
		}
	}
	function deblockingUser(userid) {
		if (confirm('是否解封此用户?')) {
			window.location.href = " bannedAndDeblock_UserAction?user.id=" + userid;
		}
	}
	
</script>

</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="frames/bgMain.jsp">首页</a></li>
			<li><a href="frames/bgMain.jsp">用户列表</a></li>
		</ul>
	</div>

	<div id="userType">
		<ul class="userType">
			<li><a href="preIndex_UserAction?currPage=0" <c:if test="${keyword eq ''}"> class="newlia"</c:if>>全部用户</a></li>
			<li><a href="userType_UserAction?keyword=普通用户" <c:if test="${keyword eq '普通用户'}"> class="newlia"</c:if>>普通用户</a></li>
			<li><a href="userType_UserAction?keyword=大V" <c:if test="${keyword eq '大V'}"> class="newlia"</c:if>>大V用户</a></li>
			<li><a href="userType_UserAction?keyword=小编" <c:if test="${keyword eq '小编'}"> class="newlia"</c:if>>小编</a></li>
		</ul>
	</div>

	<div id="userSerach">
		<form action="preIndex_UserAction" method="post">
			<ul class="searchUser">
				<li><input name="keyword" type="text" value="${keyword }"/></li>
				<li><input type="submit" value="搜索" class="searchBtn" /></li>
			</ul>
		</form>
	</div>

	<div class="rightinfo">
		<table class="tablelist">
			<thead>
				<tr>
					<th>序号<i class="sort"><img src="images/px.gif" /></i></th>
					<th>类型</th>
					<th>昵称</th>
					<th>账号</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty userList }">
						<tr>
							<th colspan="6">暂无任何用户数据!</th>
						</tr>
					</c:when>
					<c:otherwise>
						<c:set var="index" value="0"/>
						<c:forEach items="${userList }" var="user">
						<c:set var="index" value="${index+1}"/>
							<tr <c:if test="${index%2!=0 }">bgcolor="lemonchiffon"</c:if>>
								<td>${index }</td>
								<td>${user.type}</td>
								<td>${user.nickName }</td>
								<td>${user.loginId }</td>
								<c:if test="${user.state eq '正常'}">
									<td ><font size="9pt" color="green">${user.state }</font></td>
								</c:if>
								<c:if test="${user.state eq '封禁'}">
									<td><font size="9pt" color="red">${user.state }</font></td>
								</c:if>
								
							<c:if test="${user.type != '管理员'}">
								<td><a class="tablelink" href="#">查看详情</a>
									 <c:if test="${user.state eq '正常' }">
										<a class="tablelink" onclick="bannedUser(${user.id})">封禁此用户</a>
									</c:if> 
									<c:if test="${user.state eq '封禁'}">
										<a class="tablelink" onclick="deblockingUser(${user.id})">解封此用户</a>
									</c:if>
								</td>
							</c:if>
							<c:if test="${user.type eq '管理员'}">
								<td>最高权限</td>
							</c:if>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</div>

	<!-- 获取当前页数和总页数 -->
	<c:set var="pageNum" value="${(not empty currPage) ? currPage : 1 }"
		scope="session" />
	<c:set var="pageCount" value="${(not empty pageCount) ? pageCount : 0 }" scope="session" />
	<div id="page_div">
		<input type="button" value="首页" class="btn" onclick="toPage(1)" ${ (pageNum le 1) ? "disabled" : "" } /> 
			
		<input type="button" value="上一页" class="btn" onclick="toPage(${pageNum-1})" ${ (pageNum le 1) ? "disabled" : "" } /> 
			
		<input type="text"  value="${pageNum }/${pageCount}" disabled="disabled" /> 
		
		<input type="button" value="下一页" class="btn" onclick="toPage(${pageNum+1})" ${(pageCount==pageNum) ? "disabled" : "" } /> 
			
		<input type="button" value="尾页" class="btn" onclick="toPage(${pageCount})"	${(pageCount==pageNum) ? "disabled" : "" } />
	</div>

</body>
</html>
