<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <script type="text/javascript" src="js/employee.js"></script>
    <title>Registration</title>
</head>
<body style="font-family: Arial; font-size:smaller;">

<table   width="750" height="500" align="center" style="border-collapse: collapse;" border="1" bordercolor="#006699" >
    <tr valign="top" align="center">
    <td align="center">
          <form:form method="post" action="saveContact.htm" modelAttribute="employeeSave">
				<table>
					<tr>
						<td> Name :</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><input type="text" name="address"></td>
					</tr>
					<tr>
						<td>Age :</td>
						<td><input type="text" name="age"></td>
					</tr>
					<tr>
						<td>Salary :</td>
						<td><input type="text" name="salary"></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit" value="Save" /></td>
					</tr>
					<tr>
						<input value="Back" onclick="javascript:go('index.htm');" type="button">
					</tr>
				</table>
			</form:form>

    </td>    
  </tr>
</table>
</body>
</html>
