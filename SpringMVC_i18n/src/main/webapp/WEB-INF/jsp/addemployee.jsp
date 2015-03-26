<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.title" /></title>
<link type="text/css" href="<%=request.getContextPath()%>/css/bootstrap.css" rel="stylesheet" />
</head>
<body>
 <div class="container">
  <div class="row">
   <div class="col-sm-9">
    <h2><spring:message code="label.heading"/></h2>
    <div class="row">
     <a href="?lang=en" class="btn btn-sm btn-success">English</a> <a href="?lang=fr" class="btn btn-sm btn-success">French</a> <a href="?lang=hi" class="btn btn-sm btn-success">Hindi</a>
    </div>
    <form class="form-horizontal" role="form" method="post" name="employeeForm" id="employeeForm">
     <div class="form-group">
      <label for="firstName" class="col-lg-3 control-label"><spring:message code="label.firstName" /></label>
      <div class="col-lg-4"><input type="text" class="form-control" name="firstName" id="firstName" value="">
      </div>
     </div>
     <div class="form-group">
      <label for="lastName" class="col-lg-3 control-label"><spring:message code="label.lastName" /></label>
      <div class="col-lg-4">
       <input type="text" class="form-control" name="lastName" id="lastName" value="">
      </div>
     </div>     
    </form>
   </div>
  </div>
 </div>
</body>
</html>