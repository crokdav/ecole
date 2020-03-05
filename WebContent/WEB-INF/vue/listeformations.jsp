<%@ page language="java" contentType="text/html; charset=ISO-8859-1; charset=utf-8"
    pageEncoding="utf-8" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%>;</style>
<title> Lieu</title>
</head>
<body>
<%@ include file="navabar.jsp"%>
<form class="form-inline" action="/formation/showformas"method ="post">
<div>
<label class="my-1 mr-2" for="inlineFormCustomSelectPref">Choisir une Ville</label>
<select name ="idLieu"class="custom-select my-1 mr-sm-2" id="inlineFormCustomSelectPref">
<c:forEach items="${lieu}" var="li">
<option value="${li.idLieu}">${li.ville}</option>
</c:forEach>
</select>
<button type="submit" class="btn btn-primary my-1">Soumettre</button>
</div>
</form>
<div>
<c:forEach items="${lieuF}" var="lie">
<h3>La Formation ${lie.theme}</h3>
</c:forEach>
</div>

</body>
</html>