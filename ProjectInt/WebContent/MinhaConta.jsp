<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Minha Conta</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/lixo.png"/>
    <link rel="stylesheet" type="text/css" href="style.css">
    <%@ page import ="Models.Cliente" %>
</head>
<body>
<div class="container-cadastro">
    <div class="wrap-cadastro">
        <form class="login100-form" action="ControllerConta">
					<span class="login100-form-title">
						Minha Conta
					</span>

                <div class="wrap-input100 ">
                    <input class="input100" type="text" placeholder="Nome Completo" required name="nome">
                    <span class="focus-input100"></span>
                </div>
                 <div class="wrap-input100">
                    <input class="input100" type="text" placeholder="CPF" required name="cpf">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 ">
                    <input class="input100" type="email" placeholder=" E-mail" required name="email">
                    <span class="focus-input100"></span>
                </div>
               <div class="wrap-input100 ">
                    <input class="input100" type="tel" placeholder="Telefone" required name="telefone">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 ">
                    <input class="input100" type="password" placeholder="Senha" required name="senha">
                    <span class="focus-input100"></span>
                </div>
                

            <div class="container-login100-form-btn">
                <button class="login100-form-btn" style="margin-bottom:10px; ">
                    Salvar Alteraçoes
                </button>
            </div>
        </form>
        <button class="login100-form-btn" onclick="window.location.href = 'https://www.google.com/accounts/Logout?continue=https://appengine.google.com/_ah/logout?continue=http://localhost:8034/ProjectInt/Index.jsp'" style="background-color: red">
            Encerrar Sessão
        </button>
       
    </div>
</div>

</body>
</html>