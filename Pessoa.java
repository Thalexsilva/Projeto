


//Thales de Oliveira Silva RA:1914855
public abstract class Pessoa {

  protected String Nome;
  protected String Tel;
  protected String Cpf;
  protected Endereco  Ender = new Endereco();
  Leitura lc = new Leitura();

final void CadPessoa() throws NumEx {
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

}