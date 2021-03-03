<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Search Results</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
<a href="/home"> <i class="fa fa-long-arrow-left"></i><span
		class="ml-2">Continue Shopping</span>
	</a>
	</nav>
<div class="d-flex flex-row">
  <div class="card" style="width: 18rem;">
  <img src="${products.productImage}" class="card-img-top" alt="..." width="40">
  <div class="card-body">
    <h5 class="card-title">${products.productName}</h5>
    <p class="card-text">${products.productDescription}</p>
    <p class="card-text">$ ${products.productPrice}0</p>
    <form action="searchresults" method="POST">
    <input type="hidden" value="${products.productName}" name="productName">
    <input type="hidden" value="${products.productDescription}" name="productDescription">
    <input type="hidden" value="${products.productImage}" name="productImage">
    <input type="hidden" value="${products.productPrice}" name="productPrice">
    <button type="submit" class="btn btn-primary">Add To Cart</button>
    </form>
  </div>
  
</div>
</div>
</body>
</html>