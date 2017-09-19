<head>
        <style>
    body{
    background-image:url(ab.jpg);
    background-size:1370px 850px;
    background-repeat:no-repeat;
    }
    </style>
</head>
<body>
<%@include file="header.jsp" %>
<%@include file="Menu.jsp" %>

<center>
    <form action="se" method="post">
        <pre>
<br>
<br>
<br>

<select name="type">
    <option value="none">SELECT</option>
<option value="byname">BY NAME</option>
<option value="byid">BY ID</option>
        </select>
<input type="text" name="name">
<input type="submit" name="Search">
   <br>
<br>
<br>
        </pre>
</form>
    ${requestScope.msg}
    <br>
<br>
<br>
    
</center>

<%@include file="Footer.jsp"%>
</body>