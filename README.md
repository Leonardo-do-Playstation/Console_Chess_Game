# ♟️ Projeto Sistema de Jogo de Xadrez em Java

Este repositório contém o **Projeto Sistema de Jogo de Xadrez**, desenvolvido em **Java**, como parte do curso **Programação Orientada a Objetos com Java**, ministrado pelo **Prof. Dr. Nélio Alves** (EducandoWeb / Udemy).

O projeto foi construído de forma incremental, aplicando conceitos fundamentais e avançados de **Programação Orientada a Objetos**, estruturas de dados e boas práticas de desenvolvimento, resultando em um sistema completo de xadrez executado no terminal.

---

## 🎯 Objetivo do Projeto

Aplicar, de forma prática, os conhecimentos adquiridos ao longo do curso para o desenvolvimento de um sistema de xadrez completo, respeitando as regras do jogo e utilizando uma arquitetura organizada em camadas.

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **Programação Orientada a Objetos (POO)**
* **Git e GitHub**
* Execução em **terminal/console**

---

## 🧱 Estrutura do Projeto

O projeto é organizado em camadas, separando responsabilidades e facilitando a manutenção:

* **boardgame**: camada genérica de tabuleiro
* **chess**: camada específica do jogo de xadrez
* **application**: camada de interação com o usuário (UI e programa principal)

---

## 📌 Funcionalidades Implementadas

* Representação do tabuleiro de xadrez
* Impressão do tabuleiro no terminal
* Movimentação de peças
* Validação de movimentos
* Controle de turnos e jogador atual
* Registro de peças capturadas
* Detecção de **check** e **checkmate**

---

## ♜ Peças Implementadas

* Rei (King)
* Rainha (Queen)
* Torre (Rook)
* Bispo (Bishop)
* Cavalo (Knight representado H no tabuleiro)
* Peão (Pawn)

Cada peça possui sua própria lógica de movimentos, respeitando os princípios de **herança**, **polimorfismo** e **encapsulamento**.

---

## ♟️ Movimentos Especiais

O sistema implementa todos os movimentos especiais do xadrez:

* **Roque (Castling)**
* **En Passant**
* **Promoção de Peão**

---

## ⚠️ Tratamento de Erros

* Uso de exceções personalizadas (`BoardException` e `ChessException`)
* Programação defensiva para evitar estados inválidos do jogo
* Validação de posições de origem e destino

---

## 📚 Conceitos de POO Aplicados

* Encapsulamento
* Herança
* Polimorfismo
* Classes e métodos abstratos
* Enumerações
* Associações entre classes
* Sobrescrita e sobrecarga de métodos

---

## 📂 Estruturas de Dados Utilizadas

* Matrizes para representação do tabuleiro
* Listas (`List`) para controle de peças em jogo e capturadas

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

   ```bash
   git clone <https://github.com/Leonardo-do-Playstation/Console_Chess_Game>
   ```
2. Abra o projeto em sua IDE Java (Eclipse, IntelliJ, VS Code, etc.)
3. Execute a classe principal do projeto
4. Interaja com o jogo pelo terminal, informando as posições no padrão do xadrez (ex: `e2`, `e4`)

> 💡 Para melhor visualização de cores no terminal no Windows, recomenda-se utilizar o **Git Bash**.

---

## 📈 Status do Projeto

✅ **Projeto finalizado** — todas as funcionalidades propostas no curso foram implementadas com sucesso.

---

## 👨‍🏫 Referência

Projeto baseado no curso da plataforma Udemy:

**Programação Orientada a Objetos com Java**
Prof. Dr. Nélio Alves
---
