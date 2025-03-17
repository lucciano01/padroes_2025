package cartaoa;

public class BoletoCartaoA {

    public double calcularJuros(int qtdDiasAtraso, double valor){
        if(qtdDiasAtraso == 10){
            return valor * 0.02;
        }else if(qtdDiasAtraso == 30) {
            return valor * 0.05;
        } else if(qtdDiasAtraso == 60) {
            return valor * 0.1;
        }
        throw new IllegalArgumentException("Valor inválido");
    }
}
