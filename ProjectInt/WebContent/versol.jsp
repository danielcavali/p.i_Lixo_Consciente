<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Endereços</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/lixo.png"/>
    <link rel="stylesheet" type="text/css" href="style.css">
    <%@ page import ="Models.Endereco" %>
</head>
<body>
<div class="container-cadastro">
    <p style="color: black; font-size: 40px; font-family: 'Arial Black'">Solicitação</p>
    <div class="wrap-cadastro" style="width: 100%; height: 500px;">
    
        <table>
            <tr>         
                
                <th>Data</th>
                <th>Situação</th>
                <th>Cep</th>
            </tr>    
            <tr>
                
                <td>${data}</td>
                <td>${situ}</td>
                <td>${cep}</td>
              
                <td><form class="teste5" action="ControllerSolicitacaoATT"><button class="login100-form-btn" >Cancelar Solicitação</button></form></td>
                </tr>
        </table>
    </div>
</div>
</body>
</html>