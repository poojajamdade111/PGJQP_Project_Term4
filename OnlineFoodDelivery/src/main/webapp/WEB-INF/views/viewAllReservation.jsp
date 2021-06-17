<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Product</title>
</head>
<body style="background-color:rgb(9, 70, 70);">

			<div style="padding-inline-start: 600px;">
				<h1 style=" color:white;">All Table Reservation Details</h1>
			</div>

			
			<%--<div style="padding-inline-start: 280px;">
			<p>	<a href="<c:url value = "/home" />" class="btn btn-default">Home
			Page</a></p>
	</div>--%>
			<div style="padding-inline-start: 320px;">
			<table border="1" >
				<thead style="color:white;background-color: purple;">
					<tr class="bg-success">
						<th>ReservationId</th>
						<th>Name</th>
						<th>EmailId</th>
						<th>ContactNumber</th>
						<th>Date</th>
						<th>Time</th>
						<th>num_of_attendees</th>
						<th>Reason</th>
						<th>Comments</th>
					</tr>
				</thead>
				<c:forEach items="${allReservationEntry}" var="ReservationEntry">
					<tr style="color:white;">
						
					    <td>${ReservationEntry.reserve_id}</td>
						<td>${ReservationEntry.name}</td>
						<td>${ReservationEntry.emailid}</td>
						<td>${ReservationEntry.contactno}</td>
						<td>${ReservationEntry.date}</td>
						<td>${ReservationEntry.time}</td>
						<td>${ReservationEntry.numofattendees}</td>
						<td>${ReservationEntry.reason}</td>	
						<td>${ReservationEntry.comments}</td>	
					</tr>
				</c:forEach>
			</table>
			</div>
</body>
</html>