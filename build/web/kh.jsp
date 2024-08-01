<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đặt Lịch</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
            text-align: center;
        }
        .button {
            background-color: #28a745;
            color: #fff;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
            text-decoration: none;
        }
        .button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Chào mừng, ${thanhVien93.ho_ten}!</h1>
        <p>Hãy nhấn nút bên dưới để đặt lịch.</p>
        <a href="datlich.jsp" class="button">Đặt Lịch</a>
         <%
            String successMessage = (String) session.getAttribute("successMessage");
            if (successMessage != null) {
                out.println("<p class='message success'>" + successMessage + "</p>");
                session.removeAttribute("successMessage");
            }

            String errorMessage = (String) request.getAttribute("errorMessage");
            if (errorMessage != null) {
                out.println("<p class='message error'>" + errorMessage + "</p>");
            }
        %>
    </div>
</body>
</html>
