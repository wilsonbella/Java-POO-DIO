public class Carro extends Veiculo {

    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado");
    }
    private void conferirCombustivel(){
        System.out.println("Conferirndo combustível");
    }
    private void conferirCambio(){
        System.out.println("Conferirndo se o câmbio está em ponto P");
    }
}
