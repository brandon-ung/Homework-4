<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="athletes.css" media="screen">
        <title>Brandon Ung's Favorite Athletes</title>
    </head>
    
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>My Favorite Athletes</h1>
        
        <%= table %>
        
        <p> <a href="add"> Add an athlete </a> </p>
        
    </body>
</html>
