public abstract class Pessoa{

  protected String Nome;
  protected String Tel;
  protected String Cpf;
  protected Endereco  Ender = new Endereco();
  Leitura lc = new Leitura();

void CadPessoa(){
      System.out.println("\n-----Cadastro Pessoa-----");
      this.Nome=lc.entDados("\nNome: ");
      this.Tel=lc.entDados("\nTel: ");
      this.Cpf=lc.entDados("\nCpf: ");
      Ender.setRua((lc.entDados("\nRua : ")));
      Ender.setNumero(Integer.parseInt(lc.entDados("\nNumero : ")));
      Ender.setCep(lc.entDados("\nCep: "));
      Ender.setCidade((lc.entDados("\nCidade : ")));
      Ender.setEstado((lc.entDados("\nEstado : ")));
  }

public String getNome(){
    return Nome;
  }

  public String getTel(){
    return Tel;
  }

  public void setNome(String Nome){
		this.Nome = Nome;
	}
  public void setTel(String Tel){
		this.Tel = Tel;
	}

  // endereco 
  public Endereco getEnder(){
		return Ender;
	}

	public void setEnder(Endereco Ender){
		this.Ender = Ender;
	}
}