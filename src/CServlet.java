import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lanouhn on 17/7/24.
 */
@WebServlet(name = "CServlet", urlPatterns = "/cs")
public class CServlet extends HttpServlet {
    /*
    * 什么是域？
    * 域是一个范围
    * 什么是域对象？
    *   作用于为某一个特定范围的对象，成为域对象，只是一个称呼而已，实际上就是一个普通的对象，该对象有set/get方法，执行set方法的时候成为向域中存值，执行get时，是取值。
    *
    *
    *
    *ServletContext, Request, Session 称为三大域对象
    * */

    //ServletContext: 寿与天齐，齐天大圣，轮回的开始与结束
    //就是当服务器开启时被创建，关闭时被销毁

    //Request: 就是一次请求，浏览器发起请求到服务器响应该请求

    //Session: 作用于一次会话，从会话开始到会话结束
    //什么是会话
    //当用户打开浏览器，访问本服务器的资源，表示会话开启；当用户关闭浏览器，会话结束。
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student stu = (Student) request.getAttribute("stu");
        System.out.println(stu.name);
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(stu.name);
    }
}
