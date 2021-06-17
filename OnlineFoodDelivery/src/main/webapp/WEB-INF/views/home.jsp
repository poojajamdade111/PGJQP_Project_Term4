<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <html>
    <head>
        <title>Royal Restourent</title>
    
      <link href="resources/css/style.css" rel="stylesheet" type="text/css" />

    </head>
    <body>
    
        <div class="main-homecontent">
        <div>
            <button style="background-color: black;width: 150x;" type="submit" formtarget="ContentFrame"><a href="login.html"><p style="font-size: large;color: white;">Admin</p></a></button></div>
           <h1><span id="home-icon"><img src="resources/images/logo.png" height="100" width="100"><span><br><span id="home-span">Best in Food Quality</span>
         <span id="home-span2">Amazing & Delicious food<span></h1> 
          
    
        </div>
            <form action="reservation.html">
        <div class="home-res-button">
            <button style="background-color: black;width: 150x;" type="submit" formtarget="ContentFrame"><p style="font-size: large;color: white;">Reservation</p></button></div>
        </div>
        </form>
        
	
    </div>

    </body>
</html>