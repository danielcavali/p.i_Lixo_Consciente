package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Models.Cliente;
import Models.Endereco;
import Models.Solicitacao;






/**
 * Servlet implementation class ControllerSolicitacao
 */
@WebServlet("/ControllerSolicitacao")
public class ControllerSolicitacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerSolicitacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Endereco end = new Endereco();
		
		
		//cli.setEmail((String) request.getAttribute("email"));
		//cli.setSenha((String) request.getAttribute("email"));
		
		
		HttpSession session = request.getSession();
		Cliente clie = (Cliente) session.getAttribute("cliente");
		 LocalDate hoje = LocalDate.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 String hojeFormatado = hoje.format(formatter);
		Solicitacao soli = new Solicitacao();
		
		soli.setData_Solicitacao(hojeFormatado);
		soli.setId_Solicitacao(2);
		soli.setEstado("Aberto");
		//soli.setCliente_Idcliente(clie.getId_Cliente());
		
		
		session.setAttribute("soli", soli);
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/Solicitacao.jsp");
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
