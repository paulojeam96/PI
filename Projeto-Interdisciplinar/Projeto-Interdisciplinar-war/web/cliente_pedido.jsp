<%-- 
    Document   : cliente_pedido
    Created on : Oct 10, 2016, 3:24:35 PM
    Author     : paulo.lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="FrontController" method="POST">
            <p><h1>Fazer pedido</h1></p>
            <p>Tipo do Documento: 
                <select name="documento">

                    <option>
                    <p>Documento Confidencial</p>
                    </option>
                    <option>
                    <p>Documento Simples</p>
                    </option>

                </select>

            </p>
            <p>Destinatario: <input type="text" name="destinatario"/></p>    
            <p>Endereço do Destinatário: <input type="text" name="end"/></p>
            <p>Remetente: <input type="text" name="remetente"/></p>
            <p><input type="submit" value="Solicitar Entrega"/></p>
            <p><input type="hidden" name="command" value="Pedido"</p>
        </form>

</body>
</html>
