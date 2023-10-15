<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Forgot Password</title>
 </head>
<body>
   <jsp:include page="index.html" />
    <div class="container" id="container">
    <div class="form-container sign-in-container">
        <form action="forgotPassword" method="POST">
            <h1>_ Reset _ _Password_</h1>
            <div class="login-container">
                <form class="login-form" action="forgotPassword" method="POST">
                    <input type="text" name="email" placeholder="Email">
                    <input type="submit" value="Send Verification Code" class="custom-input" id="submitBtn">
                </form>
                <br>
                <div class="loader" id="loader" style="display: none;"></div>
            </div>
            <div class="error-message" id="errorMessage">${msg}</div>
        </form>
    </div>

    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To keep connected with us, please enter your email address.</p>
            </div>
            <div class="overlay-panel overlay-right" style="background: #your-color;">
                <h1>Forgot Password</h1>
                <p>Enter your email to reset your password.</p>
                <img src="https://cdn-icons-png.flaticon.com/512/7426/7426463.png" alt="Image" style="width: 110px;">
            </div>
        </div>
    </div>
</div>

</body>



</html>
