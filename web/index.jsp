<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>index1</title>
</head>
<body>
<input type="button" value="查询所有" onclick="toGetAll()"/>
</body>
<script type="text/javascript">
    function toGetAll() {
        location.href = "userController/getAllUser";
    }
</script>
</html>