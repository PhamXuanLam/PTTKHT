<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            width: 400px;
        }
        .form-group {
            margin-bottom: 15px;
            text-align: left;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        .button {
            background-color: #28a745;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
            text-decoration: none;
            display: inline-block;
        }
        .button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Đặt Lịch</h1>
        <p>Xin chào, <c:out value="${thanhVien93.ho_ten}" />!</p>
        <form action="datlich" method="post">
            <input type="hidden" name="id" value="${thanhVien93.id}">
            <div class="form-group">
                <label for="ho_ten">Họ Tên:</label>
                <input type="text" id="ho_ten" name="ho_ten" value="${thanhVien93.ho_ten}" required>
            </div>
            <div class="form-group">
                <label for="sdt">Số Điện Thoại:</label>
                <input type="text" id="sdt" name="sdt" value="${thanhVien93.sdt}" required>
            </div>
            <div class="form-group">
                <label for="ngayDat">Ngày Đặt:</label>
                <input type="date" id="ngayDat" name="ngayDat" required>
            </div>
            <div class="form-group">
                <label for="gioDat">Giờ Đặt:</label>
                <input type="time" id="gioDat" name="gioDat" required>
            </div>
            <button type="submit" class="button">Xác Nhận</button>
        </form>
    </div>
</body>
</html>
