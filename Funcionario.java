//Thales de Oliveira Silva RA:1914855
public class Funcionario extends Pessoa{
  
  final private double salario = 900;

  Leitura lc = new Leitura();
  
  public Funcionario(){

  }
  public Funcionario(double salario, String Nome,Endereco Ender,String Tel,String Cpf){
    //this.salario = salario;
    this.Nome = Nome;
    this.Ender= Ender;
    this.Tel= Tel;
    this.Cpf = Cpf;}
    
  //Cadastrar Funcionario
  void CadFunc(){
       System.out.println("\n-----Cadastro Funcionario-----");
       super.CadPessoa();
  }

  //Get e Set

 /*public double getSalario(){
    return salario;
  }

  public void setSalario(double salario){
    this.salario.salario;
  }*/
 
}