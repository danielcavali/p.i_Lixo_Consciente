package Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.mail.MessagingException;
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
 * Servlet implementation class ControllerAtualizaEnd
 */
@WebServlet("/ControllerAtualizaEnd")
public class ControllerAtualizaEnd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAtualizaEnd() {
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
		
		//cli.setEmail((String) request.getAttribute("email"));
		//cli.setSenha((String) request.getAttribute("email"));
		
		HttpSession session = request.getSession();
		Cliente clie = (Cliente) session.getAttribute("cliente");
		
			int resposta = 0;
			try {
				resposta = clie.SetaIdUser(clie);
			} catch (SQLException e) {
				
			}
			
		
		
		
		end.setCep(request.getParameter("cep"));
		end.setRua(request.getParameter("rua"));
		end.setNumero(Integer.parseInt(request.getParameter("numero")));
		end.setComplemento(request.getParameter("complemento"));
		end.setBairro(request.getParameter("bairro"));
		end.setEndereco_Idcliente(resposta);
		end.atualizaEndereco(end);
		session.setAttribute("endereco", end );
		
		
		
		
		
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
