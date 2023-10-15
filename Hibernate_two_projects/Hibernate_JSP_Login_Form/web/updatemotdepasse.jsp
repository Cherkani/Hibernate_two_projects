<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
     <style>
      
 #passwordMismatchModal {
        display: none;
        text-align: center;
        background: rgba(0, 0, 0, 0.5);
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        z-index: 9999; /* Valeur de z-index élevée */
    }
        .modal-content {
            background-color: white;
            width: 300px;
            margin: 0 auto;
            margin-top: 90px;
            padding: 20px;
            border-radius: 5px;
        }

        .close {
            position: absolute;
            top: 10px;
            right: 10px;
            cursor: pointer;
        }
    </style>
</head>
<body>
     <jsp:include page="index.html" />
     <div class="modal fade" id="passwordMismatchModal" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="modalLabel">Password Mismatch</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <p>Passwords do not match. Please try again.</p>
            </div>
            <div class="modal-footer">
           
                <button type="button" class="btn btn-secondary" data-dismiss="modal" id="closeModalButton">Close</button>

            </div>
        </div>
    </div>
</div>
<div class="container" id="container">
    <div class="form-container sign-in-container">
        <form action="updatemotdepasse" method="post" onsubmit="return checkPasswords();">
            <h1>Password Confirmation</h1>
            <div class="login-container">
                <input type="password" name="password" placeholder="Password">
                <input type="password" name="passwordcnf" placeholder="Confirm Password">
                <input type="submit" value="Confirm" class="custom-input">
            </div>
        </form>
        <div class="error-message" id="errorMessage">${msg}</div>
    </div>

    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To stay connected with us, please enter your email address.</p>
            </div>
            <div class="overlay-panel overlay-right" style="background: #your-color;">
                <h1>Security Protocol</h1>
                <p>Enter your password code to confirm the process.</p>
                <img src="https://cdn-icons-png.flaticon.com/512/1603/1603859.png" alt="Image" style="width: 110px;">
            </div>
        </div>
    </div>
</div>

<!-- Modal for password mismatch -->

<script>
    // Function to check password match
    function checkPasswords() {
        var password = document.getElementsByName("password")[0].value;
        var passwordcnf = document.getElementsByName("passwordcnf")[0].value;

        if (password !== passwordcnf) {
            // Show the modal
            document.getElementById("passwordMismatchModal").style.display = "block";
            return false; // Prevent form submission
        }
        return true; // Allow form submission
    }

    // Function to close the modal
    function closeModal() {
        document.getElementById("passwordMismatchModal").style.display = "none";
    }

    // Add an event listener to close the modal when the "Close" button is clicked
    document.getElementById("closeModalButton").addEventListener("click", function() {
        closeModal();
    });
</script>


</body>
</html>
