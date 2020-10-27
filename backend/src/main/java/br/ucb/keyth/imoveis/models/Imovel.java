package br.ucb.keyth.imoveis.models;

import javax.persistence.*;

@Entity
@Table(name = "imovel")
public class Imovel {	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "cep", nullable = false)
	private int cep;
    
    @Column(name = "logradouro", nullable = false)
	private String logradouro;
    
    @Column(name = "complemento", nullable = false)
	private String complemento;
    
    @Column(name = "bairro", nullable = false)
	private String bairro;
    
    @Column(name = "cidade", nullable = false)
	private String cidade;
    
    @Column(name = "uf", nullable = false)
	private String uf;
    
    @Column(name = "quartos", nullable = false)
	private int quartos;
    
    @Column(name = "area_util", nullable = false)
	private float area;
	
	public int getId() {
		return id;
	}
	
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
	    return "Imovel{" +
	            ", id='" + id + '\'' +
	            ", cep=" + cep +
	            '}';
	}
}
	