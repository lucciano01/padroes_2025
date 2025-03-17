import cartaoa.BoletoCartaoA;
import factoryMethod.cartaoA.CartaoA;

public class App {

    public static void main(String[] args) {
        System.out.println("-----Cartão A-------");
        var cartaoA = new CartaoA();
        cartaoA.gerarBoleto(10, 100.0);
        cartaoA.gerarBoleto(30, 100.0);
        cartaoA.gerarBoleto(60, 100.0);
    }
}
