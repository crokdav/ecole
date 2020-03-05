<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=utf-8"
    pageEncoding="utf-8" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title>Insert title here</title>
</head>
<body>
<%@ include file="navabar.jsp"%>
<h1>Voici la liste des Lieux</h1>
<c:forEach items="${lieu}" var="lieux">
<h3>${lieux.adresse}</h3>
<h3>${lieux.ville}</h3>
<br>
</c:forEach>
</body>
</html>