 <%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.1.0.min.js"></script>

<script>

$(function() {
    $("#call").click(function() {
      	var xhr = new XMLHttpRequest();
    	var data2= {
    			"id":
    			{
    				"name":
    				{
    					"test":"ssibal",	
    				},
    				'aga': 23,
    			},
    			"type": "todo",
    	}
       	var id = '123';
    	var type = 'todo';
    	
    	
    	var data = {
    			'id': 123,
    			'type': 'finish',
    	};
 <%--
    	xhr.open("POST","/webapiexam/TestAjax",true);
    	var json = JSON.stringify(data)
    	
    	xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    	xhr.onreadystatechange = function() {//Call a function when the state changes.
    	    if(xhr.readyState == 4 && xhr.status == 200) {
    	        console.log(data.id)
    	    }
    	}
    	
    	console.log(json);
    	console.log(data);
    	xhr.send('json='+json);
    --%>

      $.ajax({
        type:"POST",
        url:"/webapiexam/TestAjax",
        /* contentType: "application/x-www-form-urlencoded; charset=utf-8", */ 
        data: 'json=' + data,
        datatype:"json",
        success: function(data) {
          console.log('dat'+data);			
        },
        error: function(e) {
          
        }			
      });
      
      
    });
  });

</script>

</head>

<body>
  <form id="form1">
    <input type="text" name="val" value="ajax 테스트" id="val"></input>
    <input type="text" name="num" value="12345" id="num"></input>
    <input type="button" value="호출" id="call"></input>
  </form>
</body>

</html>
