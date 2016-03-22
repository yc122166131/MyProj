<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.tbl{margin-top:100px;}
</style>
</head>
<body>


	<form:form action="" commandName="edit_user" method="post">
		
			<form:input path="userName"/><br/>
			<form:input path="email"/><br/>
			
	</form:form>
	
	
		
	<!--  
	empEdit ${id}
	
	
		<table cellpadding="10" cellspacing="5" border="1" align="center" class="tbl">
				<tr>
					<th align="left">编号</th>
					<th align="left">用户名</th>
					<th align="left">电子邮箱</th>
					<shiro:hasRole name="admin">
						<th>修改</th>
						<th>删除</th>
					</shiro:hasRole>
				<tr>
				<c:forEach var="userInfo" items="${userInfo}">
					<tr>
						<td >${userInfo.id }</td>
						<td >${userInfo.userName }</td>
						<td >${userInfo.email }</td>
						<shiro:hasRole name="admin">
							<td ><a href="/user/empEdit.do?id=${userInfo.id }">Edit</a></td>
							<td ><a href="#">Delete</a></td>
						</shiro:hasRole>
					</tr>
				</c:forEach>
			
		</table>
		
		-->
	
</body>
</html>