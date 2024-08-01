<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chọn Thống Kê</title>
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
            width: 300px;
            text-align: center;
        }
        .select-wrapper {
            margin-bottom: 20px;
        }
        select {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ddd;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Chọn Thống Kê</h1>
        <form action="chontk" method="post">
            <div class="select-wrapper">
                <select name="thongKeType" required>
                    <option value="">Chọn loại thống kê</option>
                    <option value="ncc">Xem thống kê nhà cung cấp theo lượng nhập</option>
                    <option value="dichvu">Thống kê dịch vụ</option>
                    <option value="khachhang">Thống kê khách hàng</option>
                    <option value="phutung">Thống kê phụ tùng</option>
                </select>
            </div>
            <button type="submit">Xem</button>
        </form>
    </div>
</body>
</html>
