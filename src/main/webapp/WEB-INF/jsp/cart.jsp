<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="stylesheet.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Shopping Cart</title>
</head>
<body>
	<div class="container mt-5 p-3 rounded cart">
		<div class="row no-gutters">
			<div class="col-md-8">
				<div class="product-details mr-2">
					<div class="d-flex flex-row align-items-center">
						<a href="/home">
						<i class="fa fa-long-arrow-left"></i><span class="ml-2">Continue
							Shopping</span>
							</a>
					</div>
					<hr>
					<h6 class="mb-0">Shopping cart</h6>
					<div class="d-flex justify-content-between">
						<span>You have ${products.stream().map(product -> product.productName).count()} items in your cart</span>
						<div class="d-flex flex-row align-items-center">
							<span class="text-black-50">Sort by:</span>
							<div class="price ml-2">
								<span class="mr-1">price</span><i class="fa fa-angle-down"></i>
							</div>
						</div>
					</div>
					<c:forEach items="${products}" var="product">
						<div
							class="d-flex justify-content-between align-items-center mt-3 p-2 items rounded">
							<div class="d-flex flex-row">
								<img class="rounded" src="${product.productImage}" width="40">
								<div class="ml-2">
									<span class="font-weight-bold d-block">${product.productName}</span><span
										class="spec">${product.productDescription}</span>
								</div>
							</div>
							<div class="d-flex flex-row align-items-center">
								<span class="d-block">1</span><span
									class="d-block ml-5 font-weight-bold">$ ${product.productPrice}0</span><i
									class="fa fa-trash-o ml-3 text-black-50"></i>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
			<div class="col-md-4">
				<div class="payment-info">
					<div class="d-flex justify-content-between align-items-center">
						<span>Card details</span>
					</div>
					<span class="type d-block mt-3 mb-1">Card type</span><label
						class="radio"> <input type="radio" name="card"
						value="payment" checked> <span><img width="30"
							src="https://img.icons8.com/color/48/000000/mastercard.png" /></span>
					</label> <label class="radio"> <input type="radio" name="card"
						value="payment"> <span><img width="30"
							src="https://img.icons8.com/officel/48/000000/visa.png" /></span>
					</label> <label class="radio"> <input type="radio" name="card"
						value="payment"> <span><img width="30"
							src="https://img.icons8.com/ultraviolet/48/000000/amex.png" /></span>
					</label> <label class="radio"> <input type="radio" name="card"
						value="payment"> <span><img width="30"
							src="https://img.icons8.com/officel/48/000000/paypal.png" /></span>
					</label>
					<div>
						<label class="credit-card-label">Name on card</label><input
							type="text" class="form-control credit-inputs" placeholder="Name">
					</div>
					<div>
						<label class="credit-card-label">Card number</label><input
							type="text" class="form-control credit-inputs"
							placeholder="0000 0000 0000 0000">
					</div>
					<div class="row">
						<div class="col-md-6">
							<label class="credit-card-label">Date</label><input type="text"
								class="form-control credit-inputs" placeholder="mm/yy">
						</div>
						<div class="col-md-6">
							<label class="credit-card-label">CVV</label><input type="text"
								class="form-control credit-inputs" placeholder="CVV">
						</div>
					</div>
					<hr class="line">
					<div class="d-flex justify-content-between information">
						<span>Subtotal</span><span>$ ${products.stream().map(product -> product.productPrice).sum()}0</span>
					</div>
					<div class="d-flex justify-content-between information">
						<span>Shipping</span><span>Free</span>
					</div>
					<div class="d-flex justify-content-between information">
						<span>Total(Incl. taxes)</span><span>$ ${products.stream().map(product -> product.productPrice).sum()}0</span>
					</div>
					<a href="/checkout"
						class="btn btn-primary btn-block d-flex justify-content-between mt-3"
						type="button"><span>$ ${products.stream().map(product -> product.productPrice).sum()}0</span><span>Checkout<i
							class="fa fa-long-arrow-right ml-1"></i></span></a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>