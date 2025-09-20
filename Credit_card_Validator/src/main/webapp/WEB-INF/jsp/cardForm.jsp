<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head><title>Credit Card Validator</title></head>
<body>
<h2>Enter Card Details</h2>

<form:form method="POST" action="/cards/submit" modelAttribute="cardRequest">
    Card Number: <form:input path="cardNumber"/> <form:errors path="cardNumber"/><br/>
    Expiry (MM/YY): <form:input path="expiry"/> <form:errors path="expiry"/><br/>
    CVV: <form:input path="cvv"/> <form:errors path="cvv"/><br/>
    <input type="submit" value="Validate"/>
</form:form>

</body>
</html>
