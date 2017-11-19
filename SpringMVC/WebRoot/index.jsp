<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head></head>
	<body>
		<table>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>address</th>
			</tr>
			<c:forEach items="${userList }" var="user">
				<tr>
					<td>${user.id }</td>
					<td>${user.name }</td>
					<td>${user.address }</td>
				</tr>	
			</c:forEach>
		</table>
	</body>
</html>