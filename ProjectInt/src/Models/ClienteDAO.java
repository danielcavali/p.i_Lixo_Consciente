package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;








public class ClienteDAO {
	private Connection c = null;
	public ClienteDAO() {
		this.c = new ConnectionFactory().getConnection(true);
	}
	/**
	 * Metodo responsavel de inserir um Cliente no sistema
	 * @param cli (instãncia de um Cliente)
	 */
	// -------- Inserir Cliente no SISTEMA -----------
	public void insereCliente(Cliente cli) {
		try {
			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}
			
			String sql = "INSERT INTO cliente (NM_CLIENTE,EMAIL,CPF,TELEFONE,SENHA) values (?,?,?,?,?)";

			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, cli.getNome_Cliente());
			ps.setString(2, cli.getEmail());
			ps.setString(3, cli.getCpf());
			ps.setString(4, cli.getTelefone());
			ps.setString(5, cli.getSenha());
			
			
			

			ps.executeUpdate();
			
			this.c.close();
			this.c = null;
			System.out.println("Cliente Cadastrado!");

		} catch (SQLException e) {
			System.out.println("Erro ao inserir Cliente: " + e);
		}
	}
	public Cliente ValidaUser(Cliente Cli) {
		try {
			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}

			String sql = "SELECT * FROM cliente WHERE EMAIL=? AND SENHA=?";

			PreparedStatement ps = c.prepareStatement(sql);

			ps.setString(1, Cli.getEmail());
			ps.setString(2, Cli.getSenha());
			
			ResultSet rs = ps.executeQuery();
			Cliente aux = null;
			
			while (rs.next()) {
				aux = new Cliente();
				aux.setId_Cliente(rs.getInt("IDCLIENTE"));
				aux.setNome_Cliente(rs.getString("NM_CLIENTE"));
				aux.setCpf(rs.getString("CPF"));
				aux.setEmail(rs.getString("EMAIL"));
				aux.setTelefone(rs.getString("TELEFONE"));
				aux.setSenha(rs.getString("SENHA"));
				
				
			}

			 this.c.close();

			return aux;

		} catch (SQLException e) {
			System.out.println("Erro ao consultar Cliente: " + e);
		}
		return null;
	}
	public void atualizaCliente (Cliente cli) {
		if (this.c == null) {
			this.c = new ConnectionFactory().getConnection(true);
		}
		String sql = "UPDATE cliente SET NM_CLIENTE=?,CPF=?,EMAIL=?,TELEFONE=?,SENHA=? WHERE IDCLIENTE=?";
				PreparedStatement ps = null;
		try {
		ps = c.prepareStatement(sql);
		
		
		ps.setInt(6, cli.getId_Cliente());
		ps.setString(1, cli.getNome_Cliente());
		ps.setString(2, cli.getCpf());
		ps.setString(3, cli.getEmail());
		ps.setString(4, cli.getTelefone());
		ps.setString(5, cli.getSenha());
		ps.executeUpdate();
		
		System.out.println("Dados do Cliente alterado com sucesso!");
		} catch (SQLException e) {
			System.out.println("erro ao Alterar"+ e.getMessage());
		}finally {
			try {
				ps.close();
				c.close();
				}catch (SQLException e) {
				System.out.println("erro ao finalizar banco: "+ e.getMessage());
				}	
			}
		}
	public void DeletaCliente(Cliente cli) {
		try {

			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}
			
			String sql = "DELETE FROM cliente WHERE IDCLIENTE=?";

			PreparedStatement ps = c.prepareStatement(sql);
		
			ps.setInt(1, cli.getId_Cliente());

			ps.execute();
			
			

			this.c.close();

		} catch (SQLException e) {
			System.out.println("Erro ao excluir o Usuario: " + e);
		}
	}
	public int SetaIdUser(Cliente Cli) throws SQLException {
		
			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}

			String sql = "SELECT IDCLIENTE FROM cliente WHERE EMAIL=? AND SENHA=?";

			PreparedStatement ps = c.prepareStatement(sql);

			ps.setString(1, Cli.getEmail());
			ps.setString(2, Cli.getSenha());
			
			ResultSet rs = ps.executeQuery();
			Cliente aux = new Cliente();
			int resultado;
			
			while (rs.next()) {
				aux.setId_Cliente(rs.getInt("IDCLIENTE"));		
			}

			 this.c.close();
			resultado = aux.getId_Cliente();
			return resultado;

	}
	
}

