<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
hello~~

<%
	System.out.println("jspservice()!");
%>
<!--이부분은 jspService함수 내에 존재하는 것이 아닌 밖에 존재하는 것(ex method, field값 등등  -->
<%!
public void jspInit(){
	System.out.println("jspInit!!()!");
}

public void jspDestroy(){
	System.out.println("jspDestroy()!!!!");
}
%>
</body>
</html>