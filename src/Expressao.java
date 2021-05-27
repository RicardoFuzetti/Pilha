public class Expressao {
    Pilha pilha = new Pilha(10);
    int resultado = -1;

    public int validar (String expressao) {


        for (int i = 0; i < expressao.length(); i++){
            char caracter = expressao.charAt(i);

            if (caracter == '}' || caracter == ']' || caracter == ')' && pilha.vazia()) { //Se não ouve empilhamento a expressão é anulada
                return 0;
            }

            if (caracter == '{' || caracter == '[' || caracter == '(' ) {
                pilha.empilha(caracter);
            } else if (pilha.topo() == '{' && caracter == '}') {
                pilha.desempilha();
            } else if (pilha.topo() == '[' && caracter == ']') {
                pilha.desempilha();
            } else if (pilha.topo() == '(' && caracter == ')') {
                pilha.desempilha();
            }
        }

        if (!pilha.vazia()){
            resultado = 0;
        } else if (pilha.vazia()) {
            resultado = 1;
        }
        return resultado;
    }
}

