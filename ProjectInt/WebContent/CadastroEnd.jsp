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
        <form class="login100-form" action="ControllerCadastroEnd">
					<span class="login100-form-title">
						Cadastro
					</span>
            <div class="wrap-input100 ">
                <input class="input100" type="text" placeholder="Digite Seu cep Aqui" required name="cep">
                <span class="focus-input100"></span>
            </div>
            <div class="wrap-input100 ">
                <input class="input100" type="text" placeholder="Digite Seu Bairro Aqui" required name="bairro">
                <span class="focus-input100"></span>
            </div>
            <div class="wrap-input100 ">
                <input class="input100" type="text" placeholder="Digite Sua Rua Aqui" required name="rua">
                <span class="focus-input100"></span>
            </div>
            <div class="wrap-input100 ">
                <input class="input100" type="text" placeholder="Digite o Numero Aqui" required name="numero">
                <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 ">
                <input class="input100" type="text" placeholder="Digite um Complemeto Aqui" name="complemento">
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
