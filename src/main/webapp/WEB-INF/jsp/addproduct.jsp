<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form action="addproduct" method="POST">
  <div class="form-group">
    <label for="productname">Product Name</label>
    <input type="text" class="form-control" id="productname" name="productName"  placeholder="Enter Product Name">
  </div>
  <div class="form-group">
    <label for="productprice">Product Price </label>
    <input type="text" class="form-control" id="productprice" name="productPrice" placeholder="Enter Product Price">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Product Quantity </label>
    <input type="number" class="form-control" id="productquantity" name="productQuantity" placeholder="Enter Product Quantity">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>