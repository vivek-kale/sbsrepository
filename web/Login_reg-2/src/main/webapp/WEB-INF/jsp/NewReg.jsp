<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" type="text/css" href="NewFile.css">


</head>


<header>
<h3>My Application</h3>
</header>
<body>
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

</body>
</html>