//Thales de Oliveira Silva RA:1914855


public class TstLocacao{

  public static void main(String arg[]){

    int op;

    Cliente c1 = new Cliente();
    Carro ca1 = new Carro();
    Funcionario f1 = new Funcionario();

    op=Integer.parseInt(c1.lc.entDados("\n----Menu----\n1-Cadastro\n2-Reserva"));
    switch(op){
      case 1:
        op=Integer.parseInt(c1.lc.entDados("\n----Cadastro----\n1-Cadastro Veiculo\n2-Cadastro Cliente\n3-Cadastro Funcionário"));
        switch(op){
            case 1:
            ca1.CadVeiculo();
                break;
            case 2:   
            
             
                c1.CadCliente();
                 break;
            case 3:
                f1.CadFunc();
                break;     
            default:
        c1.lc.entDados("\nopção inválida"); }    
      
      case 2:
        
        break;
      
      default:
        c1.lc.entDados("\nopção inválida");
      }
    }
    
    }
