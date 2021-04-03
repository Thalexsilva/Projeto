public class Cliente{
  
  protected String Nome;
  protected String Tel;
  protected String Cpf;
  protected int IdCliente;
  protected int Desc;
  protected Endereco  Ender = new Endereco();
  
  public Cliente(String Nome,Endereco Ender,String Tel,String Cpf,int Desc){
    this.Nome = Nome;
    this.Ender= Ender;
    this.Tel= Tel;
    this.Cpf = Cpf;
    this.Desc = Desc;
    }


  //Get e Set
   public int getIdCliente(){
    return IdCliente;
  }

  public String getNome(){
    return Nome;
  }

  // endereco 
  public Endereco getEnder(){
		return Ender;
	}

	public void setEnder(Endereco Ender){
		this.Ender = Ender;
	}
 
  public String getTel(){
    return Tel;
  }

  public void setIdCliente(int IdCliente){
		this.IdCliente = IdCliente;
	}

  public void setNome(String Nome){
		this.Nome = Nome;
	}
  public void setTel(String Tel){
		this.Tel = Tel;
	}
}