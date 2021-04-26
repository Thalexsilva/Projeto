//Thales de Oliveira Silva RA:1914855
public abstract class Veiculo{

  protected int Ano;
  protected String Cor;
  protected String Placa;
  protected char TipoComb; //'G','D','E'
  protected int KM;
  protected double VD; //valor Diaria
  protected String Cate;
  protected String Tarifa;
  Leitura lc =new Leitura();
  
  //Cadastrar veiculo
  void CadVeiculo(){
      System.out.println("\n-----Cadastro Veiculo-----");
      this.Ano=Integer.parseInt(lc.entDados("\nAno: "));
      this.Cor=lc.entDados("\nCor: ");
      this.Placa=lc.entDados("\nPlaca:  ");
      this.TipoComb=lc.entDados("\nCombustivel E=Etanol,G=Gasolina,D=Diesel: ").charAt(0);
      this.KM=Integer.parseInt(lc.entDados("\nKM atual Veículo: "));
      this.Cate=lc.entDados("\nValor da Diária: ");  
  }

  
  
}