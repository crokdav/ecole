<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=utf-8"
    pageEncoding="utf-8" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title>Nouveau Lieu</title>
</head>
<body>
<%@ include file="navabar.jsp"%>
<form action="/formation/ajoutlieu"method ="post">
<div>
<label>Adresse</label>
<input type="text" name ="adresse" placeholder="ajoutez une adresse">
</div>
<div>
<label>Ville</label>
<input type="text" name ="ville" placeholder="ajoutez une Ville">
</div>

<input type="submit" value="soumettre">
</form>

</body>
</html>