package br.com.cavy.studios.nutrisys.model.vo;

public class AddressServiceModelVO {

	private String bairro;
	private String cidade;
	private String cep;
	private String logradouro;
	private String estado;
	private estado_info estado_info;
	private cidade_info cidade_info;
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public estado_info getEstado_info() {
		return estado_info;
	}

	public void setEstado_info(estado_info estado_info) {
		this.estado_info = estado_info;
	}

	public cidade_info getCidade_info() {
		return cidade_info;
	}

	public void setCidade_info(cidade_info cidade_info) {
		this.cidade_info = cidade_info;
	}

	public class estado_info {
		private String area_km2;
		private String codigo_ibge;
		private String nome;
		public String getArea_km2() {
			return area_km2;
		}
		public void setArea_km2(String area_km2) {
			this.area_km2 = area_km2;
		}
		public String getCodigo_ibge() {
			return codigo_ibge;
		}
		public void setCodigo_ibge(String codigo_ibge) {
			this.codigo_ibge = codigo_ibge;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
	}
	
	public class cidade_info {
		private String area_km2;
		private String codigo_ibge;
		public String getArea_km2() {
			return area_km2;
		}
		public void setArea_km2(String area_km2) {
			this.area_km2 = area_km2;
		}
		public String getCodigo_ibge() {
			return codigo_ibge;
		}
		public void setCodigo_ibge(String codigo_ibge) {
			this.codigo_ibge = codigo_ibge;
		}
	}
	
}
