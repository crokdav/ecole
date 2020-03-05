<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title>Nouvelle Formation</title>
</head>
<body>
<%@ include file="navabar.jsp"%>
<form action="/formation/AjoutFormation"method ="post">
<div>
<label>Nom</label>
<input type="text" name ="theme" placeholder="ajoutez un thème">
</div>
<div>
<label>Lieu</label>
<select name=idLieu>
<c:forEach items="${lieu}" var="lieux">
<option value="${lieux.idLieu}">${lieux.ville}</option>
</c:forEach>
</select>
</div>
<input type="submit" value="soumettre">
</form>

</body>
</html>