package stream_api_op_avancadas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1 e 2) Criar lista de produtos de exemplo
        List<Produto> catalogo = List.of(
            new Produto("Notebook", 3500.00),
            new Produto("Mouse", 89.90),
            new Produto("Teclado Mecânico", 250.00),
            new Produto("Monitor", 1200.00),
            new Produto("Mousepad", 45.00),
            new Produto("Headset", 150.00)
        );
        
        System.out.println("=== CATALOGO COMPLETO ===");
        catalogo.forEach(System.out::println);

        // 3) Filtrando produtos com preco maior que 100 usando Stream
        List<Produto> produtosAcimaDe100 = catalogo.stream()
                .filter(p -> p.getPreco() > 100.0)
                .collect(Collectors.toList());
                
        System.out.println("\n=== PRODUTOS COM PREÇO > R$ 100.00 ===");
        produtosAcimaDe100.forEach(System.out::println);

        // 4) Ordenando os produtos por nome em ordem alfabetica
        List<Produto> produtosOrdenados = catalogo.stream()
                .sorted(Comparator.comparing(Produto::getNome))
                .collect(Collectors.toList());

        System.out.println("\n=== PRODUTOS ORDENADOS POR NOME ===");
        produtosOrdenados.forEach(System.out::println);

        // 5 e 6) Buscas demonstrando o uso de Optional e ifPresentOrElse()
        System.out.println("\n=== TESTES DE BUSCA COM OPTIONAL ===");
        
        // Exemplo 1: Produto existente
        Produto.buscarEExibirProduto(catalogo, "Monitor");

        // Exemplo 2: Produto inexistente
        Produto.buscarEExibirProduto(catalogo, "Webcam 4K");
    }
}
