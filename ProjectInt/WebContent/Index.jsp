<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="google-signin-client_id" content="59780777661-igs6q3pnm73qv9dd8oq7fmqvarmi3iol.apps.googleusercontent.com">
    <meta name="google-signin-scope" content="profile email">
    <link rel="icon" type="image/png" href="images/img-01.png"/>
    <link rel="stylesheet" type="text/css" href="style.css">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
</head>
<body>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="images/img-01.png" alt="IMG">
            </div>

            <form class="login100-form validate-form" action="ControllerLogin">
					<span class="login100-form-title">
						Member Login
					</span>

                <div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
                    <input class="input100" type="text" name="Email" placeholder="Email">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
                </div>

                <div class="wrap-input100 validate-input" data-validate = "Password is required">
                    <input class="input100" type="password" name="Senha" placeholder="Password">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
                </div>

                <div class="container-login100-form-btn">
                    <input class="login100-form-btn" type="submit" value="Login"/>
                        
           
                </div>
               <div class="g-signin2" data-onsuccess="onSignIn"></div>
    <script>
      function onSignIn(googleUser) {
    	  
        // Useful data for your client-side scripts:
     
        var profile = googleUser.getBasicProfile();
        console.log("ID: " + profile.getId()); // Don't send this directly to your server!
        console.log('Full Name: ' + profile.getName());
        console.log('Given Name: ' + profile.getGivenName());
        console.log('Family Name: ' + profile.getFamilyName());
        console.log("Image URL: " + profile.getImageUrl());
        console.log("Email: " + profile.getEmail());
        
        if(profile != null ){
        	window.location.href="Cadastro.jsp"
        }		
        
        // The ID token you need to pass to your backend:
        var id_token = googleUser.getAuthResponse().id_token;
        console.log("ID Token: " + id_token);
        profile = null;
        
       
        
      
        
        	
        
        	
      
        
        
        
        
      }
    </script>
   
            </form>
           
        </div>
    </div>
</div>
</body>
</html>