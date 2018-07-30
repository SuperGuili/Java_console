package br.edu.up.vendas.entidade;

public class Produto {
	private Long idProduto;
	private String nomeProduto;
	private Double precoProduto;
	private Integer quantidadeProduto;

	public Long getIdProduto(Long pidProduto) {
		return idProduto;
	}
	
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long pidProduto) {
		this.idProduto = pidProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String pnomeProduto) {
		this.nomeProduto = pnomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double pprecoProduto) {
		this.precoProduto = pprecoProduto;
	}

	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(Integer pquantidadeProduto) {
		this.quantidadeProduto = pquantidadeProduto;
	}

}
