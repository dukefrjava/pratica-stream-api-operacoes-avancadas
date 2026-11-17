# Catálogo de Produtos em Java

Este projeto consiste em uma aplicação de console desenvolvida em Java para praticar a manipulação de coleções utilizando a Stream API e o tratamento seguro de valores ausentes com a classe `Optional`.

## Objetivo

Simular o gerenciamento básico de um catálogo de produtos em memória, aplicando boas práticas do Java moderno para evitar exceções como `NullPointerException` e tornar o código mais declarativo e legível.

## Funcionalidades Implementadas

* **Modelagem de Domínio:** Criação da classe `Produto` contendo os atributos `nome` (`String`) e `preco` (`Double`), além de construtor, métodos getters e sobrescrita do método `toString()`.
* **Filtragem de Dados:** Uso de `stream().filter().collect(Collectors.toList())` para extrair uma sublista contendo apenas os produtos com valor superior a R$ 100,00.
* **Ordenação:** Uso de `stream().sorted()` em conjunto com `Comparator.comparing()` para organizar os itens do catálogo em ordem alfabética pelo nome.
* **Busca Segura:** Implementação de busca por nome utilizando `stream().filter().findFirst()` retornando um `Optional<Produto>`, tratado de forma explícita com o método `ifPresentOrElse()`.

## Estrutura do Projeto

```text
catalogo-produtos/
├── src/
│   ├── Produto.java
│   └── Main.java
└── README.md
```

## Requisitos

* Java Development Kit (JDK) 11 ou superior instalado.

## Como Executar

1. Clone este repositório para a sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/catalogo-produtos.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd catalogo-produtos/src
   ```

3. Compile os arquivos Java:
   ```bash
   javac Produto.java Main.java
   ```

4. Execute a aplicação:
   ```bash
   java Main
   ```
