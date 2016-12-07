<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="athletes.css" media="screen">
        <title>Add an Athlete</title>
    </head>
    <body>
        <h1>Add an Athlete</h1>
        
        <form name="addForm" action="addAthlete" method="get">
            
            <table>
                <tr>
                    <td> <label> Athlete Name : </label> </td>
                    <td> <input type="text" name="name" value="" size="30" /> </td>
                </tr>
            
                <tr>
                    <td> <label> Sport : </label> </td>
                    <td> <input type="text" name="sport" value="" size="30" /> </td>
                </tr>
            
                <tr>
                    <td> <label> Nationality : </label> </td>
                    <td> <input type="text" name="nationality" value="" size="30" /> </td>
                </tr>
            
                <tr> 
                    <td> <label> Age : </label> </td>
                    <td> <input type="text" name="age" value="" size="30"/> </td>
                </tr>
            
            </table>
            
            <div id="buttons">
            <input type="submit" name="submit" value="Submit" />
            </div>
        </form>
    </body>
</html>
