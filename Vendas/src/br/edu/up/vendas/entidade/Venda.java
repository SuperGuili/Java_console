package br.edu.up.vendas.entidade;

import java.sql.Date;

public class Venda {

	private Long idVenda;
	private Long fkProduto;
	private Long fkCliente;
	private String dataVenda;
	private Integer quantidade;
	private Integer total;

	public Long getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}

	public Long getFkProduto() {
		return fkProduto;
	}

	public void setFkProduto(Long fkProduto) {
		this.fkProduto = fkProduto;
	}

	public Long getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(Long fkCliente) {
		this.fkCliente = fkCliente;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String pData) {
		this.dataVenda = pData;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}
