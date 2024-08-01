/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.NhaCungCap93DAO;
import dao.TKNCCDAO93;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.NhaCungCap93;
import model.TKNhaCungCap93;

/**
 *
 * @author Admin
 */
public class TKNhaCungCap extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TKNhaCungCap</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TKNhaCungCap at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            // Lấy ngày bắt đầu và ngày kết thúc từ form
            LocalDate start = LocalDate.parse(request.getParameter("start"));
            LocalDate end = LocalDate.parse(request.getParameter("end"));

            // Tạo đối tượng DAO để truy vấn dữ liệu
            TKNCCDAO93 tknccdao93 = new TKNCCDAO93();
            List<TKNhaCungCap93> dstk = tknccdao93.getDSNCC(start, end);

            // Lấy thông tin nhà cung cấp từ danh sách thống kê
            List<NhaCungCap93> dsncc = new ArrayList<>();
            NhaCungCap93DAO nccdao = new NhaCungCap93DAO();
            for (TKNhaCungCap93 i : dstk) {
                NhaCungCap93 ncc = nccdao.findById(i.getNhaCungCap93id());
                dsncc.add(ncc);
            }

            // Chuyển dữ liệu đến JSP
            request.setAttribute("start", start);
            request.setAttribute("end", end);
            request.setAttribute("dstk", dstk);
            request.setAttribute("dsncc", dsncc);
            request.getRequestDispatcher("tkncc.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            // Xử lý lỗi (Có thể chuyển hướng đến một trang lỗi hoặc thông báo lỗi)
            request.setAttribute("errorMessage", "Đã xảy ra lỗi khi xử lý yêu cầu.");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
