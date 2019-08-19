package ua.kiev.prog;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    static  int cat = 0;
    static  int dog = 0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        String catcheck = request.getParameter("cat");
        String dogcheck = request.getParameter("dog");

        if(catcheck!=null)
        {
            cat ++;
        }
        if(dogcheck!=null)
        {
            dog ++;
        }


        request.setAttribute("user_name", name);
        request.setAttribute("user_lastname", lastname);
        request.setAttribute("user_cat", cat);
        request.setAttribute("user_dog", dog);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/stats.jsp");
        rd.forward(request, response);
    }


}
