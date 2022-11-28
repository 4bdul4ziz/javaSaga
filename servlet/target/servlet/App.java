/*
 * 2. Create a Servlet to get the student details Name, Registration Number, Department (DropDown), Semester (DropDown), CGPA. When the submit button is pressed all the details entered by the student should be displayed in the same page along with the current date and time. 
 */

package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginForm
 */
@WebServlet("/loginForm")

public class loginForm extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
        String name = request.getParameter("name");
        String regNo = request.getParameter("regNo");
        String dept = request.getParameter("dept");
        String sem = request.getParameter("sem");
        String cgpa = request.getParameter("cgpa");
        Date date = new Date();
        PrintWriter out = response.getWriter();
        out.println("Name: "+name);
        out.println("Registration Number: "+regNo);
        out.println("Department: "+dept);
        out.println("Semester: "+sem);
        out.println("CGPA: "+cgpa);
        out.println("Date: "+date);
    }

}



