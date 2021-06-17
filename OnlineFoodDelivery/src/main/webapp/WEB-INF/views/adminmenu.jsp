<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

#left
{
padding-left: 500px;
margin-top: 100px;
width: 15%;
float:left;
}
#right
{
margin-top: 100px;
width: 15%;
float:left;
}
</style>
</head>
<body style="background-color:rgb(9, 70, 70);">
<div >
<h1 style="padding-left: 600px;color:white;">Admin Menu</h1>
<div id="left">
<form form="reservationdetails">
<button name="reservationdetails" formaction="viewAllReservation.html" style="background-color: black;width: 150x;" type="submit" formtarget="ContentFrame"><p style="font-size: large;color: white;">ViewReservationDetails</p></button></div>
</form>
</div>
<div id="right">

<form name="orderdetails">
<button name="orderdetails" formaction="viewAllOrders.html" style="background-color: black;width: 150x;" type="submit" formtarget="ContentFrame" ><p style="font-size: large;color: white;">ViewOrderDetails</p></button></div>
</form>
</div>
</div>

</body>
</html>