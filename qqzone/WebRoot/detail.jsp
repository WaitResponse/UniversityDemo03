<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<base href="${pageContext.request.contextPath}/">
<link style="text/css" rel="stylesheet" href="css/common.css"></link>
<style type="text/css">
	div{
		border:0px solid red ;
	}
	.topic_detail_div{
		width:90%;
		margin-left:6%;
		border:1px solid lightgrey ;
		font-size:15px;
		background-color: snow;
		border-radius:4px;
	}
	.head{
		width:10%;
		text-align:center;
	}
	.topic_detail_div .head img{
		width:64px;
		height:64px;
	}
	.topic_title{
		width:87%;
		margin-left:5px;
		margin-top:2px;
		color:black;
	}
	.topic_content{
		width:87%;
		margin-left:5px;
		margin-top:2px;
		margin-bottom:2px;
		border-top:1px dotted gray;
	}
	.reply_list_div{
		width:88%;
		margin-left:8%;
		border:1px dotted gray;
		margin-top:10px;
		padding-top:6px;
		border-radius:4px;
	}
	.reply_div{
		width:100%;
		background-color: snow;
		margin-bottom:4px;
	}
	.reply_div .head img{
		width:48px;
		height:48px;
	}
	.reply_content{
		width:80%;
		font-size:10px;
		min-height: 25px;
	}
	.host_reply_content{
		width:70%;
		margin-left:2%;
		margin-top:10px;
		background-color: honeydew;		
	}
	
	.host_reply_content span{
		padding:4px;
		font-size:8px;
	}
</style>
<script type="text/javascript">
</script>
</head>
<body>
	<div>
		<a href="topics_TopicAction?uid=${currFriend.id}">返回日志列表</a>
	</div>
	<!-- 显示日志本身信息 -->
	<div class="topic_detail_div">
		<div class="head">
			<img src="${currFriend.headImg }"/>
			<div style="text-align:center;width:100%;">${currFriend.nickName}</div>
		</div>
		<div class="topic_title">${topic.title }</div>
		<div class="topic_content">${topic.content }</div>
	</div>
	<!-- 显示回复列表 -->
	<div class="reply_list_div">
		<c:choose>
			<c:when test="${empty topic.replies }">
				暂无回复！
			</c:when>
			<c:otherwise>
				<c:forEach items="${topic.replies}" var="reply">
					<div class="reply_div">
						<div class="head">
							<img src="${reply.author.headImg }"/>
							<div style="text-align:center;width:100%;">${reply.author.nickName }</div>
						</div>
						<div class="reply_content">
							${reply.content}
							<div id="host_del_reply_div_${reply.id}" style="float:right;">
								<span style="margin-left:2px;"><img src="imgs/del.jpg" width="16" height="16"/></span>
								<span style="display:${(empty reply.hostReply) ? "inline" : "none"};"><img src="imgs/zrhf.png" width="16" height="16" alt="主人回复" /></span>
							</div>
						</div>
						<div class="host_reply_content" style='font-size:8px;display:${(not empty reply.hostReply) ? "inline" : "none"};'>
							<c:choose>
								<c:when test="${not empty reply.hostReply}">
									<span style="float:left;">${reply.hostReply.content}</span>
									<span style="float:right;">${reply.hostReply.hostReplyDate }</span>
								</c:when>
							</c:choose>
						</div>
					</div>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>