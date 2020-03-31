import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String usuario = request.getParameter("usuario");
		String Password = request.getParameter("password");
		String Tecnologia[] = request.getParameterValues("tecnologia");
		String genero = request.getParameter("genero");
		String ocupacion = request.getParameter("ocupacion");
		String musica[] = request.getParameterValues("musica");
		String comentario = request.getParameter("comentarios");
		
		out.print("Hola");
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Resultado Servlet</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Parámetros por el servlet: </h1>");
		
		out.print("<table border='1'>");
		out.print("<tr>");
		out.print("<td>");
		out.print("Usuario");
		out.print("</td>");
		out.print("<td>");
		out.print(usuario);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("password");
		out.print("</td>");
		out.print("<td>");
		out.print(Password);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Tecnología");
		out.print("</td>");
		out.print("<td>");
		for (String tecnologia : Tecnologia) {
			out.print(tecnologia);
			out.print(" / ");
		}		
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Genero");
		out.print("</td>");
		out.print("<td>");
		out.print(genero);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Ocupación");
		out.print("</td>");
		out.print("<td>");
		out.print(ocupacion);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Musica");
		out.print("</td>");
		out.print("<td>");
		if (musica !=null) {
			for (String Musica : musica) {
				out.print(Musica);
			}
		}
		else {
			out.print("Valor no proporcionado");
		}		
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>");
		out.print("Comentarios");
		out.print("</td>");
		out.print("<td>");
		if (comentario!=null) {
			out.print(comentario);
		}
		else {
			out.print("Valor no proporcionado");
		}		
		out.print("</td>");
		out.print("</tr>");
				
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		

		
	}
	
}
