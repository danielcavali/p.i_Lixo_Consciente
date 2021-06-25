package Models;

import java.sql.Date;
import java.time.LocalDate;

public class Solicitacao {
	int id_Solicitacao;
	String data_Solicitacao;
	String Estado;
	int cliente_Idcliente;
	
	public int getId_Solicitacao() {
		return id_Solicitacao;
	}
	public void setId_Solicitacao(int id_Solicitacao) {
		this.id_Solicitacao = id_Solicitacao;
	}
	public String getData_Solicitacao() {
		return data_Solicitacao;
	}
	public void setData_Solicitacao(String hojeFormatado) {
		this.data_Solicitacao = hojeFormatado;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public int getCliente_Idcliente() {
		return cliente_Idcliente;
	}
	public void setCliente_Idcliente(int cliente_Idcliente) {
		this.cliente_Idcliente = cliente_Idcliente;
	}

}
