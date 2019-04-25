<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="/css/first.css">
</head>
<c:choose>
<c:when test=$[mode=='MODE_HOME']>
<header>
<h3>My Application</h3>
<nav>
<ul>

<li><a href="/usersign">User</a></li>
<li><a href="/register">Register</a></li>
<li><a href="#">About us</a></li>
<li><a href="#">Contact</a></li>
</ul>
</nav>
</header>
</c:when>
<body>

<c:when test=$[mode=='MODE_LOGIN']>

<div class="container">
<div class="row">
<div class="col-md-3">
</div>
<div class="col-md-6">
 <h2>User Login</h2>
<form  method="post" class="adminform"> <br/>
<label>Username: </label>
<input type="text" name="uusername" class="textt" placeholder="Enter Username"> <br/>
<label>Password   :</label>
<input type="password" name="upassword" class="textt" placeholder="Enter Password"> <br/>
<input type="submit" value="Submit" class="btnss"> 
<input type="button" value="cancel" class="btns" onclick="window.location.href='menubar.html'"> 

</form> 
 </div>
 <div class="col-md-3"></div>
</div>
</div>

</c:when>

<c:when test=$[mode=='MODE_REGISTER']>
<div class="container">
<div class="row">
<div class="col-md-3">
</div>
<div class="col-md-6">
 <center><b class="registration">Registration Form</b></center>
 <form action="RegisterUser.jsp" method="get">
 <div class="form-group">
 <label>Username :</label>
 <input type="text" name="name" class="form-control text" placeholder="Enter User Name">
 </div>
 <div class="form-group">
 <label>Email :</label>
 <input type="text" name="email" class="form-control text" placeholder="Enter Email"></div>
 <div class="form-group">
 <label>Password :</label>
 <input type="text" name="password" class="form-control text" placeholder="Enter Password"></div>
 <div class="form-group">
 <label>Mobile No :</label>
 <input type="text" name="mobile" class="form-control text" placeholder="Enter User Mobile No">
 </div>
 <div class="form-group">
 <label>Date of Birth :</label>
 <input type="date" name="date" class="form-control text" placeholder="">
 </div><div class="form-group">
 <label>Select Gender :</label>
 <select name="gender" class="form-control text">
 <option value="Male">Male</option>
 <option value="female">Female</option>
 </select>
 </div>
 <div class="form-group">
 <label>Address :</label>
 <input type="text" name="address" class="form-control text"  placeholder="Enter full Address">
 </div>
 <div>
 <input type="submit" value="Submit" class="btn btn-danger"><input type="reset" value="Reset" class="btn btn-danger">  
 </div>
 </form>
 

 </div>
 <div class="col-md-3"></div>
</div>
</div>

</c:when>


</body>
</c:choose>





</html>