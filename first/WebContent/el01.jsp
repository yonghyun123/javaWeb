<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	pageContext.setAttribute("p1", "page scope value");
	request.setAttribute("r1", "request scope value");
	session.setAttribute("s1", "page scope value");
	application.setAttribute("a1", "application scope value");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	pageContext.getAttribute("p1"): <%=pageContext.getAttribute("p1")%><br>
	pageContext.getAttribute("p1"): ${pageScope.p1};<br>
	requestContext.getAttribute("r1"): ${requestScope.r1};<br>
	sessionContext.getAttribute("s1"): ${s12}; <br>
	applictionContext.getAttribute("a1"): ${applicationScope.a1};

</body>
</html>