<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
   <link href="<c:url value="/resources/css/style.css"/>">
  <link href="<c:url value="/resources/js/script.js"/>">
  </head>
  <body>
    
    <form action="search">
    <div class="container mx-auto mt-5">
     <div class="form-group">
     <h1>Dil</h1>
    <label for="exampleInputEmail1">Search:</label>
    <input type="text" class="form-control" name="querybox" aria-describedby="emailHelp" placeholder="Search Here">
  </div>
  <button class="btn btn-primary">Search</button>
</form>
    </div>
 
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  </body>
</html>