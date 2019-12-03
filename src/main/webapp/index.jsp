<html>
<head>
<title>BOOKING A FLIGHT</title>
<style type="text/css">
body {
	background-image: url(flight.jpg);
	background-size: cover;
	background-attachment: fixed;
}
</style>
</head>
<body>
	<h1>Book-Flight</h1>
	<table align="left">
		<tr>
			<td>Trip:</td>
			<td><input type="radio" name="Trip" value="one-way Trip">One-Way
				Trip <input type="radio" name="Trip" value="Round-Trip">Round-Trip
			</td>
		</tr>
		<tr>
			<td>To:</td>
			<td><input type="To" name="To" size="30"></td>
		</tr>
		<tr>
			<td>From:</td>
			<td><input type="From" name="From" size="30"></td>
		</tr>
		<tr>
			<td>Airlines:</td>
			<td><select name="Airlines names">
					<option value="">choose your Airlines..</option>
					<option value="AM">American</option>
					<option value="DT">Delta</option>
					<option value="SP">Sprint</option>
					<option value="VG">Virgin</option>
					<option value="other">Other</option></td>
		</tr>
		<tr>
			<td></td>
			<td align="center"><button id="PROCESS" name="PROCESS">PROCESS</button>
			<td align="center"><button id="CLEAR" name="CLEAR">CLEAR</button>
			</td>
		<tr></tr>
		</tr>
	</table>
</body>
</html>