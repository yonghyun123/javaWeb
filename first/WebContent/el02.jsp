<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setAttribute("k", 10);
	request.setAttribute("m", true);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	k: ${k }; <br>
	<br> k+5 : ${k+5 };
	<br> k-5 : ${k-5 };
	<br> k*5 : ${k*5 };
	<br> k/5 : ${k/5 };
	<br>
k: ${k }; <br>
m: ${m }<br>

</body>
</html>