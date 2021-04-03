public class ClientePJ extends Cliente{
  
  private String Cnpj;

  

  public ClientePJ(String Nome,Endereco Ender,String Tel,String Cpf, int Desc){
    super(Nome, Ender, Tel,Cpf,Desc);
    this.Cnpj = Cpf;
    }
  
  public double Desconto (int Desc){
    return 0.01*(double)Desc;
  }

  //Get 
   public String getCnpj(){
    return Cnpj;
  }

   
  }
