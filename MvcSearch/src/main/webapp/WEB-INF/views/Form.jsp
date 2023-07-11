<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  </head>
  <body>
    
    <form action="form" method="post" >
    <div class="container mx-auto mt-5">
     <div class="form-group">
     
     <div class="alert alert-danger" role="alert">
  	<form:errors path="student.*"/>
</div>

    <label for="exampleInputEmail1">Name:</label>
    <input type="text" class="form-control" name="name" aria-describedby="emailHelp" placeholder="Name">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">ID:</label>
    <input type="text" class="form-control" name="id" aria-describedby="emailHelp" placeholder="Id">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">DOB:</label>
    <input type="date" name="date" class="form-control" placeholder="dd/mm/yy" name="dob" aria-describedby="emailHelp">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Courses:</label>
  	<select  class="form-control" name="courses" multiple>
  	<option>Java</option>
  	<option>Python</option>
  	<option>C</option>
  	<option>C++</option>
  	</select>
  </div>
    
  <div class="form-check">
  <input class="form-check-input" value="male"type="radio" name="gender" id="flexRadioDefault1">
  <label class="form-check-label" for="flexRadioDefault1">
   Male
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" value="female"  name="gender" id="flexRadioDefault2" checked>
  <label class="form-check-label" for="flexRadioDefault2">
   Female
  </label>
</div>

  <div class="form-group">
    <label for="exampleInputEmail1">Student Type:</label>
  	<select  class="form-control" name="type" >
  	<option value="oldstudent">Old Student</option>
  	<option value="normalstudent">Normal Student</option>
  	</select>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
    </div>
 
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  </body>
</html>