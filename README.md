# ExercicioWriteCSV

Este projeto foi desenvolvido como um **exercício prático em Java** para treinar a leitura e escrita de arquivos CSV, além de reforçar o uso de classes, métodos, exceções e manipulação de dados.  
O objetivo é **ler um arquivo CSV com informações de produtos**, calcular o total de cada um (`valor * quantidade`) e **gerar um novo arquivo CSV** com esses resultados.

---

## 💡 Objetivo do projeto
O programa lê um arquivo `.csv` contendo produtos no formato:
nome,valor,quantidade

css
Copiar código
Em seguida, ele calcula o total de cada produto e grava os resultados em um novo arquivo de saída, no formato:
nome,total

go
Copiar código

Exemplo de entrada (`products.csv`):
TV,1000.00,2
Mouse,50.00,5

css
Copiar código

Exemplo de saída (`summary.csv`):
TV,2000.00
Mouse,250.00

yaml
Copiar código

---

## 🧩 Estrutura do projeto
O código foi separado em pacotes para manter a organização:

- `application` → contém a classe principal (`Main`) que inicia o programa  
- `entities` → classes que representam os objetos do sistema (ex: `Product`, `ProductCalc`)  
- `services` → classes responsáveis por ler o arquivo, fazer os cálculos e gerar a saída  

Essa estrutura ajuda a entender a ideia de **separação de responsabilidades** — cada parte do código tem uma função específica.

---

## 🛠️ Como executar
1. Compile o programa:
   ```bash
   javac -d out src/application/Main.java src/entities/*.java src/services/*.java
Execute o programa:

bash
Copiar código
java -cp out application.Main
Informe o caminho completo (path) do arquivo CSV de entrada e o local onde deseja salvar o novo arquivo.

Exemplo no Windows:

csharp
Copiar código
Digite o caminho do arquivo de origem: C:\Users\Raphael\Documents\products.csv
Digite o caminho da pasta de destino: C:\Users\Raphael\Documents\out.csv
O programa criará um arquivo chamado out.csv dentro da pasta informada.

📘 Sobre o aprendizado
Este projeto foi feito com o objetivo de praticar leitura e escrita de arquivos, manipulação de listas e classes em Java.
Ainda é um exercício simples, mas já representa um passo importante na fixação de conceitos fundamentais da linguagem.

Eu também sei que, em casos reais, para cálculos monetários o ideal seria usar BigDecimal ao invés de double, e que existem formas mais robustas de trabalhar com CSV (como bibliotecas externas), mas aqui a ideia foi entender e praticar a lógica “na mão”.

📂 Exemplo de estrutura de pastas
css
Copiar código
ExercicioWriteCSV/
│
├── src/
   ├── application/
   │   └── Main.java
   ├── entities/
   │   ├── Product.java
   │   └── ProductCalc.java
   └── services/
       ├── PullProductsService.java
       ├── ProductCalculeService.java
       └── CreateArchiveService.java

🧠 O que este projeto demonstra
Entendimento básico de POO (Programação Orientada a Objetos)

Uso de pacotes e organização de classes

Leitura e escrita de arquivos CSV com BufferedReader e BufferedWriter

Uso de try-with-resources para fechar arquivos automaticamente

Manipulação de listas (ArrayList) e strings (split, trim, etc.)

Aplicação de boas práticas iniciais de estruturação de projeto

🗒️ Observação final
Este projeto é um exercício de aprendizado e foi feito para treinar conceitos fundamentais de Java, sem foco em bibliotecas externas ou estruturas avançadas.
Com o tempo, pretendo aprimorar e refatorar o código conforme meu aprendizado evoluir.

✉️ Autor
Raphal Salles - Londrina/PR
