<%-- 
    Document   : login
    Created on : 08-Jan-2023, 02:05:17
    Author     : janto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form id="frm_login" name="frm_login" action="LoginController?accion=login" method="POST">
            <h1>LOGIN</h1>
            <span>User:</span><input type="text" name="user" id="user" value="" placeholder="Ingrese su usuario"><br/><br/>
            <span>Password:</span><input type="password" name="pwd" id="pwd" value="" placeholder="Ingrese su contrase&ntilde;a"><br/><br/>
            
           <%-- <select name="lista_modelos" id="lista_modelos">
                <option value="otros"> Otro Modelo </option>
                <option value="1"> Mazda </option>
                <option value="2"> Toyota </option>
                
            </select><br/><br/>--%>
            
            <input type="button" class="btn" name="" value="Ingresar" onclick="javascript:validar_formulario();"> 
         <!-- <input type="submit" value="Enviar Sub"> -->
          <%--<a href="Register.jsp">register</a>--%>
        </form>
        <script>
            function validar_formulario(){
                var u = document.frm_login.user.value;
                var p = document.frm_login.pwd.value;
                if(u==="" || p === "" ){
                    alert("Ingrese su usuario y contraseña");
                }else{
                    document.frm_login.submit();
                }
            }
        </script>
        
    </body>
</html>
