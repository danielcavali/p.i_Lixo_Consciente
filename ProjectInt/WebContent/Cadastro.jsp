<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>cadastro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/lixo.png"/>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container-cadastro">
    <div class="wrap-cadastro">
        <form class="login100-form" action="ControllerCadastro">
					<span class="login100-form-title">
						Cadastro
					</span>

            <div class="wrap-input100 ">
                <input class="input100" type="text" placeholder="Digite Seu Nome Completo" required name="nome">
                <span class="focus-input100"></span>
            </div>
            <div class="wrap-input100 ">
                <input class="input100" type="email" placeholder="Digite Seu E-mail Aqui" required name="email">
                <span class="focus-input100"></span>
            </div>
            <div class="wrap-input100">
                <input class="input100" type="text" placeholder="Digite Seu CPF Aqui" required name="cpf">
                <span class="focus-input100"></span>
            </div>
                <div class="wrap-input100 ">
                    <input class="input100" type="password" placeholder="Digite uma Senha Aqui" required name="senha">
                    <span class="focus-input100"></span>
                </div>
                <div class="wrap-input100 ">
                    <input class="input100" type="tel" placeholder="Digite Seu Telefone Aqui" required name="telefone">
                    <span class="focus-input100"></span>
                </div>
            <div class="container-login100-form-btn">
                <button class="login100-form-btn" type="submit">
                    Salvar Dados
                </button>
            </div>
            </form>
        </div>
    </div>

</body>
</html>