<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Thống Kê Nhà Cung Cấp</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 20px;
            }
            .container {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 2px 4px rgba(0,0,0,0.1);
                max-width: 800px;
                margin: auto;
            }
            .form-group {
                margin-bottom: 15px;
            }
            label {
                display: block;
                margin-bottom: 5px;
            }
            input[type="date"] {
                width: 100%;
                padding: 8px;
                margin-bottom: 10px;
            }
            .button-group {
                display: flex;
                justify-content: space-between;
            }
            button, a.button {
                background-color: #28a745;
                color: #fff;
                border: none;
                padding: 10px 20px;
                font-size: 16px;
                cursor: pointer;
                border-radius: 5px;
                text-decoration: none;
                text-align: center;
            }
            button:hover, a.button:hover {
                background-color: #218838;
            }
            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
            }
            th, td {
                padding: 10px;
                text-align: left;
                border-bottom: 1px solid #ddd;
            }
            th {
                background-color: #f4f4f4;
            }
            tr:hover {
                background-color: #f1f1f1;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h1>Thống Kê Nhà Cung Cấp</h1>
            <form action="tkncc" method="post">
                <div class="form-group">
                    <label for="start">Ngày bắt đầu:</label>
                    <input type="date" id="start" name="start" value="${start}" required>
                </div>
                <div class="form-group">
                    <label for="end">Ngày kết thúc:</label>
                    <input type="date" id="end" name="end" value="${end}" required>
                </div>
                <div class="button-group">
                    <button type="submit">Xem</button>
                    <a href="chontk" class="button">Quay lại</a>
                </div>
            </form>

            <h1>Danh Sách Nhà Cung Cấp</h1>

            <c:if test="${not empty dstk}">
                <table>
                    <thead>
                        <tr>
                            <th>Tên Nhà Cung Cấp</th>
                            <th>Số Lượng</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${dstk}" varStatus="status">
                            <tr>
                                <td><c:out value="${dsncc[status.index].ten}" /></td>
                                <td><c:out value="${item.so_luong}" /></td>
                                <td>
                                    <form action="ctncc" method="post">
                                        <input type="hidden" name="start" value="${start}" />
                                        <input type="hidden" name="end" value="${end}" />
                                        <input type="hidden" name="so_luong" value="${item.so_luong}" />
                                        <input type="hidden" name="nhaCungCap93id" value="${item.nhaCungCap93id}" />
                                        <input type="hidden" name="ten" value="${dsncc[status.index].ten}" />

                                        <button type="submit">Chi tiết</button>
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:if>
            <c:if test="${empty dstk}">
                <p>Không có dữ liệu để hiển thị.</p>
            </c:if>
        </div>
    </body>
</html>
