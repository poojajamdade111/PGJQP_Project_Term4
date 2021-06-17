<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
        <title>Online Flowers Delivery</title>
        <link type="text/css" rel="stylesheet "href="resources/css/logincss.css">
    </head>
    <body>
        <div class="login-page">
            <div class="form">
              <form class="login-form" action="adminlogin" method="get">
                <h1 style="font-size: 24pt;color:rgb(140, 190, 90)"><b>Login</b></h1>
                <input type="text" name="name" placeholder="username"/>
                <input type="password" name="password" placeholder="password"/>
                <button>login</button>
                <p class="message">Not registered? <a href="Register.html">Create an account</a></p>
              </form>
            </div>
          </div>
        <!-- <script>$('.message a').click(function(){
            $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
         });</script>--> 
    </body>
</html>