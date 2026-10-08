package POO;

public class Cliente {
    String nome;
    double limiteCredito = 100;

    public void comprar(double valorProduto) {
        limiteCredito = limiteCredito - valorProduto;
    }

    public void aumentarLimite(double novoLimite) {
        limiteCredito = novoLimite;
    }

    // Construtor: tem o mesmo nome da classe e não possui retorno
    public Cliente(String nome) {
        this.nome = nome;
    }
}
