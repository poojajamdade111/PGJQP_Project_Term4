<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
        <title>Online Flowers Delivery</title>
        <link type="text/css" rel="stylesheet "href="resources/css/logincss.css">
    </head>
    <body>
        <div>
            <div class="form-register">
                <form class="register-form" action="Register" method="post">
                    <h1 style="font-size: 24pt;color:rgb(140, 190, 90)"><b>Register</b></h1>
        <input type="text" name="name" placeholder="name"/><td>
       <input type="password" name="password" placeholder="password"/>
        <input type="text"  name="email" placeholder="email address"/>
       <button>create</button>
    
       <p class="message">Already registered? <a href="login.jsp">Sign In</a></p>

    </form>
            </div>
          </div>
        <!-- <script>$('.message a').click(function(){
            $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
         });</script>--> 
    </body>
</html>