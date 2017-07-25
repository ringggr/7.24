import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lanouhn on 17/7/24.
 */
@WebServlet(name = "AServlet",urlPatterns = "/as")
public class AServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发与请求包含
        /*
        * 浏览器的一次请求，请求的是Servlet，但是Servlet是不显示内容的(除非是有write方法，直接在参数输入字符串格式的html代码）
        * 那么这次请求也就不会得到任何页面上的响应，但是通过请求转发/包含，可以将这次请求转发到jsp页面上，这样浏览器就可以显示该jsp页面
        * 就相当于，打了114，114人工服务帮我们转接到了110
        *
        * */

        //请求转发与请求包含的区别
        /*
        * 请求转发，只有最后一个Servlet可以响应浏览器
        * 请求包含，每个Servlet都可以响应
        *
        * */


        //请求转发，请求包含两者与重定向的区别
        /*
        * 1.重定向 实际上是两次请求
        * 请求转发/包含是一次
        *
        * 2.重定向，会改变地址栏的地址信息
        * 请求转发/包含不会
        *
        * 3.重定向，在sendRedirect方法中输入的路径需要加上项目路径：ContextPath 也就是这里的hj
        * 请求转发/包含  不需要
        * */


        Student stu = new Student();
        stu.name = "王宝强";
        //在AServlet这里，将stu对象装进了request中
        request.setAttribute("stu", stu);



        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cs");//command + alt + V
        //执行forward就是转发
        //执行include就是包含
        requestDispatcher.forward(request, response);
    }
}
