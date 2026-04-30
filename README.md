# Java: Do Zero ao Spring Boot

(Esses exercícios foram gerados com IA pra captar todos os conhecimentos necessários pra evoluir pro próximo passo: O Spring Boot Framework)

## 🧱 Módulo 1: Fundamentos e Sintaxe (Aquecimento)

- [x] **1. Fatorial:** Calcule o fatorial de um número usando laço `for` ou `while`.
- [x] **2. Inversor de String:** Receba uma palavra e imprima ela de trás para frente sem usar métodos prontos como `StringBuilder.reverse()`.
- [x] **3. Jogo da Adivinhação:** O programa gera um número aleatório (1-100) e o usuário deve adivinhar. O programa diz se o palpite foi "maior" ou "menor".

## 🧬 Módulo 2: Orientação a Objetos - O Básico (Encapsulamento e Composição)

- [x] **4. Classe Pessoa:** Crie uma classe `Pessoa` com atributos privados (nome, idade). Crie os métodos Getters e Setters e impeça que a idade seja negativa.
- [x] **5. Conta Bancária:** Crie uma classe `Conta` com `saldo`. Crie métodos para `depositar` e `sacar`. O saque não pode ocorrer se o saldo for insuficiente.
- [x] **6. Composição (Carro e Motor):** Crie uma classe `Motor` (cavalos, tipo) e uma classe `Carro` que tenha um atributo do tipo `Motor`.
- [x] **7. Sistema de Notas:** Crie uma classe `Aluno` com uma lista de notas. Crie um método que calcule a média e outro que retorne se ele está aprovado (média >= 7).
- [x] **8. Sobrecarga de Métodos:** Na classe `Calculadora`, crie múltiplos métodos `somar` (recebendo dois inteiros, três inteiros, e dois double).

## 🏗️ Módulo 3: OOP Avançada - Herança, Polimorfismo e Interfaces

- [x] **9. Herança Simples:** Crie uma classe mãe `Funcionario` e classes filhas `Gerente` e `Desenvolvedor`.
- [x] **10. Polimorfismo:** Sobrescreva um método `calcularBonus()` nas classes filhas do exercício anterior. O gerente ganha 20% e o dev 10%.
- [x] **11. Interface Tributável:** Crie uma interface `Tributavel` com o método `calcularImposto()`. Implemente-a em classes como `Produto` e `Servico`.
- [x] **12. Classe Abstrata:** Crie uma classe abstrata `FormaGeometrica` com um método abstrato `calcularArea()`. Implemente em `Quadrado` e `Circulo`.
- [x] **13. Sistema de Login (Interfaces):** Crie uma interface `Autenticavel` com o método `autenticar(senha)`. Implemente no `Gerente` e em um `Cliente`.
- [x] **14. Enumerações (Enums):** Crie um enum `StatusPedido` (PROCESSANDO, ENVIADO, ENTREGUE). Crie uma classe `Pedido` que use esse enum e tenha um método para avançar o status.
- [x] **15. Enums com Métodos:** Adicione um método no enum `StatusPedido` que retorne o tempo estimado de entrega de acordo com o status.
- [x] **16. Sobrescrita de `toString()`:** Na classe `Pessoa`, sobrescreva o `toString()` para imprimir os dados em formato JSON (simulado em texto).
- [x] **17. Sobrescrita de `equals()`:** Crie duas instâncias de `Pessoa` com o mesmo CPF. Sobrescreva `equals` e `hashCode` para que o Java considere os dois objetos iguais.
- [x] **18. Modelagem de Loja:** Junte tudo: Crie uma `Loja` que tem uma lista de `Produtos` (eletrônicos, alimentos - usando herança) e calcule o valor total do estoque.

## 🚨 Módulo 4: Tratamento de Exceções (Preparando para erros de API)

- [x] **19. Try/Catch Básico:** Force um `ArithmeticException` (divisão por zero) e capture a exceção exibindo uma mensagem amigável.
- [x] **20. Múltiplos Catches:** Tente converter uma letra para número (`NumberFormatException`) ou acesse um array fora do limite. Capture ambas as exceções.
- [x] **21. Bloco Finally:** Simule a abertura e fechamento de um arquivo ou conexão. Garanta que o fechamento ocorra no `finally`.
- [x] **22. Exceção Customizada:** Crie uma classe `SaldoInsuficienteException` e lance-a no método `sacar` da sua Conta Bancária.
- [x] **23. Lançando Exceções (Throws):** Crie um método que valide um e-mail. Se não tiver "@", use `throw new IllegalArgumentException("E-mail inválido")`.

## 📚 Módulo 5: Collections e Estruturas de Dados

