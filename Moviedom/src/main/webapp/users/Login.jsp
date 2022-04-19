<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
    
    <link rel="stylesheet" href="users/style.css">
    <title>Movie Ticket Booking</title>
    </head>
<body>

<div class="container">
	<p class="msg">${message}</p>
    <div class="forms">
        <div class = "form login">
            <span class="title">Login</span>
            <form action="checkLogin" method="post">
            
                <div class="input-field">
                <input type="text" placeholder="Enter your email" name="email" required>
                <i class="uil uil-envelope"></i>
                 </div>
                 
                 
                 <div class="input-field">
                    <input type="password" class="password" placeholder="Enter your password"  name="password" required>
                    <i class="uil uil-lock"></i>
                    <i class="uil uil-eye-slash showHidePw"></i>
                </div>
                <div class="input-field button">
                    <input type="submit" value="Login Now">
                </div>
            </form>
            <div class="login-signup">
               <span class="text">Not a member?</span>
               <a class="text signup-text">Sign up</a>
            </div>
        </div>
        <div class = "form signup">
            <span class="title">Registration</span>
            <form action="addCustomer" id="register" onsubmit="return checkInputs()" method="post">
                <div class="input-field">
                <input type="text" placeholder="Enter your name" name="name" required>
                <i class="uil uil-user"></i>
                 </div>
                                      <div class="input-field">
                        <input type="text" placeholder="Enter your age" name="age" id="age" required>
                        <i class="uil uil-chat-bubble-user"></i>
                         <small>error msg</small>
                         </div>
                 <div class="input-field">
                    <input type="text" placeholder="Enter your email" name="email" id="email" required>
                    <i class="uil uil-envelope"></i>
                    <small>error msg</small>
                    
                    
                     </div>

                 <div class="input-field">
                    <input type="password" class="password" placeholder="Enter your password" name="password" required>
                    <i class="uil uil-lock"></i>
                    <i class="uil uil-eye-slash showHidePw"></i>
                </div>
                <div class="input-field">
                    <input type="text" placeholder="Enter your phone no" name="phone" id="phone" required>
                    <i class="uil uil-phone"></i>
                    <small>error msg</small>
                </div>
                <div class="input-field button">
                    <input type="submit" value="Sign up">
                </div>
                <div class="login-signup">
                    <span class="text">Already a member?</span>
                    <a  class="text login-text">Login In</a>
                 </div>
            </form>
        </div>




    </div>

</div>
<script src="users/script.js"></script>
</body>
    </html>
