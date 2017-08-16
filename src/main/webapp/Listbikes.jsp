<%@ page import="com.hTools.*" %>
<% com.hTools.mbs.RentABikeService store = new com.hTools.mbs.RentABikeImpl("Bruce's Bikes"); %>

<html>
	<head>
		<title>
			<%= ((com.hTools.mbs.RentABikeImpl)store).getStoreName() %>
		</title>
	</head>
	<body>
		<h1><%= ((com.hTools.mbs.RentABikeImpl)store).getStoreName() %></h1>
		<table border="1px" padding="2px" border-collapse="separate" border-spacing="2px">
			<tr style="font-weight:bold">
				<td>Manufacturer</td><td>Model</td><td>Status</td>
			</tr>
			<% for(int i = 0; i < store.getBikes().size(); i++) { %>
			<% com.hTools.mbs.Bike bike = (com.hTools.mbs.Bike)store.getBikes().get(i); %>
			<tr>
				<td><%= bike.getManufacturer() %></td>
				<td><%= bike.getModel() %></td>
				<td><%= bike.getStatus() %></td>
			</tr>
			<% } %>
		</table>
	</body>
</html>