- [ ] **24. Manipulando Listas:** Crie um `ArrayList` de nomes. Adicione, remova, verifique se um nome existe e imprima todos com um laço `for-each`.
- [ ] **25. HashSet (Removendo Duplicatas):** Receba uma lista com nomes repetidos e insira-os em um `Set` para remover as duplicatas.
- [ ] **26. HashMap (Chave-Valor):** Crie um dicionário inglês-português usando `Map<String, String>`.
- [ ] **27. Iterando em Mapas:** Imprima todas as chaves e valores do mapa anterior usando `Map.Entry` ou `forEach`.
- [ ] **28. Contagem de Palavras:** Receba um texto longo e use um `HashMap` para contar quantas vezes cada palavra aparece.
- [ ] **29. Comparable:** Faça a classe `Produto` implementar `Comparable`. Ordene uma lista de produtos alfabeticamente usando `Collections.sort()`.
- [ ] **30. Comparator:** Crie um `Comparator` para ordenar a mesma lista de produtos, mas agora pelo Preço (do menor para o maior).
- [ ] **31. Generics Básico:** Crie uma classe `Caixa<T>` que pode guardar qualquer tipo de objeto e depois retorná-lo.
- [ ] **32. Métodos Genéricos:** Crie um método que recebe uma `List<T>` e imprime todos os seus elementos.
- [ ] **33. Fila e Pilha:** Brinque com `Queue` (LinkedList) simulando uma fila de banco, e `Stack` simulando o botão "Desfazer" de um editor de texto.

## 🚀 Módulo 6: Java 8+ (Streams, Lambdas e Optional - O "Padrão" Spring)

- [ ] **34. Lambda Básico:** Use `lista.forEach()` com uma função lambda para imprimir o nome de todos os clientes de uma lista.
- [ ] **35. Stream - Filter:** Dada uma lista de números, crie uma nova lista contendo apenas os pares usando `stream().filter()`.
- [ ] **36. Stream - Map:** Dada uma lista de objetos `Aluno`, use `stream().map()` para extrair apenas os nomes (String) e colocar em uma nova lista.
- [ ] **37. Stream - Reduce:** Some o valor de todos os salários de uma lista de funcionários usando `reduce()`.
- [ ] **38. Stream - GroupingBy:** Agrupe uma lista de pessoas pelo estado civil usando `Collectors.groupingBy()`.
- [ ] **39. API de Datas (LocalDate):** Crie um programa que calcule a diferença em dias entre a data de hoje e a data do seu nascimento.
- [ ] **40. Formatação de Datas:** Formate um `LocalDateTime` para o padrão brasileiro (`dd/MM/yyyy HH:mm`) usando `DateTimeFormatter`.
- [ ] **41. Introdução ao Optional:** Crie um método `buscarCliente(id)` que retorna um `Optional<Cliente>`.
- [ ] **42. Trabalhando com Optional:** Chame o método anterior e use `.ifPresent()` para imprimir o nome, e `.orElseThrow()` para lançar erro se não achar.
- [ ] **43. Records (Java 14+):** Crie um `record ClienteDTO(String nome, String email)` e veja como ele cria getters, toString e equals automaticamente.

## 🌐 Módulo 7: Preparação Direta para o Spring Boot

- [ ] **44. Simulando Injeção de Dependências:** Crie um `EmailService` e um `ClienteController`. Faça o Controller receber o Service pelo construtor (Injeção via Construtor).
- [ ] **45. Arquivos de Propriedades:** Crie um arquivo `config.properties`. Escreva um código Java que leia valores (ex: `db.url`) desse arquivo (muito comum no Spring).
- [ ] **46. Manipulação de Arquivos (NIO):** Crie um script que salva o nome de 5 usuários em um arquivo `.txt` e depois lê e imprime no console.
- [ ] **47. JSON Básico:** Adicione a biblioteca Jackson ou Gson no projeto (se usar Maven/Gradle) e converta um objeto `Usuario` em uma String JSON.
- [ ] **48. Projeto Final (CRUD em Memória):** Crie uma aplicação console de um Banco. Deve ter as classes `ContaController`, `ContaService`, `ContaRepository` (usando Listas). Implemente criar conta, buscar conta, depositar, sacar e listar todas, chamando as camadas em ordem (Controller -> Service -> Repository).
- [ ] **49. Persistência Real com JDBC:** Pegue o Projeto Final (o CRUD 50) e substitua o armazenamento em List por um banco de dados relacional de verdade.
- [ ] **50. Servidor HTTP Nativo (O seu "Mini Spring"):** Transforme o seu sistema em uma API! Sem usar nenhum framework, utilize a classe nativa com.sun.net.httpserver.HttpServer do Java para subir um servidor web na porta 8080. Crie contextos (rotas) como /api/contas. Quando você acessar essa URL no navegador ou no Postman, o seu código deve chamar o seu Controller, pegar as contas, converter para uma String JSON e devolver como resposta HTTP.

