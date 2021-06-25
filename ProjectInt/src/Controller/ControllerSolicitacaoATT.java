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
 * Servlet implementation class ControllerSolicitacaoATT
 */
@WebServlet("/ControllerSolicitacaoATT")
public class ControllerSolicitacaoATT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerSolicitacaoATT() {
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
		end = (Endereco) session.getAttribute("endereco");
		
		Solicitacao soli = new Solicitacao();
		
		
		soli.setEstado("Finalizado");
		
		
		session.setAttribute("soli", soli);
		
		request.setAttribute( "data", soli.getData_Solicitacao());
		request.setAttribute( "situ", soli.getEstado() );
		request.setAttribute( "cep", end.getCep() );
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/Menu.jsp");
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
