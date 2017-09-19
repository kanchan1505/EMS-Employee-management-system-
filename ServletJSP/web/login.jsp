<html>
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
<fieldset>
    
    <legend > Login Page </legend>
    
        <font color="red">  ${requestScope.msg}</font>
        <center>
    <form action="la" method="post"  >
  <br/><br/>
        <h3>USERNAME :<input type="text" name="userid"  > <br/><br/> <br/>
    
            PASSWORD :<input type="password" name="pass" > <br/><br/> <br/><br/>

            <input type="submit" Value="SUBMIT" >      <a href="Register.jsp">  <input type="button" value="SIGN IN" ></a>
        </h3>
   
        </form>
    </center>
    
        </fieldset>
</body>
</html>