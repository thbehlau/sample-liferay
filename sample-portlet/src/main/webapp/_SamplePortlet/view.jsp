<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />

Hello World
<portlet:actionURL var="submitSample">
     <portlet:param name="myaction" value="echoValue" />
</portlet:actionURL>

<form action="${submitSample}">
	<input type="text" name="value"/>
	<button type="submit">Submit</button> 
</form>