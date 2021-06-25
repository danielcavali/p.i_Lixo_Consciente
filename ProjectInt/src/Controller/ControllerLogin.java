package Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
 * Servlet implementation class ControllerLogin
 */
@WebServlet("/ControllerLogin")
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogin() {
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
		Cliente cli = new Cliente();
		HttpSession session = request.getSession();
		Solicitacao soli = new Solicitacao();
		 LocalDate hoje = LocalDate.now();
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 String hojeFormatado = hoje.format(formatter);
		cli.setEmail(request.getParameter("Email"));
		cli.setSenha(request.getParameter("Senha"));
		
		RequestDispatcher rd;
		
		
	
		
		if((cli=cli.ValidaUser(cli)) != null) {
			request.setAttribute("cliente", cli);
			end.setCep("0321548-63");
			end.setBairro("Vila Marcondes");
			end.setComplemento("3");
			end.setNumero(44);
			end.setRua("Padroeiro Antonio");
			session.setAttribute("endereco", end );
			
			
			soli.setData_Solicitacao(hojeFormatado);
			soli.setId_Solicitacao(1);
			soli.setEstado("Aberto");
			session.setAttribute("soli", soli);
			//soli.setCliente_Idcliente(cli.getId_Cliente());
			
			rd = request.getRequestDispatcher("/Menu.jsp");
			
			
			} else {
				String m = "Email ou senha incorretos!";
				request.setAttribute("msg", m);
				
				rd = request.getRequestDispatcher("/Index.jsp");
			}
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
