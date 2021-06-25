
package Models;

public class Endereco extends EnderecoDAO{
	private int idEndereco;
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private int endereco_Idcliente;
	
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getEndereco_Idcliente() {
		return endereco_Idcliente;
	}
	public void setEndereco_Idcliente(int endereco_Idcliente) {
		this.endereco_Idcliente = endereco_Idcliente;
	}
}
