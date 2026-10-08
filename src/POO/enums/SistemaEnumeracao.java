package POO.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        // values() é um metodo para listar todos os valores de um enum
        for (EstadoBrasileiro eb: EstadoBrasileiro.values()) {
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
        }

        //valueOf() busca um enum pelo seu nome
        System.out.println(EstadoBrasileiro.valueOf("MINAS_GERAIS").getNome());
    }
}
