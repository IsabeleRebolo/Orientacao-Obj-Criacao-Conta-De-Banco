public class Main {
    public static void main(String[] args) {
    ContaBanco p1 = new ContaBanco();
    p1.setDono("Jubileu");
    p1.setNumConta(1111);
    p1.abrirConta("CC");
    p1.depositar(200);
    p1.estadoAtual();

    ContaBanco p2= new ContaBanco();
    p1.setDono("Eliza");
    p1.setNumConta(2222);
    p1.abrirConta("CP");
    p1.sacar(50);
    p1.estadoAtual();
    }
}
