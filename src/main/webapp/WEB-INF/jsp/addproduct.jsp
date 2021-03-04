<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
<title>Add Product</title>
</head>
<body>
<div class="col-md-8 mx-auto"> <br>
<h1 class="col-md-4 mx-auto">Add Product</h1>
<form action="addproduct" method="POST">
  <div class="form-group mb-3">
    <label for="productname">Product Name</label>
    <input type="text" class="form-control" id="productname" name="productName"  placeholder="Enter Product Name">
  </div>
  <div class="form-group mb-3">
    <label for="productprice">Product Price </label>
    <input type="text" class="form-control" id="productprice" name="productPrice" placeholder="Enter Product Price">
  </div>
  <div class="form-group mb-3">
    <label for="productdescription">Product Description </label>
    <input type="text" class="form-control" id="productdescription" name="productDescription" placeholder="Enter Product Description">
  </div>
  <div class="form-group mb-3">
    <label for="productimage">Product Image </label>
    <input type="text" class="form-control" id="productimage" name="productImage">
  </div>
   <div class="form-group mb-3">
    <label for="productcategory">Product Category </label>
    <input type="text" class="form-control" id="productcategory" name="productCategory">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>