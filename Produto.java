package stream_api_op_avancadas;

import java.util.List;
import java.util.Optional;

class Produto {
    private String nome;
    private Double preco;
    
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override 
    public String toString() {
        return String.format("Produto{nome='%s', preco=R$ %.2f}", nome, preco);
    }

    public static void buscarEExibirProduto(List<Produto> lista, String nomeBuscado) {
        // 5) Buscar usando stream().filter().findFirst().retornando Optical<Produto>
        Optional<Produto> produtoOptional = lista.stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nomeBuscado))
                .findFirst();
        System.out.println("Buscando por \"" + nomeBuscado + "\":");

        // 6) Tratamento do resultado com ifPresentOrElse()
        produtoOptional.ifPresentOrElse(
            p -> System.out.println("Encontrado -> Nome: " + p.getNome() + " | Preço: R$ " + String.format("%.2f", p.getPreco())),
            () -> System.out.println("Produto não encontrado.")
        );
    }
}
