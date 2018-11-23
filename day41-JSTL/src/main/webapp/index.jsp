<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="Hello! Welcome To JSTL"></c:out>

<c:set var="num" value="-100" scope="session"></c:set>
<h1><c:out value="${num }"></c:out> </h1>
<c:if test="${num lt 0 }">
	<h2>Negative Value</h2>
</c:if>

<c:if test="${num gt 0 }">
	<h2>Positive Value</h2>
</c:if>

<!-- begin="1"  end="50" step="2"  -->

<c:forEach items="{12,45,67}"  var="i">
	<c:out value="${i}"></c:out>
</c:forEach>

<c:redirect url="success.jsp"></c:redirect>









</body>
</html>