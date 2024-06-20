import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Perform authentication logic (dummy example)
        if ("admin".equals(username) && "password".equals(password)) {
            // Redirect to home page if authenticated
            
        out.println("<html><head><title>Login Details</title></head><body>");
        out.println("<h2>Registration Successful</h2>");
        out.println("<p>username:" + username + "</p>");
        out.println("<p>password: " + password + "</p>");
        out.println("</body></html>");
        
            
            response.sendRedirect("home.jsp");
        } else {
            // Redirect back to login page with error message
            response.sendRedirect("login.jsp?error=invalid");
        }
        
        
        out.println("<html><head><title>Login to be successfull</title></head><body>");
        
//        out.println("<html><head><title>Login Details</title></head><body>");
//        out.println("<h2>Registration Successful</h2>");
//        out.println("<p>username:" + username + "</p>");
//        out.println("<p>password: " + password + "</p>");
//        out.println("</body></html>");
    
    }
}

