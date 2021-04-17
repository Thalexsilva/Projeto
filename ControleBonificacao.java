public class ControleBonificacao extends Funcionario{

  private double totalBonificacao = 0;

  public void registra(Funcionario f){
    System.out.println("Adicionando bonificacao do funcionario: " +f);
    this.totalBonificacao +=f.getBonificacao();
  }

  public double getTotalBonificacao(){
    return this.totalBonificacao;
  }
}