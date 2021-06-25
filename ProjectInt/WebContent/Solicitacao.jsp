<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Solicitações</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/lixo.png"/>
    <!--<link rel="stylesheet" type="text/css" href="style.css">-->
    <style type="text/css" >
        * {
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }

        body, html {
            height: 100%;
            font-family: sans-serif;
        }

        .limiter {
            width: 100%;
            margin: 0 auto;
        }
        .container-login100 {
            width: 100%;
            min-height: 100vh;
            padding: 15px;
            background: #9053c7;
            background: -webkit-linear-gradient(-135deg, #c850c0, #4158d0);
            background: -o-linear-gradient(-135deg, #c850c0, #4158d0);
            background: -moz-linear-gradient(-135deg, #c850c0, #4158d0);
            background: linear-gradient(-135deg, #c850c0, #4158d0);
        }
        nav {
            float: right;
        }
        .menu{
            align-items: center;
            margin-top: 250px;
            margin-left: 360px;

        }
        .btn {
            background: #FFD700;
            background-image: -webkit-linear-gradient(top, #FFD700, #F0E68C);
            background-image: -moz-linear-gradient(top, #FFD700, #F0E68C);
            background-image: -ms-linear-gradient(top, #FFD700, #F0E68C);
            background-image: -o-linear-gradient(top, #FFD700, #F0E68C);
            background-image: linear-gradient(to bottom, #FFD700, #F0E68C);
            -webkit-border-radius: 28;
            -moz-border-radius: 28;
            border-radius: 28px;
            font-family: Georgia;
            color: #ffffff;
            font-size: 40px;
            padding: 10px 20px 10px 20px;
            text-decoration: none;
            margin: 20px;
        }

        .btn:hover {
            background: #57b846;
            text-decoration: none;
        }
        a{
            font-size: 36px;
            color: #000000;
            text-decoration:none;
        }
    </style>
    <script>
function funcao1()
{
alert("Solicitação Criada!");
}
</script>
</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="menu">   
           <form class="teste1" action="ControllerVerSolicitacao"><button  class="btn"> Ver Solicitaçao</button></form>    
             <form class="teste3" action="ControllerSolicitacao"><button onclick="funcao1()" class="btn">Nova Solicitaçao</button></form>
        </div>
    </div>
</div>
</body>
</html>