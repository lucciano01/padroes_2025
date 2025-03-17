package factoryMethod;

public abstract class Cartao {

    public Boleto gerarBoleto(int qtdeDiasAtraso, double valor){
        var boleto = criarBoleto(qtdeDiasAtraso, valor);

        System.out.println("Valor R$ :" +boleto.getValor() + " - Dias de Atraso: " +qtdeDiasAtraso);
        System.out.println("Juros R$: " +boleto.calcularJuros());
        System.out.println("Multa R$: " +boleto.calcularMulta());

        return boleto;
    }

    public abstract Boleto criarBoleto(int qtdeDiasDeAtraso, double valor);
}
