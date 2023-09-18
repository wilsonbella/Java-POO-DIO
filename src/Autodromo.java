public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("123654");

        Moto cg125 = new Moto();
        cg125.setChassi("564231");
        cg125.ligar();

    }
}
