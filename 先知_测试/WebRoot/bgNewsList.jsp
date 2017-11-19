<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>news_index.jsp</title>
 <base href="${pageContext.request.contextPath}/">
<link type="text/css" rel="stylesheet"  href="css/style.css"/>
<style type="text/css">
#newsType {
	width:500px;
	height:50px;
	margin-top: 20px;
	margin-left: 30px;
}

 .newsType {
	float: left;
	display: block;
	background-color: write;
	margin-left:50px;	
}

.newsType li {
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
.newsType li.active{
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
 .newsType input[type="submit"] {
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
 
.newsType li :hover {
	display: block;
	background-color: #000;
	color: #fff;
	background: none repeat scroll 0% 0% rgb(43, 127, 181);
}

#newsSearch {
	width:350px;
	height:50px;
	margin-left: 500px;
	margin-top:-35px;
	float: left;
	text-align:center;
}
#newsSearch ul li{
	float:left;
}
.searchBtn {
	width: 80px;
	height: 32px;
	border: 1px solid;
	background-color: #3EAFE0;
}

#newsSearch ul li input[type=text] {
	width: 250px;
	height: 30px;
	border: 1px solid black;
	font-size: 15px;
	font-weight: lighter;
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
	background-color: #000;
	color: #fff;
	background: none repeat scroll 0% 0% rgb(43, 127, 181);
}
.newsClassify{
	width:100px;
	height:30px;
	float:left;
	margin-left:20px;
	text-align:center;
	border: 1px solid burlywood;
}
.newsTable{
	padding:8px;
	margin-left:50px;
	margin-top:-50px;
}
</style>
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
	function toPage(pageNum) {
		window.location.href = "getNewsList_NewsAction?currPage=" + pageNum;
	}
	function delNews(newsId){
		if(confirm("是否确认删除？")){
			window.location.href="delNews_NewsAction?news.id=" + newsId ;
		}

	}
</script>
</head>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="frames/bgMain.jsp">首页</a></li>
			<li><a href="bgNewsList.jsp">新闻列表</a></li>
		</ul>
	</div>
	
	<div id="newsType">
	 <form action="getNewsList_NewsAction" method="post">	 
	 	<div class="sort">
			<ul class="newsType">
			<li><input type="submit" name="timeSort" value="最新时间排序" <c:if test="${timeSort eq '最新时间排序'}"> class="newlia"</c:if> /></li>	
			<li><input type="submit" name="timeSort" value="最早时间排序"<c:if test="${timeSort eq '最早时间排序'}"> class="newlia"</c:if>/></li>
			</ul>		
		 <select class="newsClassify" name="classifyId">
		 	<option value="0">全部</option>
            <c:forEach var="classify" items="${classifyList }">                       
                <option  value="${classify.id }" >
                ${classify.name } 
                </option>                
            </c:forEach>
		 </select> 
	</div>
	<div id="newsSearch">	
		<ul>
			<li><input name="keyword" type="text"  value="${keyword }"/></li>
			<li><input type="submit" value="搜索" class="searchBtn" /></li>
		</ul>		
	</div>
</form>
</div>
	<div class="newsTable">
		<table class="tablelist">
			<thead>
				<tr>
					<th>序号</th>
					<th>标题</th>
					<th>分类</th>
					<th>日期</th>
					<th>作者</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${empty newsList1 }">
						<tr>
							<th colspan="6">暂无任何新闻!</th>
						</tr>
					</c:when>
					<c:otherwise>
						<c:set var="index" value="0"/>
						<c:forEach items="${newsList1 }" var="news">
						<c:set var="index" value="${index+1}"/>
							<tr <c:if test="${index%2!=0 }">bgcolor="lemonchiffon"</c:if>>
								<td>${index }</td>
								 <td>${news.title}</td> 
								<td>${news.classify.name }</td>
								<td>${news.date }</td>						
								<td >${news.author.nickName }</td>	
								<td>
									<a class="tablelink" href="#">查看详情</a>
									<a class="tablelink" onclick="delNews(${news.id})"><font size="9pt" color="red">删除</font></a>
								</td>
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
