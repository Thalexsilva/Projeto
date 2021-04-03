public class Veiculo{

  protected int ano;
  protected String cor;
  protected String placa;
  protected char tipoComb; //'G'/'A','D','E'
  protected int KM;
  protected double VD; //valor Diaria

  public int getVeiculoID(){
    return veiculoID;
  }

  public int getAno(){
    return ano;
  }

  public int getNumPortas(){
    return numPortas;
  }

  public String getCor(){
    return cor;
  }

  public String getPlaca(){
    return placa;
  }

  public char getTipoCombustivel(){
    return tipoCombustivel;
  }

  public double getKM(){
    return KM;
  }

  public double getValorDiaria(){
    return valorDiaria;
  }

  public void setVeiculoID(int veiculoID){
		this.veiculoID = veiculoID;
	}

  public void setAno(int ano){
		this.ano = ano;
	}

  public void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}

  public void setCor(String cor){
		this.cor = cor;
	}

  public void setPlaca(String placa){
		this.placa = placa;
	}

  public void setTipoCombustivel(char tipoCombustivel){
		this.tipoCombustivel = tipoCombustivel;
	}

  public void setKM(double KM){
		this.KM = KM;
	}

  public void setValorDiaria(double valorDiaria){
		this.valorDiaria = valorDiaria;
	}
}