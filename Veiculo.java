public abstract class Veiculo{

  protected int Ano;
  protected String Cor;
  protected String Placa;
  protected char TipoComb; //'G','D','E'
  protected int KM;
  protected double VD; //valor Diaria
  Leitura lc =new Leitura();
  /*contrucao
  public Veiculo(){}
  public Veiculo(int Ano,String Cor,String Placa,char TipoComb,int KM,double VD){
    this.Ano = Ano;
    this.Cor= Cor;
    this.Placa= Placa;
    this.TipoComb = TipoComb;
    this.KM = KM;
    this.VD =VD;} */
  //Cadastrar veiculo
  void CadVeiculo(){
      System.out.println("\n-----Cadastro Veiculo-----");
      this.Ano=Integer.parseInt(lc.entDados("\nAno: "));
      this.Cor=lc.entDados("\nCor: ");
      this.Placa=lc.entDados("\nPlaca: : ");
      this.TipoComb=lc.entDados("\nCombustivel E=Etanol,G=Gasolina,D=Diesel: ").charAt(0);
      this.KM=Integer.parseInt(lc.entDados("\nKM atual Veículo: "));
      this.VD=Double.parseDouble(lc.entDados("\nValor da Diária: "));  
  }
  
  /*public int getAno(){
    return Ano;
  }

  public String getCor(){
    return Cor;
  }

  public String getPlaca(){
    return Placa;
  }

  public char getTipoComb(){
    return TipoComb;
  }

  public double getKM(){
    return KM;
  }

  public double getVD(){
    return VD;
  }

  public void setAno(int Ano){
		this.Ano = Ano;
	}

  public void setCor(String Cor){
		this.Cor = Cor;
	}

  public void setPlaca(String Placa){
		this.Placa = Placa;
	}

  public void setTipoComb(char TipoComb){
		this.TipoComb = TipoComb;
	}

  public void setKM(int KM){
		this.KM = KM;
	}

  public void setVD(double VD){
		this.VD = VD;
	}*/
}