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
    <p style="color: black; font-size: 40px; font-family: 'Arial Black'">Endereço</p>
    <div class="wrap-cadastro" style="width: 100%; height: 500px;">
    
        <table>
            <tr>         
                <th>Cep</th>
                <th>Bairro</th>
                <th>Rua</th>
                <th>Numero</th>
                <th>Complemento</th>
            </tr>    
            <tr>
                <td>${cep}</td>
                <td>${bairro}</td>
                <td>${rua}</td>
                <td>${numero}</td>
                <td>${complemento}</td>
              
                <td><a href="CadastroEnd2.jsp"><button class="login100-form-btn">alterar</button></a></td>
                </tr>
        </table>
    </div>
</div>
</body>
</html>