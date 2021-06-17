<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <link type="text/css" rel="stylesheet "href="resources/css/logincss.css">
    </head>
    <body>
        <div class="login-page">
            <div class="form">
            <form method="post" action="reservation"  class="login-form" onSubmit="return validateForm();">
            <h1 style="font-size: 24pt;color:rgb(140, 190, 90)"><b>Table Reservation</b></h1>
            <table>
                <tr>
                    <td>Name<span style="color: red;"> *</span></td>
                    <td><input type="text" name="name" placeholder="Enter your name" class="form-control"/></td>
                </tr>
                <tr>
                    <td>Email ID</td>
                    <td><input type="email" name="emailid" placeholder="Enter your EmailID" class="form-control" multiple/></td>
                </tr>
                    <td>Contact Number<span style="color: red;"> *</span></td>
                    <td><input type="tel" name="contactno" placeholder="Enter Contact number"/></td>
                </tr>
                <tr>
                    <td>Date<span style="color: red;"> *</span></td>
                    <td><input type="date" name="date" placeholder="Enter date"  class="form-control"/></td>
               </tr>
               <script src="https://cdnjs.cloudflare.com/ajax/libs/pikaday/1.4.0/pikaday.min.js" type="text/javascript"></script>
               <link href="https://cdnjs.cloudflare.com/ajax/libs/pikaday/1.4.0/css/pikaday.min.css" rel="stylesheet" type="text/css" />
               <script type="text/javascript">new Pikaday({ field: document.getElementById('data_6') });</script>
               <tr>
                    <td>Time<span style="color: red;"> *</span></td>
                    <td><input type="time" name="time" placeholder="Enter Time" class="form-control"/></td>
               </tr>
                <tr>
                    <td>Number of Attendies<span style="color: red;"> *</span></td>
                    <td><input type="number" name="numofattendees" placeholder=" Enter Attendies here" min="0" max="50"/></td>
                </tr>
                <tr>
                    <td>Reason<span style="color: red;"> *</span></td>
                    <td> <select id="data_8" name="reason" style="max-width : 250px;" class="form-control"><option>Birthday</option>
                     <option>Birthday</option>
                     <option>Reception</option>
                     <option>Meeting</option>
                     <option>anniversary</option>
                     <option>dating</option>
                     <option>party</option>
                     <option>other(Specify in Comments)</option>
                     </select></td>
                </tr>
                <tr>
                    <td>Comments / Additional Requests</td>
                    <td><textarea id="data_9" false name="comments" style="max-width : 400px;" rows="6" class="form-control"></textarea></td>
               </tr>
                <tr>
                    <td><button>Reserve</button></td>
                    <td><button type="reset" style="width:120px;">Reset</button></td>  
               </tr>
              
             
            
            

           </table>
            </form>
             </div>
        </div>

            <script type="text/javascript">
            function validateForm() {
            if (isEmpty(document.getElementById('data_3').value.trim())) {
            alert('Name is required!');
            return false;
            }
            if (!validateEmail(document.getElementById('data_5').value.trim())) {
            alert('Email must be a valid email address!');
            return false;
            }
            if (isEmpty(document.getElementById('data_6').value.trim())) {
            alert('Date is required!');
            return false;
            }
            if (isEmpty(document.getElementById('data_7').value.trim())) {
            alert('Time is required!');
            return false;
            }
            return true;
            }
            function isEmpty(str) { return (str.length === 0 || !str.trim()); }
            function validateEmail(email) {
            var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,15}(?:\.[a-z]{2})?)$/i;
            return isEmpty(email) || re.test(email);
            }
            </script>
    </body>
</html>