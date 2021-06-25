package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnderecoDAO {
	private Connection c = null;
	public EnderecoDAO() {
		this.c = new ConnectionFactory().getConnection(true);
	}
	public void insereEndereco(Endereco end) {
		try {
			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}
			String sql = "INSERT INTO endereco (CEP,BAIRRO,RUA,NUMERO,COMPLEMENTO,CLIENTE_IDCLIENTE) values (?,?,?,?,?,?)";

			PreparedStatement ps = c.prepareStatement(sql);
			
			ps.setString(1, end.getCep());
			ps.setString(2, end.getBairro());
			ps.setString(3, end.getRua());
			ps.setInt(4, end.getNumero());
			ps.setString(5, end.getComplemento());
			ps.setInt(6, end.getEndereco_Idcliente());
			

			ps.execute();
			this.c.close();
			System.out.println("Endereço Cadastrado!");

		} catch (SQLException e) {
			System.out.println("Erro ao inserir Endereço: " + e);
		}
	}
	/*
	public void DeletaEndereco(Endereco end) {
		try {

			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}
			
			String sql = "DELETE FROM endereco WHERE ENDERECO_IDCLIENTE=";

			PreparedStatement ps = c.prepareStatement(sql);
		
			ps.setInt(1, end.getId_Cliente());

			ps.execute();
			
			

			this.c.close();

		} catch (SQLException e) {
			System.out.println("Erro ao excluir o Usuario: " + e);
		}
	}
	*/
	public void atualizaEndereco (Endereco end) {
		if (this.c == null) {
			this.c = new ConnectionFactory().getConnection(true);
		}
		String sql = "UPDATE endereco SET CEP=?,BAIRRO=?,RUA=?,NUMERO=?,COMPLEMENTO=? WHERE CLIENTE_IDCLIENTE=?";
				PreparedStatement ps = null;
		try {
		ps = c.prepareStatement(sql);
		
		
		ps.setInt(6, end.getEndereco_Idcliente());
		ps.setString(1, end.getCep());
		ps.setString(2, end.getBairro());
		ps.setString(3, end.getRua());
		ps.setInt(4, end.getNumero());
		ps.setString(5, end.getComplemento());
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
	public Endereco consultaTodos() {
		try {

			
			if (this.c == null) {
				this.c = new ConnectionFactory().getConnection(true);
			}

			Endereco u2 = new Endereco();
			String sql = "SELECT * FROM endereco WHERE CLIENTE_IDCLIENTE = ?";

			
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setInt(1, u2.getEndereco_Idcliente());
			ResultSet rs = ps.executeQuery();

			Endereco lista = new Endereco();

		
			
				Endereco u = new Endereco();
				u.setIdEndereco(rs.getInt("IDENDERECO"));
				u.setCep(rs.getString("CEP"));
				u.setBairro(rs.getString("BAIRRO"));
				u.setRua(rs.getString("RUA"));
				u.setNumero(rs.getInt("NUMERO"));
				u.setComplemento(rs.getString("COMPLEMENTO"));
				lista = u;
			

			

			return lista;

		} catch (SQLException e) {
			System.out.println("Erro ao consultar local: " + e);
		}
		return null;
	}
}
