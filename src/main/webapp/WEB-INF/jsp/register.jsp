<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action='registersuccessful' method = 'POST'>  
        <div class="container">     
            <label>Register Username : </label>   
            <input type="text" placeholder="Register Username" name="userName" required>  
            <label>Register Password : </label>   
            <input type="password" placeholder="Register Password" name="userPassword" required>  
            <button type="submit">Register</button>     
        </div>   
    </form>  
</body>
</html>