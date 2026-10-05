package POO;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luana");
        cliente1.comprar(80);

        Cliente cliente2 = new Cliente("Rodrigo");
        cliente2.aumentarLimite(120);
        cliente2.comprar(20);

        System.out.println("Saldo atualizado da " + cliente1.nome + ": " + cliente1.limiteCredito);
        System.out.println("Saldo atualizado do " + cliente2.nome + ": " + cliente2.limiteCredito);
    }
}
