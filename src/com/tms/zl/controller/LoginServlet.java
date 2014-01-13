package com.tms.zl.controller;

import com.tms.zl.service.UserService;
import com.tms.zl.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 13-12-27.
 */
public class LoginServlet extends HttpServlet implements Constant{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        int verifyReturnCode = new UserService().verifyUserInfo(username, password);
        if(verifyReturnCode == IS_VALID_USERINFO) {
            HttpSession sessionUserInfo = request.getSession(true);
            sessionUserInfo.setAttribute("username", username);
            sessionUserInfo.setAttribute("password", password);
            request.getRequestDispatcher("/MyTask").forward(request,response);
        }else if(verifyReturnCode == IS_NOT_EXIST_USERNAME){
            request.setAttribute("logininfo",IS_NOT_EXIST_USERNAME);
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }else if(verifyReturnCode == IS_WRONG_PASSWORD) {
            request.setAttribute("logininfo",IS_WRONG_PASSWORD);
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
