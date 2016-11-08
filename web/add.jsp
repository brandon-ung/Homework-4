<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add an Athlete</title>
    </head>
    <body>
        <h1>Add an Athlete</h1>
        
        <form name="addForm" action="addAthlete" method="get">
            
            <label> Athlete Name : </label>
            <input type="text" name="name" value="" />
            <br>
            
            <label> Sport : </label>
            <input type="text" name="sport" value="" />
            <br>
            
            <label> Nationality : </label>
            <input type="text" name="nationality" value="" />
            <br>
            
            <label> Age : </label>
            <input type="text" name="age" value="" />
            <br>
            
            <input type="submit" name="submit" value="Submit" />
            
        </form>
    </body>
</html>
