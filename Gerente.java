public class Gerente extends Funcionario {

    Leitura lc = new Leitura();

        public double getBonificacao() {
            return this.salario * 1.4 + 1000;
        }
 }