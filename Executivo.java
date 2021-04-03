public class Executivo extends Automovel {

private Double vlOpcionais;

public Executivo(){
        super.veiculoID = Utilitaria.idVeiculo++;
    }
    
    public Executivo(String placa, String cor, int numPortas, char tipoCombustivel, long quilometragem, double valorDiaria, double vlOpcionais){
        super(placa,cor,numPortas,tipoCombustivel,quilometragem,valorDiaria);
        super.veiculoID = Utilitaria.idVeiculo++;
        this.vlOpcionais = vlOpcionais;
    }

    public double getVlOpcionais() {
        return vlOpcionais;
    }

    public void setVlOpcionais(Double vlOpcionais) {
        this.vlOpcionais = vlOpcionais;
    }
}