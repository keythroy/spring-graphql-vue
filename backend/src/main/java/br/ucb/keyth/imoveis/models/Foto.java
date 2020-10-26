package br.ucb.keyth.imoveis.models;

import javax.persistence.*;

@Entity
@Table(name = "foto")
public class Foto {	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_imovel", nullable = false, updatable = false)
    private Imovel imovel;
    
    @Column(name = "nome", nullable = false)
	private String nome;
    
    @Column(name = "caminho", nullable = false)
	private String caminho;	

	public Foto() {
		
	}
	
    public Foto(int id) {
    	this.id = id;
    }
    
	public Foto(Imovel imovel, String nome, String caminho) {
		this.setImovel(imovel);
		this.setNome(nome);
		this.setCaminho(caminho);
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	@Override
	public String toString() {
	    return "Foto{" +
	            ", id='" + id + '\'' +
	            ", nome=" + nome +
	            '}';
	}
}
	