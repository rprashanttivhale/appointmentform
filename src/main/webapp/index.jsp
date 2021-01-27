<html>

<style>
input[type=text], select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
 
  width: 30%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>

<body>

<h2>Welcome to Abhinav Technology</h2>


<h3>Appointment form</h3>

<div>
  <form action="appointaction" method="post">
    
    <input type="text" id="fname" name="name" placeholder="Your full name.."><br>
    <input type="text" id="age" name="age" placeholder="Your age.."><br>
    <input type="text" id="dob" name="dob" placeholder="Your dob"><br>
    <input type="text" id="blood" name="bloodGroup" placeholder="Your Blood group"><br>
    <input type="text" id="mob" name="mobile" placeholder="Your mobile"><br>
    <input type="text" id="email" name="email" placeholder="Your email"><br>
    <input type="text" id="doa" name="doa" placeholder="Your appointment date"><br>
     

	



    
  
    <input type="submit" value="Submit">
  </form>
</div>
</body>
</html>
