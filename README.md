Sistema de Consulta de Produtos em Java

Este projeto é um programa simples em Java que utiliza a estrutura HashMap para armazenar produtos e seus respectivos códigos. O usuário pode consultar os produtos digitando um código no terminal.

📌 Funcionalidades
  Cadastro de produtos utilizando HashMap
  Consulta de produtos pelo código
  Entrada de dados com Scanner
  Repetição da consulta até que o usuário digite 0
  
🛠️ Tecnologias utilizadas
  Java
  HashMap (java.util.HashMap)
  Scanner (java.util.Scanner)

📂 Estrutura do Projeto
    exerc2_12/
     └── Produtos.java
     
▶️ Como executar
    Compile o arquivo:
    javac Produtos.java
    Execute o programa:
    java Produtos
    
💻 Exemplo de execução
  {1=Pão, 2=Leite}
  
  Digite o codigo:
  1
  Pão
  
  Digite o codigo:
  2
  Leite
  
  Digite o codigo:
  5
  null
  
  Digite o codigo:
  0
  null
  
  📖 Explicação do código
  
  O programa cria um HashMap chamado produtos, onde:
  
  a chave (key) é um número inteiro representando o código do produto;
  o valor (value) é o nome do produto.
  
  Exemplo:
  
  produtos.put(1, "Pão");
  produtos.put(2, "Leite");
  
  Depois, o usuário informa um código pelo teclado:
  
  codigoProcurado = entrada.nextInt();
  
  O programa busca o produto correspondente usando:
  
  produtos.get(codigoProcurado)
  
  O laço do-while mantém o programa em execução até que o código 0 seja digitado.
  
⚠️ Observação
  
  Se o usuário digitar um código inexistente, o programa retornará:
  
  null

  Isso acontece porque não há produto associado àquela chave no HashMap.
