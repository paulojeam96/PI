<%-- 
    Document   : confirmacao_pedido
    Created on : Oct 10, 2016, 4:38:03 PM
    Author     : paulo.lima
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <p>Tipo do Documento: ${confirmacaopedido.getTipoDocumento()}</p>
    <p>Destinatario: ${confirmacaopedido.getDestinatario()}</p>    
    <p>Endereço do Destinatário: ${confirmacaopedido.getEndereco()}</p>
    <p>Remetente: ${confirmacaopedido.getRemetente()}</p>
    <p>Preço: ${confirmacaopedido.getPreco()}</p>
</head>
<body>

</body>
</html>
