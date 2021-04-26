//Thales de Oliveira Silva RA:1914855
public class Cliente extends Pessoa{
  
  
  private int Desc;
  
  Leitura lc = new Leitura();
  
  
  public Cliente(){}
  
  //Cadastrar Cliente

  void CadCliente() {
       System.out.println("\n-----Cadastro Cliente-----");
       super.CadPessoa();
       Desc =Integer.parseInt(lc.entDados("Desconto cliente em %: "));
  }


  
 
}