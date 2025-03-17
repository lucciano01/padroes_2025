package factoryMethod.cartaoA;

import factoryMethod.Boleto;
import factoryMethod.Cartao;

public class CartaoA extends Cartao {

    @Override
    public Boleto criarBoleto(int qtdeDiasDeAtraso, double valor) {
        switch (qtdeDiasDeAtraso){
            case 10:
                return new BoletoCartaoADezDias(valor);
            case 30:
                return new BoletoCartaoATrintaDias(valor);
            case 60:
                return new BoletoCartaoASessentaDias(valor);
            default:
                throw new IllegalArgumentException("Dias de atraso Invalido");
        }

    }
}
