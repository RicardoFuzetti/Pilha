# Pilha
Implemente um TAD (Tipo Abstrato de Dados) do tipo Pilha em JAVA. Uma Pilha deve ter a seguinte representação:
Estrutura Pilha

inteiro: topo;   // o índice do elemento no topo da pilha;

 inteiro dado[];  // um array para armazenamento de dados que deve ser alocado dinamicamente
 
 inteiro MAX; // quantidade máxima de elementos

a) topo();  // retorna o elemento no topo da pilha

b) vazia();  // retorna 1 se a pilha está vazia e 0 caso contrário

c) cheia();  // retorna 1 se a pilha está cheia e 0 caso contrário

d) empilha(inteiro: elemento)  // coloca o elemento na pilha

e) desempilha();  // retira e retorna o elemento do topo da pilha

Implementação de validação de delimitadores de expressão aritmética.
a) Modifique a estrutura de Pilha da questão anterior para armazenar caracteres se necessário;

b) Crie uma classe chamada Expressao e nela implemente um método que recebe uma string como entrada e verifica se os delimitadores “()”, “{}” e “[]” são utilizados corretamente utilizando a Pilha do item “a”. A função deve retornar 1 se a expressão é válida e 0 caso contrário. Exemplo: “(1+5)*(56+12)” => válida, “(1+5)*)56+12)” => inválida, “(1+5)*[56+12)” => inválida, (((1+2) - 3 )* 6) => válida. Não é necessário considerar prioridade entre os delimitadores.

