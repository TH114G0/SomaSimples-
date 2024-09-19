# SomaSimples

**SomaSimples** é uma aplicação em Java que permite ao usuário somar uma quantidade definida de números inteiros. O programa utiliza tratamento de exceções para garantir entradas válidas e oferece uma interface simples no console para inserir e somar os números.

## Funcionalidades

- Solicita ao usuário a quantidade de números a serem somados.
- Aceita apenas números inteiros, com tratamento de exceções para entradas inválidas.
- Exibe o resultado da soma de todos os números fornecidos.
- Permite continuar somando novos números ou sair do programa.

## Tecnologias Utilizadas

- **Java** - Linguagem principal usada no desenvolvimento.
- **Java Collections (List)** - Utilizada para armazenar os números inseridos.
- **Scanner** - Para entrada de dados via console.
- **Tratamento de Exceções** - Para garantir entradas válidas do usuário.

## Pré-requisitos

Antes de começar, certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.

- Java 8 ou superior

## Como Executar

1. Clone o repositório:

    ```bash
    git clone https://github.com/TH114G0/SomaSimples-.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd somasimples
    ```

3. Compile o código:

    ```bash
    javac -d bin src/br/com/alura/Main.java
    ```

4. Execute o programa:

    ```bash
    java -cp bin br.com.alura.Main
    ```

## Exemplo de Uso

```bash
Informe a quantidade de números que deseja somar: 3
Informe o valor que deseja inserir: 5
Informe o valor que deseja inserir: 10
Informe o valor que deseja inserir: 15
----------------------------------------
[5, 10, 15] soma desses valores é = 30
----------------------------------------
Deseja continuar? (s/n)
```
## Contribuição
**Contribuições** são bem-vindas! Sinta-se à vontade para enviar pull requests e abrir issues para melhorias ou correções.

**Licença**
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
