<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="/css/first.css">
</head>
<header>
<h3>Corporation</h3>


</header>
<body>
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
</body>
</html>