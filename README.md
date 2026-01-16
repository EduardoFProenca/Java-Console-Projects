# ☕ Java Console Projects

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://github.com/EduardoFProenca/Java-Console-Projects)
[![License](https://img.shields.io/badge/License-Educational-green?style=for-the-badge)](LICENSE)

> Coleção de projetos em Java desenvolvidos durante minha jornada acadêmica: **Etec** (Técnico) e **Fatec** (Graduação), demonstrando evolução técnica e domínio de conceitos fundamentais de programação.

---

## 📖 Sobre

Este repositório documenta minha trajetória de aprendizado em Java, desde os **fundamentos na Etec** até **projetos mais avançados na Fatec**. Cada pasta representa uma fase do aprendizado, mostrando evolução nas técnicas de programação.

### 🎯 Objetivos
- Documentar minha evolução em Java
- Demonstrar domínio de conceitos fundamentais
- Compartilhar conhecimento com outros estudantes
- Servir como portfólio técnico

---

## 🗂️ Estrutura do Repositório

```
Java-Console-Projects/
│
├── Etec/                      # Projetos do Técnico (2022-2024)
│   ├── Cinema.java            # Sistema de pesquisa de opinião
│   ├── Desconto.java          # Calculadora de descontos
│   ├── IPVA.java              # Consulta vencimento IPVA
│   ├── Matriz3x3.java         # Operações com matrizes
│   ├── Opiniao.java           # Pesquisa de satisfação
│   ├── Tabuadas.java          # Gerador de tabuada v1
│   ├── Tabuadas2.java         # Gerador de tabuada v2
│   ├── cobranca.java          # Sistema de locação de veículos
│   └── README.md
│
├── Fatec/                     # Projetos da Graduação (2024+)
│   └── (Em desenvolvimento)
│
└── README.md                  # Este arquivo
```

---

## 📚 Projetos da Etec

### 🎬 **1. Cinema - Sistema de Pesquisa de Opinião**

**Descrição:**  
Sistema que coleta e analisa opiniões de espectadores sobre um filme, calculando estatísticas e médias.

**Funcionalidades:**
- Coleta opinião de 40 espectadores (A-Ótimo até E-Péssimo)
- Calcula média de idade de quem respondeu "Ruim"
- Calcula porcentagem de respostas "Péssimo"
- Gera média geral ponderada das notas

**Conceitos aplicados:**
- `JOptionPane` para interface gráfica simples
- Switch-case com múltiplas opções
- Validação de entrada com default
- Cálculos estatísticos (média, porcentagem)
- Contadores e acumuladores

**Exemplo de uso:**
```
Idade: 25
Opinião: A - Ótimo

[Após 40 respostas]
Quantidade de respostas 'Ótimo': 15
Média de idade (Ruim): 22.5%
Porcentagem Péssimo: 10%
Média geral das notas: 3.8
```

---

### 💰 **2. Desconto - Calculadora de Descontos**

**Descrição:**  
Calcula descontos progressivos baseados no valor da compra.

**Regras de negócio:**
- Compra < R$ 200: 5% de desconto
- Compra R$ 200-299: 10% de desconto
- Compra ≥ R$ 300: 15% de desconto

**Conceitos aplicados:**
- Estruturas condicionais aninhadas (if-else)
- Operações com float
- Formatação de valores monetários
- Lógica de negócio

**Exemplo:**
```
Valor da compra: R$ 250.00
Desconto: R$ 25.00
Valor final: R$ 225.00
```

---

### 🚗 **3. IPVA - Consulta de Vencimento**

**Descrição:**  
Sistema que informa a data de vencimento do IPVA baseado no final da placa do veículo.

**Funcionalidades:**
- Consulta por dígito final da placa (0-9)
- Exibe data de vencimento correspondente
- Validação de entrada

**Conceitos aplicados:**
- Switch-case completo (10 casos)
- Tratamento de todos os dígitos (0-9)
- Validação com default
- Estrutura de decisão

**Calendário IPVA:**
| Final da Placa | Vencimento |
|----------------|------------|
| 1 | 30/04 |
| 2 | 31/05 |
| 3 | 30/06 |
| ... | ... |
| 0 | 31/12 |

---

### 🔢 **4. Matriz3x3 - Operações com Matrizes**

**Descrição:**  
Preenche uma matriz 3x3 e calcula a soma de todos os elementos.

**Funcionalidades:**
- Leitura interativa de 9 elementos
- Armazenamento em matriz bidimensional
- Soma total dos elementos
- Exibição do resultado

**Conceitos aplicados:**
- Arrays bidimensionais `int[][]`
- Loops aninhados (for dentro de for)
- Índices de linha e coluna
- Acumulador para soma

**Estrutura da matriz:**
```
[0][0]  [0][1]  [0][2]
[1][0]  [1][1]  [1][2]
[2][0]  [2][1]  [2][2]
```

---

### 📊 **5. Opinião - Pesquisa de Satisfação**

**Descrição:**  
Sistema de pesquisa que coleta nome, idade e opinião sobre atendimento.

**Funcionalidades:**
- Coleta dados de 50 entrevistados
- Opções: 1-Excelente, 2-Bom, 3-Ruim
- Contabiliza respostas por categoria
- Validação de entrada (1-3)

**Conceitos aplicados:**
- Loop `for` com contador
- Switch-case para classificação
- Decremento de contador em caso de erro
- Múltiplos contadores

**Diferença do Cinema:**
- Usa números (1-3) em vez de letras (A-E)
- Loop for em vez de while
- Coleta nome do entrevistado

---

### ✖️ **6. Tabuadas - Gerador de Tabuada v1**

**Descrição:**  
Gera tabuadas de 6 a 10 usando múltiplos loops for.

**Características:**
- Tabuadas fixas (6, 7, 8, 9, 10)
- Implementação com repetição de código
- Saída via `System.out.println()`

**Conceitos aplicados:**
- Loop `for` básico
- Operações aritméticas
- Incremento de variável
- Formatação de saída

**🌐 Testar online:**  
[![Run on OnlineGDB](https://img.shields.io/badge/Run%20on-OnlineGDB-blue?style=for-the-badge&logo=java)](https://onlinegdb.com/nKT6jAF5y)

**Saída:**
```
0x6=0
1x6=6
2x6=12
...
10x6=60
[Repete para 7, 8, 9, 10]
```

---

### ✖️➕ **7. Tabuadas2 - Gerador de Tabuada v2 (Otimizado)**

**Descrição:**  
Versão melhorada usando loop `while` e lógica condicional para gerar múltiplas tabuadas.

**Melhorias:**
- Usa while em vez de repetir código
- Lógica mais eficiente
- Controle automático de incremento

**Conceitos aplicados:**
- Loop `while`
- Estrutura `if-else` dentro de loop
- Reset de contador (`Num1 = 1`)
- Lógica de controle de fluxo

**🌐 Testar online:**  
[![Run on OnlineGDB](https://img.shields.io/badge/Run%20on-OnlineGDB-blue?style=for-the-badge&logo=java)](https://onlinegdb.com/Pw2OlYCKy)

**Diferença da v1:**
- Menos linhas de código
- Mais eficiente
- Demonstra evolução técnica

---

### 🚙 **8. cobranca - Sistema de Locação de Veículos**

**Descrição:**  
Calcula o valor total da locação de veículos considerando diárias e quilometragem.

**Funcionalidades:**
- Cadastro do modelo do veículo
- Cálculo de diárias
- Cobrança de R$ 0,20 por Km
- Validação de entrada numérica
- Cálculo do valor total

**Conceitos aplicados:**
- `Scanner` para entrada de dados
- Validação com `hasNextInt()`
- Loop `while(true)` com break
- Tratamento de entrada inválida
- Cálculos com float/double

**🌐 Testar online:**  
[![Run on OnlineGDB](https://img.shields.io/badge/Run%20on-OnlineGDB-blue?style=for-the-badge&logo=java)](https://onlinegdb.com/rRL-1DhjE)

**Fórmula:**
```
Valor Total = (Valor Diária × Dias) + (0.20 × Km)
```

**Exemplo:**
```
Modelo: Gol
Diária: R$ 100.00
Dias: 3
Km: 150

Valor total: R$ 330.00
(R$ 300 diárias + R$ 30 Km)
```

---

## 🧠 Conceitos Java Abordados na Etec

### **Entrada e Saída:**
- ✅ `JOptionPane` (GUI básica)
- ✅ `Scanner` (console)
- ✅ `System.out.println()`

### **Estruturas de Controle:**
- ✅ if/else aninhados
- ✅ switch-case completo
- ✅ for, while
- ✅ break, default

### **Tipos de Dados:**
- ✅ int, float, double
- ✅ char, String
- ✅ Conversões (parseInt, parseFloat)

### **Arrays:**
- ✅ Arrays bidimensionais
- ✅ Índices e loops

### **Validação:**
- ✅ Tratamento de entrada inválida
- ✅ Loops de validação
- ✅ hasNextInt()

---

## 🚀 Como Executar

### **Pré-requisitos:**
- JDK 8+ instalado
- IDE (Eclipse, IntelliJ, NetBeans) ou terminal

### **Compilar e executar:**

```bash
# Navegar até a pasta
cd Etec

# Compilar
javac Cinema.java

# Executar
java Cinema
```

### **No Eclipse/IntelliJ:**
1. Importe o projeto
2. Clique direito no arquivo `.java`
3. "Run As > Java Application"

---

## 📊 Estatísticas

### **Etec (Técnico):**
- **Projetos:** 8
- **Linhas de código:** ~400+
- **Conceitos:** Fundamentos, loops, validação
- **Período:** 2022-2024

### **Fatec (Graduação):**
- **Projetos:** Em desenvolvimento
- **Foco:** POO avançado, APIs, bancos de dados

---

## 🎓 Trajetória Acadêmica

### **📘 Etec - Técnico em Desenvolvimento de Sistemas**
**Foco:** Fundamentos de programação
- Lógica de programação
- Estruturas de dados básicas
- Algoritmos fundamentais
- Interface com usuário (JOptionPane)

### **📗 Fatec - Análise e Desenvolvimento de Sistemas**
**Foco:** Desenvolvimento profissional
- POO avançada
- Padrões de projeto
- Arquitetura de software
- Desenvolvimento web/mobile

---

## 📈 Evolução Técnica

### **Fase 1 - Etec (Fundamentos):**
```java
// Código mais simples, foco em lógica
if(valor<200){
    valTotal = valor * 0.95f;
}
```

### **Fase 2 - Fatec (POO):**
```java
// Código orientado a objetos (em desenvolvimento)
public class Produto {
    private double valor;
    public double calcularDesconto() { ... }
}
```

---

## 💡 Aprendizados

### **Na Etec aprendi:**
1. **Lógica de programação** - Base sólida
2. **Validação de dados** - Importância de tratar erros
3. **Loops e condicionais** - Controle de fluxo
4. **Arrays** - Estruturas de dados básicas

### **Na Fatec estou aprendendo:**
1. **POO** - Paradigma orientado a objetos
2. **Clean Code** - Boas práticas
3. **Arquitetura** - Estruturação de projetos
4. **Frameworks** - Ferramentas profissionais

---

## 🔧 Ferramentas Utilizadas

**Etec:**
- NetBeans IDE
- JDK 8

**Fatec:**
- Eclipse IDE
- IntelliJ IDEA
- Visual Studio Code
- JDK 11+

---

## 📚 Recursos de Estudo

### **Livros:**
- *"Java - Como Programar"* - Deitel & Deitel
- *"Use a Cabeça! Java"* - Kathy Sierra

### **Cursos:**
- Curso em Vídeo - Gustavo Guanabara
- Java COMPLETO - Nélio Alves

---

## 👨‍💻 Autor

**Eduardo Ferreira Proença**

🎓 Técnico em Desenvolvimento de Sistemas - Etec  
🎓 Estudante de Análise e Desenvolvimento de Sistemas - Fatec  
💼 Foco em Desenvolvimento Back-end  


[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/eduardo-ferreira-39106b26a)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/EduardoFProenca)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:eduardo.ferreira.proenca.brasil@gmail.com)

---

## 📄 Licença

Este projeto foi desenvolvido para fins **educacionais** durante minha formação técnica e acadêmica.

---

## ⭐ Gostou?

Se este repositório te ajudou nos estudos, deixe uma ⭐!

---

<div align="center">

**Desenvolvido com 💙 durante minha jornada de aprendizado**

*"Do técnico à graduação: evolução constante."*

</div>