# Projetos

## Projeto 1: Sistema de Gestão de Biblioteca (Foco em OOP, Arquitetura e Persistência)

- **O que o sistema deve fazer:**
    - Gerenciar **Livros** (Título, Autor, ISBN, Quantidade em estoque) e **Usuários** (com herança: `Aluno` tem limite de 3 livros, `Professor` tem limite de 5).
    - Realizar **Empréstimos** e **Devoluções**. Um empréstimo deve registrar a data atual (`LocalDate`) e a data limite de devolução (ex: 7 dias para alunos, 14 para professores).
    - Calcular **Multas**: Se o livro for devolvido com atraso, o sistema calcula uma multa diária usando a API de Datas do Java 8.
    - **Persistência em Arquivo:** Ao fechar o programa, os dados de usuários e livros não podem sumir. Você deve salvá-los em arquivos `.txt`, `.csv` ou usar Serialização de Objetos do Java (`.dat`) e recarregá-los ao abrir o app.
- **Habilidades Comprovadas no GitHub:**
    - Domínio de Orientação a Objetos (Herança, Polimorfismo e Encapsulamento rigoroso).
    - Uso de `Interfaces` para criar os repositórios (ex: `LivroRepository`).
    - Manipulação de Arquivos (NIO2, `FileReader`, `FileWriter` ou `ObjectOutputStream`).
    - Tratamento de Exceções Customizadas (ex: `LivroIndisponivelException`, `LimiteEmprestimoExcedidoException`).

## Projeto 2: Analisador de Dados Financeiros em Lote (Foco em Streams, Lambdas e I/O)

Neste projeto, você vai lidar com processamento de dados. Imagine que um banco exportou as movimentações de um cliente em um arquivo CSV gigantesco e precisa de um relatório.

- **O que o sistema deve fazer:**
    - Ler um arquivo `.csv` simulado com milhares de linhas. Cada linha tem: `ID, Data (dd/MM/yyyy), Descrição, Categoria (Alimentação, Transporte, Salário), Tipo (Receita/Despesa), Valor`.
    - Você vai carregar esses dados em memória criando uma lista de objetos `Transacao`.
    - Usando **exclusivamente a Stream API e Lambdas**, o programa deve gerar os seguintes relatórios no console:
        - Saldo final do período.
        - Total gasto por Categoria (usando `Collectors.groupingBy`).
        - Mês com o maior número de despesas.
        - A transação mais cara do arquivo.
    - Por fim, o sistema exporta um "Resumo" para um arquivo `.json` (você pode adicionar a biblioteca Gson ou Jackson ao projeto para fazer essa conversão).
- **Habilidades Comprovadas no GitHub:**
    - Alta proficiência em Java 8+ (Filters, Maps, Reducers). Isso é **vital** no dia a dia com Spring.
    - Parseamento de Strings e formatação de `DateTimeFormatter`.
    - Integração com bibliotecas externas de JSON.
    - Performance na leitura de arquivos usando `BufferedReader`.

## Projeto 3: Servidor de Chat Multithread (Foco em Redes e Concorrência)

Este é o projeto que vai te destacar da maioria dos iniciantes. Você vai construir as bases da comunicação via rede (que o Spring Web faz por você) usando `Sockets` e lidar com a maior dor de cabeça da computação: Concorrência (`Threads`).

- **O que o sistema deve fazer:**
    - Criar um programa **Servidor** que fica rodando no terminal ouvindo uma porta específica (ex: porta `8080`).
    - Criar um programa **Cliente** que conecta nesse servidor. O usuário digita seu "Nickname" e entra na sala.
    - Múltiplos clientes podem conectar ao mesmo tempo. Para que o servidor não trave esperando a mensagem de um, você precisará usar **Threads** (uma thread para cada cliente conectado).
    - **Broadcast:** Quando o Cliente A manda uma mensagem, o Servidor recebe e repassa para todos os outros Clientes conectados.
    - **Mensagem Direta (Desafio extra):** Implementar um comando (ex: `/msg Maria Olá!`) para enviar uma mensagem privada apenas para um cliente específico.
- **Habilidades Comprovadas no GitHub:**
    - Entendimento profundo de TCP/IP, Sockets, `InputStream` e `OutputStream`.
    - Domínio de `Threads` e `Runnable` (saber como o Java lida com múltiplas tarefas simultâneas).
    - Uso de coleções Thread-Safe (ex: usar `ConcurrentHashMap` ou `CopyOnWriteArrayList` para guardar a lista de clientes conectados sem dar erro de acesso simultâneo).
    - Design Patterns (como o _Observer_, para notificar os clientes).
