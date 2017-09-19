<html lang="en">
	<head>
	<style>
    body{
    background-image:url(gh.jpg);
    background-size:1370px 850px;
    background-repeat:no-repeat;
    }
    </style>	
	</head>
        <body >
				
        <fieldset>
            <legend><font color="white">SIGN UP</font></legend>
       	<form name="myform" action="AddUser" method="post" onsubmit="return validate()">
        <h3><font color="white">	
        First Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="text" name="firstname" id="a"><br><br><br>
	Last Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="text" name="lastname" id="b"><br><br><br>
	Gender:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="gender" value="male">Male <br><br>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="radio" name="gender" value="female">&nbsp;&nbsp;Female <br><br><br>
	Username:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="text" name="userid"><br><br><br>
	Choose Password:&nbsp;&nbsp;&nbsp;
	<input type="password" name="pword" id="c"><br><br><br>
	Re-Enter Password:&nbsp;
        <input type="password" name="pword2"><br><br><br> </h3>
            <input type="submit" value="SUBMIT"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="RESET"></font>
	</form>
        </fieldset>
            <script>
                function validate()
                {
                var name=document.forms["myform"]["firstname"].value;
                var lname=document.forms["myform"]["lastname"].value;
                var pass=document.forms["myform"]["pword"].value;
                
                if(name==null||name=="")
                {
                 alert ("Enter a valid name");   
                  return false;  
                }
                else if(pass.length<7||pass.length>10)
                {
                  alert ("Password should be less than 10 and more than 7 characters");  
                   return false; 
                }
            }
            
                </script>
                ${requestscope.msg}
</body>
</html>			
					