<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
                         
    <jsp:include page="index.html" />
    <div class="container" id="container">
        <div class="overlay-container">
    
        <form action="checkpassword" method="post">
            <h1>_ Verification _ Code</h1>
            <div class="login-container">
               
                    <input type="number" name="code" id="verificationCode">
                     <input type="hidden" value="<%= session.getAttribute("verificationCode") %>">
                    <input type="submit" value="Verify" class="custom-input">
               
                <br>
            
            </div>
                     </form>
            <div class="error-message" id="errorMessage">${msg}</div>
      
    </div>

    <div class="form-container sign-in-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To keep connected with us, please enter your email address.</p>
            </div>
            <div class="overlay-panel overlay-right" style="background: #your-color;">
                <h1>Security Protocol</h1>
                <p>Enter your verification code to reset your password.</p>
                <img src="https://cdn-icons-png.flaticon.com/512/3125/3125856.png" alt="Verification Image" style="width: 110px;">
            </div>
        </div>
    </div>
</div>

</body>
</html>
