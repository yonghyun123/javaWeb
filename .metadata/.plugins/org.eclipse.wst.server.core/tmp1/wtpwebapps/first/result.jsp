<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int val1 = (Integer)request.getAttribute("v1");
		int val2 = (Integer)request.getAttribute("v2");
		int result = (Integer)request.getAttribute("result");
	%>
	<%=val1 %>+<%=val2 %> = <%=result %> 
</body>
</html>