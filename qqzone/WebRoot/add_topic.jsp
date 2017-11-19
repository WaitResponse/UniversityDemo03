<%@page contentType="text/html; charset=utf-8"%>
<html>
<head>
	<title></title>
</head>
	<body>
		<div id="div0">
			<div id="topic_div">
			  <form action="addTopic_TopicAction" method="post">
				<table class="tbl">
					<tr>
						<th>标题</th>
						<td><input type="text" name="topic.title" style="width:400px;"/></td>					
					</tr>
					<tr>
						<th>内容</th>
						<td>
							<textarea name="topic.content" style="width:400px; height:400px;"></textarea>
						</td>					
					</tr>
					<tr>
						<th colspan="2">
						<input type="submit" value="发表" style="border-radius:5px;"/>	
						<input type="reset"  value="重置" style="border-radius:5px;"/>	
						</th>	
					</tr>
				</table>
			</form>
		</div>
	</div>	
	</body>
</html>

