# Calculadora de Idade

Boas-vindas ao repositório do exercício Calculadora de Idade

Para realizar o exercício, atente-se a cada passo descrito a seguir e se tiver **qualquer dúvida**, nos envie no _Slack_ da turma! #vqv 🚀

Aqui, você vai encontrar os detalhes de como estruturar o desenvolvimento do seu exercício a partir desse repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

## Termos e acordos
Ao iniciar este exercício, você concorda com as diretrizes do [Código de Conduta e do Manual da Pessoa Estudante da Trybe](https://app.betrybe.com/learn/student-manual/codigo-de-conduta-da-pessoa-estudante).

## Entregáveis

<details>
  <summary>🤷🏽‍♀️ Como entregar</summary><br />

Para entregar o seu exercício, você deverá criar um _Pull Request_ neste repositório.

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://app.betrybe.com/learn/course/5e938f69-6e32-43b3-9685-c936530fd326/module/fc998c60-386e-46bc-83ca-4269beb17e17/section/fe827a71-3222-4b4d-a66f-ed98e09961af/day/1a530297-e176-4c79-8ed9-291ae2950540/lesson/2b2edce7-9c49-4907-92a2-aa571f823b79) e nosso [Blog - Git & GitHub](https://blog.betrybe.com/tecnologia/git-e-github/) sempre que precisar!
</details>

<details>
  <summary>👨‍💻 O que deverá ser desenvolvido</summary><br />

<!-- 🤔 Explicar brevemente o que será realizado ao longo do exercício. Aqui, é a porta de entrada para o exercício como projeto. 
Exemplo: Vamos fazer um exercício que vai deixar nítido como funções,com responsabilidades bem definidas,deixam o código mais bem escrito. Para isso, vamos criar uma série de funções com respostas já definidas e exercitar nossa lógica de programação.
-->

`[atualizar]`

</details>

<details>
  <summary><strong>📝 Habilidades a serem trabalhadas</strong></summary>

Neste exercício, verificamos se você é capaz de:

- Criar classes customizadas de exceções.
- Criar validações que lancem exceções.
- Utilizar o decorador ExceptionHandler do Spring para gerenciar exceções.

</details>

## Orientações

<details>

   <summary><strong>‼ Antes de começar a desenvolver </strong></summary>

1. Clone o repositório

- Use o comando: `git clone <url do repositório>`
- Entre na pasta do repositório que você acabou de clonar:
    - `cd <nome do repositório>`

2. Instale as dependências

    - `mvn install`  

3. Crie uma branch a partir da branch `main`

- Verifique que você está na branch `main`
    - Exemplo: `git branch`
- Se você não estiver, mude para a branch `main`
    - Exemplo: `git checkout main`
- Agora, crie uma branch à qual você vai submeter os `commits` do seu exercício:
    - Você deve criar uma branch no seguinte formato: `nome-sobrenome-nome-do-exercício`;
    - Exemplo: `git checkout -b maria-soares-lessons-learned`

4. Crie na raiz do exercício os arquivos que você precisará desenvolver:

- Verifique que você está na raiz do exercício:
    - Exemplo: `pwd` -> o retorno vai ser algo tipo _/Users/maria/code/**sd-0x-project-lessons-learned**_
- Crie os arquivos index.html e style.css:
    - Exemplo: `touch index.html style.css`

5. Adicione as mudanças ao _stage_ do Git e faça um `commit`

- Verifique que as mudanças ainda não estão no _stage_:
    - Exemplo: `git status` (devem aparecer listados os novos arquivos em vermelho)
- Adicione o novo arquivo ao _stage_ do Git:
    - Exemplo:
        - `git add .` (adicionando todas as mudanças - _que estavam em vermelho_ - ao stage do Git)
        - `git status` (devem aparecer listados os arquivos em verde)
- Faça o `commit` inicial:
    - Exemplo:
        - `git commit -m 'iniciando o exercício. VAMOS COM TUDO :rocket:'` (fazendo o primeiro commit)
        - `git status` (deve aparecer uma mensagem tipo _nothing to commit_ )

6. Adicione a sua branch com o novo `commit` ao repositório remoto

- Usando o exemplo anterior: `git push -u origin maria-soares-lessons-learned`

7. Crie um novo `Pull Request` _(PR)_

- Vá até a página de _Pull Requests_ do [repositório no GitHub](https://github.com/tryber/sd-0x-project-lessons-learned/pulls)
    - Clique no botão verde _"New pull request"_
    - Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
- Coloque um título para o seu _Pull Request_
    - Exemplo: _"Cria tela de busca"_
- Clique no botão verde _"Create pull request"_

- Adicione uma descrição para o _Pull Request_, um título nítido que o identifique, e clique no botão verde _"Create pull request"_

 <img width="1335" alt="Exemplo de pull request" src="https://user-images.githubusercontent.com/42356399/166255109-b95e6eb4-2503-45e5-8fb3-cf7caa0436e5.png">

- Volte até a [página de _Pull Requests_ do repositório](https://github.com/tryber/sd-0x-project-lessons-learned/pulls) e confira que o seu _Pull Request_ está criado

</details>

<details>

<summary><strong>⌨️ Durante o desenvolvimento</strong></summary>

Faça `commits` das alterações que você fizer no código regularmente, pois assim você garante visibilidade para o time da Trybe e treina essa prática para o mercado de trabalho :) ;

- Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto;
- Os comandos que você utilizará com mais frequência são:
    - `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_;
    - `git add` _(para adicionar arquivos ao stage do Git)_;
    - `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_;
    - `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_;
    - `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_.

</details>

<details>
<summary><strong>🎛 Checkstyle</strong></summary>

Para garantir a qualidade do código, vamos utilizar neste exercício o `Checkstyle`. Assim o código estará alinhado com as boas práticas de desenvolvimento, sendo mais legível e de fácil manutenção! Para poder rodar o `Checkstyle` certifique-se de ter executado o comando `mvn install` dentro do repositório.

Para rodá-los localmente no repositório, execute os comandos abaixo:

```bash
mvn checkstyle:check
```

Se a análise do `Checkstyle` encontrar problemas no seu código, tais problemas serão mostrados no seu terminal. Se não houver problema no seu código, nada será impresso no seu terminal.

Você pode também instalar o plugin do `Checkstyle` na sua `IDE`. Para isso, volte na primeira seção do conteúdo.

⚠️ **PULL REQUESTS COM ISSUES NO `Checkstyle` NÃO SERÃO AVALIADAS. ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠️

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

## Requisitos

### 1 - Crie o endpoint GET /calculateAge

<details>
  <summary>Implemente o cálculo da idade para uma data válida</summary><br />

Ao receber uma data válida como _query parameter_ `date` deve retornar _status code_ `200` e um corpo no formato _JSON_ com a idade calculada.

Exemplo: Suponha que hoje seja dia 29 de Março de 2023 e que a requisição para o endpoint foi `/calculateAge?date=2000-03-20`,
então o retorno esperado possui _status code_ `200` e corpo:

```javascript
{
	"age": 23
} 
```

Nesse requisito será necessário:

	- Criar a _controller_ `AgeCalcutorController`que implementa a interface `AgeCalculatorControllerInterface`.
	- Implementar a lógica para calcular a idade no método `calculateAge` da classe `AgeCalculatorService`.

> Dica: Você pode utilizar o package java.time.Period para calcular o intervalo entre dois objetos LocalDate, e utilizar o package java.time.LocalDate para te auxiliar a fazer o parse da String que você recebe da requisição para um objeto da classe LocalDate.

</details>

### 2 - Crie um fluxo de exceção para datas futuras

<details>
  <summary>Implemente o fluxo para requisições contendo datas futuras</summary><br />

Ao receber uma data futura como _query parameter_ `date` deve retornar _status code_ `422` e um corpo no formato _JSON_ com a mensagem "This is a future date.".

Exemplo: Suponha que hoje seja dia 29 de Março de 2023 e que a requisição para o endpoint foi `/calculateAge?date=2040-03-20`,
então o retorno esperado possui _status code_ `422` e corpo:

```javascript
{
	"error": "This is a future date."
}
```

Para implementar o fluxo completo você vai precisar:

	- Criar uma classe `FutureDateException` no _package_ `exception`.
	- Adicionar no método `calculateAge` da classe `AgeCalculatorService` a validação para a data e disparar um erro `FutureDateException` para valores de data futura.
	- Adicionar o tratamento para exceções da classe `FutureDateException` na camada _Controller_.

</details>

### 3 - Crie um fluxo de exceção para datas com formato inválido

<details>
  <summary>Implemente o fluxo para requisições contendo datas com formato inválido</summary><br />

Ao receber uma data que não esteja no formato dd-mm-aa como _query parameter_ `date` deve retornar _status code_ `400` e um corpo no formato _JSON_ com a mensagem "Invalid date format. Expected dd-mm-aa.".

Exemplo: Suponha que hoje seja dia 29 de Março de 2023 e que a requisição para o endpoint foi `/calculateAge?date=03-20`,
então o retorno esperado possui _status code_ `400` e corpo:

```javascript
{
	"error": "Invalid date format. Expected aa-mm-dd."
}
```

Para implementar o fluxo completo você vai precisar:

	- Criar uma classe `InvalidSyntaxDateException` no _package_ `exception`.
	- Adicionar no método `calculateAge` da classe `AgeCalculatorService` a validação para o formato da data e disparar um erro `InvalidSyntaxDateException` para valores inválidos.
	- Adicionar o tratamento para exceções da classe `InvalidSyntaxDateException` na camada _Controller_.

</details>

### 4 - Crie um fluxo de exceção para datas não numéricas

<details>
  <summary>Implemente o fluxo para requisições contendo datas não numéricas</summary><br />

Ao receber uma data que contenha letras como _query parameter_ `date` deve retornar _status code_ `400` e um corpo no formato _JSON_ com a mensagem "Date should be in numeric format.".

Exemplo: Suponha que hoje seja dia 29 de Março de 2023 e que a requisição para o endpoint foi `/calculateAge?date=2000-mar-20`,
então o retorno esperado possui _status code_ `400` e corpo:

```javascript
{
	"error": "Date should be in numeric format."
}
```

Para implementar o fluxo completo você vai precisar:

	- Criar uma classe `NonNumericDateException` no _package_ `exception`.
	- Adicionar no método `calculateAge` da classe `AgeCalculatorService` a validação para o formato da data e disparar um erro `NonNumericDateException` para valores inválidos.
	- Adicionar o tratamento para exceções da classe `NonNumericDateException` na camada _Controller_.

</details>

### 5 - Implemente o retorno de um valor padrão para a idade com o query parameter orDefaultAge

<details>
  <summary>Implemente o retorno do valor do parâmetro orDefaultAge</summary><br />

Ao receber o parâmetro `orDefaultAge` e uma data que não esteja no formato correto, ou seja em um formato que dispare qualquer uma das exceções criadas nos requisitos anteriores, ao invés de retornar uma mensagem de erro, retorne o valor padrão passado pelo parâmetro `orDefaultAge`.

Exemplo: Suponha que hoje seja dia 29 de Março de 2023 e que a requisição para o endpoint foi `/calculateAge?date=03-20&orDefaultAge=0`,
então o retorno esperado possui _status code_ `200` e corpo:

```javascript
{
	"age": 0
} 
```

Para implementar o fluxo completo você vai precisar:

	- Implementar na _controller_ `AgeCalcutorController` a chamada do método `calculateAgeWithDefault` quando apropriado.
	- Implementar a lógica no método `calculateAgeWithDefault` da classe `AgeCalculatorService`.

</details>
---

<!-- mdi versão 1.0 exercício como projeto ⚠️ não exclua esse comentário -->
