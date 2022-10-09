<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
     <h2>Reservation Details</h2>
     
     Passenger Name: ${reservation.getPassenger().firstName}<br/>
      Email Id : ${reservation.getPassenger().email}<br/>
     Phone Number: ${reservation.getPassenger().phone}<br/>
     Operating Airlines: ${reservation.getFlight().operatingAirlines}<br/>
     Flight Number: ${reservation.getFlight().flightNumber}<br/>
     Departure City: ${reservation.getFlight().departureCity}<br/>
     Arrival City: ${reservation.getFlight().arrivalCity}<br/>
     Date of Departure: ${reservation.getFlight().dateofDeparture}<br/>
     
     <h2>Update No. of Bags and Status</h2>
     <form action="proceedToCheckIn" method= "post">
     Reservation Id<input type="text" name="id" value = "${reservation.id}" readonly>
     Number of Bags<input type = "text" name = "numberofBags"/>
      <input type= "submit" value="proceed"/>
      </form>

</body>
</html>