package Servlet;

import Bean.UserBean;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by wanhuo on 2017-5-8.
 */
@WebServlet(name = "LoginServlet",urlPatterns = "/GetLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserBean userBean=new UserBean();
        userBean.name="lin";
        userBean.age=12;
        userBean.height=175.0;
        String jsonObjectStr= JSONObject.toJSONString(userBean);

        PrintWriter printWriter= resp.getWriter();
        printWriter.write(jsonObjectStr);
        resp.setContentType("text/json");
        resp.setCharacterEncoding("gb2312");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("gb2312");

        PrintWriter out = resp.getWriter();
        String name = "jjjj";

        out.println("Your Name : " + name);
    }
}
