<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>menu</title>
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
        #user-photo {
            width: 45px;
            height: 45px;
            border-radius: 50%;
            display: block;
            margin: 0 auto 10px auto;
            float: left;
            margin-right: 10px;
        }
        .minha-conta{
            background-color: rgba(192,192,192,0.5);
            border-radius: 28px;
            padding: 9px;
        }
    </style>
</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <nav class="nav"><div class="minha-conta"><img id="user-photo" src="images/user.png"><a href="MinhaConta.jsp">Minha conta</a></div> </nav>
    <div class="menu">
        <a href="Solicitacao.jsp"><button class="btn">Solicitações</button></a>
        <!-- <a href="Endereco.jsp">--><form class="teste" action="ControllerEndereco"><button class="btn">Endereços</button></form>
    </div>
    </div>
</div>
</body>
</html>
<!-- script para recuperar dados js -->
<!-- <script>
      function onSignIn(response) {
            // Conseguindo as informações do seu usuário:
            var perfil = response.getBasicProfile();

            // Conseguindo o ID do Usuário
            var userID = perfil.getId();

            // Conseguindo o Nome do Usuário
            var userName = perfil.getName();

            // Conseguindo o E-mail do Usuário
            var userEmail = perfil.getEmail();

            // Conseguindo a URL da Foto do Perfil
            var userPicture = perfil.getImageUrl();

            document.getElementById('user-photo').src = userPicture;
            document.getElementById('user-name').innerText = userName;
            document.getElementById('user-email').innerText = userEmail;

            // Recebendo o TOKEN que você usará nas demais requisições à API:
            var LoR = response.getAuthResponse().id_token;
            console.log("~ le Tolkien: " + LoR);
        };
    </script>

-->