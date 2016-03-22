<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="${pageContext.request.contextPath }/user/Regis.do" modelAttribute="userInfo">
		用户名：<form:input path="userName" />
				<br>
		密 码：<form:password path="password" />
				<br>
		Email：<form:input path="email" />
				<br>
		<input type="submit" value="注册" name="testSubmit" />
		<input type="reset" value="重置" />
	</form:form>
</body>
</html>