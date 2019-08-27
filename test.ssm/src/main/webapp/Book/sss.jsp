<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sp1" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html >
<html>
<head>
<sp1:bind path=""></sp1:bind>

<base href="../">
<meta charset="UTF-8">
<script src="js/jquery-2.2.4.min.js"></script>
<title></title>
</head>
<body>
<script type="text/javascript">
function openfile(){
	$("[name=file]")[0].click();
}
function upload(){
	var formData = new FormData();
    formData.append("file",$("[name=file]")[0].files[0]);
    $.ajax({
        url:'Book/sss.action',
        type:'post',
        data: formData,
        contentType: false,
        processData: false,
        success:function(res){
           $(".upimg").attr("src",res);
        }
    });
}
</script>
${requestScope.name}

<button onclick="openfile();">
测试
</button>
<button onclick="upload();">
上传
</button>
<div>
<img class="upimg" src="">
</div>

<form method="post" action="Book/sss.action" enctype="multipart/form-data" style="display:none;">
<input type="file" name="file"> 
</form>
</body>
</html>