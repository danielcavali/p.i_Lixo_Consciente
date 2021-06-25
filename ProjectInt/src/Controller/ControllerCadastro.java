package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.Cliente;
import Models.Endereco;






/**
 * Servlet implementation class ControllerCadastro
 */
@WebServlet("/ControllerCadastro")
public class ControllerCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerCadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		Cliente cli = new Cliente();
		
		 HttpSession session = request.getSession();
	
		
		cli.setNome_Cliente(request.getParameter("nome"));
		//request.setAttribute("dados", cli);
		cli.setCpf(request.getParameter("cpf"));
		//request.setAttribute("cpf", cli.getCpf());
		cli.setEmail(request.getParameter("email"));
		//request.setAttribute("email", cli.getEmail());
		cli.setSenha(request.getParameter("senha"));
		//request.setAttribute("senha", cli.getSenha());
		cli.setTelefone(request.getParameter("telefone"));
		//request.setAttribute("telefone", cli.getTelefone());
		
		cli.insereCliente(cli);
		
		session.setAttribute("cliente", cli );
		
		RequestDispatcher rd;
		
		
		rd = request.getRequestDispatcher("CadastroEnd.jsp");
		rd.forward(request, response);
	}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
