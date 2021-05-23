package br.com.fiap.financiamento.enity;

public class Intencao_Enity {

	package br.com.fiap.produtos.mvc.entity;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity(name = "tb_intencao")
	public class ProdutoEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nome;
		private String rg;
		private String cpf;
		private String descricao;
		private Double preco;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSku() {
			return rg;
		}
		public void setSku(String sku) {
			this.rg = sku;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Double getPreco() {
			return preco;
		}
		public void setPreco(Double preco) {
			this.preco = preco;
		}	
	}

}
