package Models;


public class Cliente extends ClienteDAO{

	private int id_Cliente;
	private String nome_Cliente;
	private String cpf;
	private String email;
	private String telefone;
	private String senha;
	
	
	
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public String getNome_Cliente() {
		return nome_Cliente;
	}
	public void setNome_Cliente(String nome_Cliente) {
		this.nome_Cliente = nome_Cliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
