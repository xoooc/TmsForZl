package com.tms.zl.controller;

import com.tms.zl.service.TaskService;
import com.tms.zl.service.UserService;
import com.tms.zl.utils.Constant;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 13-12-16.
 */
public class MyTaskServlet extends HttpServlet implements Constant{
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        doGet(request, response);
        HttpSession session = request.getSession();

        TaskService taskService = new TaskService();
        String userId = new UserService().queryUserIdByName((String) session.getAttribute("username"));
        String jsonTaskInfo = taskService.queryTaskInfoByUserId(userId);

        request.setAttribute("jsonTaskInfo", jsonTaskInfo);
        request.getRequestDispatcher("/WEB-INF/myTask.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }
}
