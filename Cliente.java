public class Cliente extends Pessoa{
  
  
  protected int Desc;
  
  Leitura lc = new Leitura();
  
  
  public Cliente(){

  }
  public Cliente(String Nome,Endereco Ender,String Tel,String Cpf,int Desc){
    this.Nome = Nome;
    this.Ender= Ender;
    this.Tel= Tel;
    this.Cpf = Cpf;
    this.Desc = Desc;}
    

  //Cadastrar Cliente
  void CadCliente(){
       System.out.println("\n-----Cadastro Cliente-----");
       super.CadPessoa();
  }

  //Get e Set

  
 
}