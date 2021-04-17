public class Atendente extends Funcionario{
  
    Leitura lc = new Leitura();
    
  public Atendente(){
  }

  public double getBonificacao() {
            return this.salario * 1.0 + 700;
        }
}

vai de call ?