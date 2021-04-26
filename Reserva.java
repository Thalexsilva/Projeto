//Thales de Oliveira Silva RA:1914855
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Reserva{
   
  private int tipo; 
  private Date dataLocacao;
  private Date dataDevolucao;
  
  public Reserva(){}

   //complicado Fazer depois
   
   public void setData(String dataLocacao){
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      try {  
        this.dataLocacao = sdf.parse(dataLocacao);   
    } catch (ParseException e) {e.printStackTrace();}
     this.dataLocacao = sdf.format(this.dataLocacao);  //teste
  }




  //private void metodoPag() {};
  
  

  

}