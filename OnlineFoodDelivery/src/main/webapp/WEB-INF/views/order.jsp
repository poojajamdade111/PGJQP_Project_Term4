<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>PJ FOOD POINT</title>
    <link type="text/css" rel="stylesheet "href="resources/css/logincss.css">
</head>
<body>
    <div class="login-page">
    <div class="form">

        <form class="login-form" action="order" method="post">
        <h1 style="font-size: 24pt;color:rgb(140, 190, 90)"><b>Order Food Online</b></h1>
        <table>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" placeholder="Enter your name" /></td>
        </tr>
        <tr>
            <td>Email ID</td>
            <td><input type="email" name="emailid" placeholder="Enter your EmailID" multiple/></td>
        </tr>
            <td>Contact Number</td>
            <td><input type="tel" name="contactno" placeholder="Enter Contact number"/></td>
        </tr>
        <tr>
            <td>Delivery Date</td>
            <td><input type="date" name="deliverydate" placeholder="Enter date"/></td>
       </tr>
       <tr>
            <td>Delivery Time</td>
            <td><input type="time" name="deliverytime" placeholder="Enter Time"/></td>
       </tr>
        <tr>
            <td>Quantity</td>
            <td><input type="number" name="quantity" placeholder="Enter quantity" min="0" max="50"/></td>
        </tr>
        <tr>
          <td>Address</td>
          <td><textarea id="data_9" false name="address" style="max-width : 400px;" rows="6" class="form-control"></textarea></td>
        </tr>
        <tr>
            <td><button formtarget="ContentFrame">Order</button></td>
            <td><button type="reset" style="width:120px;">Reset</button></td>  
       </tr>
      </table>
      </form>

    </div>
  </div>

</body>
</html>