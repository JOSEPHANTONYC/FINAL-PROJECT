<%-- 
    Document   : Customer_bookService
    Created on : 14-Jan-2023, 16:50:26
    Author     : janto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <span class="h1">CAR DETAILS</span> <a class="btn btn-danger" href="CustomerController?accion=mainPage">MAIN PAGE</a>
        <a class="btn btn-success" href="CustomerController?accion=log_out">LOG OUT</a><br/>
        
        <form  name="frm_customer" id="frm_customer" action="CustomerController?accion=saveBook" method="POST" >
        <h1>Enter data</h1>
        <span>TYPE OF VEHICLE:</span>
        <select name="type" id="type">
            <option value=1">Option 1</option>
            <option value=2">Option 2</option>
            <option value=3">Option 3</option>
            <option value="0">Otros</option>
        </select><br/><br/>
            
            <span>VEHICLE MAKE:</span>
            <select name="make" id="make">
                <option value=1">Option 1</option>
                <option value=2">Option 2</option>
                <option value=3">Option 3</option>
                <option value="0">Otros</option>
            </select><br/><br/><br/><br/>
            <span>MODEL VEHICLE:</span>
            <select name="model" id="model">
                <option value=1">Option 1</option>
                <option value=2">Option 2</option>
                <option value=3">Option 3</option>
                <option value="0">Otros</option>
            </select><br/><br/><br/><br/>
            <span>LICENSE DETAILS:</span><input type="text" name="license" id="license" value="" placeholder="enter your license"><br/><br/>
            <span>ENGINE:</span>
            <select name="engine" id="engine">
                <option value=1">Option 1</option>
                <option value=2">Option 2</option>
                <option value=3">Option 3</option>
                <option value="0">Otros</option>
            </select><br/><br/><br/><br/>
             
            <span>COMMENT OR DESCRIPTION:</span><input type="text" name="coment" id="coment" value="" placeholder="enter a coment"><br/><br/>
            
             <input type="button" class="btn" name="" value="SAVE BOOKING" onclick="javascript:validar_formulario();"> 
            <!-- <input type="submit" value="Register"> -->
        </form>  
         <script>
            function validar_formulario(){
                var name = document.frm_customer.name.value;
                var surname = document.frm_customer.surname.value;
                var birth = document.frm_customer.birth.value;
                var phone = document.frm_customer.phone.value;
                var email = document.frm_customer.email.value;
                if(name==="" || surname === "" || birth==="" || phone === "" || email==="" ){
                    alert("Debe ingresar todos los datos!!!");
                }else{
                    document.frm_customer.submit();
                }
            }
        </script>
        
        
        
        
    </body>
</html>
