package app.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.modelo.Contacto;
import app.persistencia.AccesoContactos;;

/**
 * Servlet implementation class Control
 */
@WebServlet("/control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Obtener todos los empleados
		obtenerTodos(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Inssertar empleado
		String opcion = request.getParameter("op");
		switch (opcion) {
		case "1":
			alta(request, response);

			break;
		case "2":
			baja(request, response);

			break;
		case "3":
			modificar(request, response);

			break;
		case "4":
			consultarUnContacto(request, response);

			break;

		default:
			break;
		}
		// métodos
	}

	private void alta(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contacto e1 = (Contacto) request.getAttribute("e1");
		AccesoContactos ae1 = new AccesoContactos();
		try {
			ae1.insertarUno(e1);
			request.setAttribute("mensaje", "alta exitosa");
			RequestDispatcher rq = request.getRequestDispatcher("/mensaje.jsp");
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.toString());
		}
	}

	private void baja(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Contacto e1 = (Contacto) request.getAttribute("e1");
		AccesoContactos ae1 = new AccesoContactos();
		try {
			ae1.borrarUno(e1.getId());
			request.setAttribute("mensaje", "baja exitosa");
			RequestDispatcher rq = request.getRequestDispatcher("/mensaje.jsp");
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.toString());
		}
	}

	private void modificar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Contacto e1 = (Contacto) request.getAttribute("e1");
		AccesoContactos ae1 = new AccesoContactos();
		try {
			if (ae1.modificar(e1)) {
				request.setAttribute("mensaje", "Cambios realizados");
			} else {
				request.setAttribute("mensaje", "Cambios no realizados");
			}
			RequestDispatcher rq = request.getRequestDispatcher("/mostrar.jsp");
			rq.forward(request, response);

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.toString());
		}
	}

	private void consultarUnContacto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Contacto e1 = (Contacto) request.getAttribute("e1");
		AccesoContactos ae1 = new AccesoContactos();
		try {
			e1=ae1.obtenerUno(e1.getId());
			request.setAttribute("e1", e1);//para sobreescribir y realizar los cambios
			RequestDispatcher rq = request.getRequestDispatcher("/mostrar.jsp");
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.toString());
		}
	}

	private void obtenerTodos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Contacto> todos;
		AccesoContactos ae1 = new AccesoContactos();
		try {
			todos= ae1.obtenerTodos();
			System.out.println(todos.toString());
			request.setAttribute("todos", todos);
			RequestDispatcher rq = request.getRequestDispatcher("/mostrartodos.jsp");
			rq.forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println(e.toString());
		}
	}
}
