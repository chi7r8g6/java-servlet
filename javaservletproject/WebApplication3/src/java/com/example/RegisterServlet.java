
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String fullname = request.getParameter("fullname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String password = request.getParameter("password");

        out.println("<html><head><title>Registration Details</title></head><body>");
        out.println("<h2>Registration Successful</h2>");
        out.println("<p>Full Name:" + fullname + "</p>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Email:    " + email + "</p>");
        out.println("<p>Gender:  " + gender + "</p>");
        out.println("<p>Country: " + country + "</p>");
        out.println("<p>password: " + password + "</p>");
        out.println("</body></html>");
    }
}
