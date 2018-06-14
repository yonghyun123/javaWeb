<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="score" scope="request" value="83"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${score >= 90 }">
A학점입니다.
</c:when>
<c:when test="${score >= 80 }">
B학점입니다.
</c:when>
<c:when test="${score >= 70 }">
C학점입니다.
</c:when>
<c:otherwise>F입니다.</c:otherwise>
</c:choose>

</body>
</html>