

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>*
      <link rel="stylesheet" href="/chemin/vers/fontawesome/css/all.min.css">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha384-oCEkGTXDExWJLg9Rk5FpGrzUS3bJqZ8Jwq5FvVqkrdA18Bj4lPUOqogFJJwS8DXeH" crossorigin="anonymous">



</head>
<body>
 
 <jsp:include page="index.html" />

<div class="container" id="container">
	<div class="form-container sign-up-container">
		<form action="Inscription" method="POST">
			<h1>Create Account</h1>
                        
		<div class="social-container">
    <a href="https://www.facebook.com/" class="social"><img src="https://cdn-icons-png.flaticon.com/512/4494/4494479.png" alt="Icône personnalisée"></a>
    <a href="https://www.google.com/" class="social"><img src="https://cdn-icons-png.flaticon.com/512/300/300221.png" alt="Icône personnalisée"></a>
    <a href="https://www.linkedin.com/" class="social"><img src="https://cdn-icons-png.flaticon.com/512/3670/3670236.png" alt="Icône personnalisée"></a>
</div>


			
 
            <input type="text" name="nom" placeholder="Nom">
            <input type="text" name="prenom" placeholder="Prénom">
            <input type="text" name="email" placeholder="Email">
            <input type="password" name="password" placeholder="Mot de passe">
            <input type="date" name="date" placeholder="Date de naissance">
            
   
			
                        <input type="submit" value="Sign Up" class="custom-input">
		</form>
              <div class="error-message">${msg}</div>
	</div>
        
        
	<div class="form-container sign-in-container">
		<form action="auth" method="POST">
			<h1>Sign in</h1>
			<div class="social-container">
    <a href="https://www.facebook.com/" class="social"><img src="https://cdn-icons-png.flaticon.com/512/4494/4494479.png" alt="Icône personnalisée"></a>
    <a href="https://www.google.com/" class="social"><img src="https://cdn-icons-png.flaticon.com/512/300/300221.png" alt="Icône personnalisée"></a>
    <a href="https://www.linkedin.com/" class="social"><img src="https://cdn-icons-png.flaticon.com/512/3670/3670236.png" alt="Icône personnalisée"></a>
</div>

			<span>or use your account</span>

                        <input type="text" name="email" placeholder="Email">
            <input type="password" name="password" placeholder="Password">
           
                        
                         <a href="forgotPassword.jsp">Forgot your password?</a>
		   
  <input type="submit" value="Sign In" class="custom-input">


		</form>
	</div>
        
        
	<div class="overlay-container">
		<div class="overlay">
			<div class="overlay-panel overlay-left">
				<h1>Welcome Back!</h1>
				<p>To keep connected with us please login with your personal info</p>
				<button class="ghost" id="signIn">Sign In</a></button>
                                
			</div>
			<div class="overlay-panel overlay-right">
				<h1>Hello, Friend!</h1>
				<p>Enter your personal details and start journey with us</p>
				<button class="ghost" id="signUp">Sign Up</button>
			</div>
		</div>
	</div>
</div>

</body>






<script>
    
    const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});
</script>

</html>

