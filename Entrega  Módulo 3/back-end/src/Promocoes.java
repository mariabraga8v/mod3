
public class Promocoes {


	/**
	* @generated
	*/
	    
	    /**
	    * @generated
	    */
	    private int id_promocao;
	    
	    /**
	    * @generated
	    */
	    private String nome;
	    
	    /**
	    * @generated
	    */
	    private double valor;
	    
	    
	    /**
	    * @generated
	    */
	    private Destinos destinos;
	    
	    

	    /**
	    * @generated
	    */
	    public int getId_promocao() {
	        return this.id_promocao;
	    }
	    
	    /**
	    * @generated
	    */
	    public void setId_promocao(Integer id_promocao) {
	        this.id_promocao = id_promocao;
	    }
	    
	    
	    /**
	    * @generated
	    */
	    public String getNome() {
	        return this.nome;
	    }
	    
	    /**
	    * @generated
	    */
	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    
	    /**
	    * @generated
	    */
	    public double getValor() {
	        return this.valor;
	    }
	    
	    /**
	    * @generate
	    */
	    public void setValor(double valor) {
	        this.valor = valor;
	    }
	    
	    
	    
	    /**
	    * @generated
	    */
	    public Destinos getDestinos() {
	        if (this.destinos == null) {
	            this.destinos = new Destinos ();
	        }
	        return this.destinos;
	    }
	    
	    /**
	    * @generated
	    */public void setDestinos(Destinos destinos) {
	        this.destinos = destinos;
	    }
	    
	    
	    
	}
