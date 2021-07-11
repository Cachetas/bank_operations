package banco;

public class ContaBanco {                        // Conta do banco.
	
	private double balanco = 0;                  // Cada conta inicializa a zero
	 
    public ContaBanco(double balanco) {          // Constructor da conta, composto pelo balanco.
        this.balanco = balanco;
    }
 
    public void deposito(double montante) {      // Metodo deposito, que coloca o valor do montante na conta.
        this.balanco += montante;
    }
    
    public void levantamento(double montante) {  // Metodo levantamento, que retira o montante da conta.
        this.balanco -= montante;
    }

    public double getBalanco() {                 // Metodo getBalanco, que mostra o valor disponivel na conta.
        return this.balanco;
    }
}