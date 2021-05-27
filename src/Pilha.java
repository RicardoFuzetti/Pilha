public class Pilha {
    public char[] dado;
    public int topo;
    public int max;

    public Pilha(int tam) {
        this.topo = -1;
        this.dado = new char[tam];
        this.max = tam;
    }

    public boolean vazia(){
        if (topo == -1){
            return true;
        } else{
            return false;
        }
    }

    public boolean cheia(){
        if (topo == max -1){
            return true;
        } else{
            return false;
        }
    }

    public void empilha(char caracter){
        if(!cheia()){
            topo ++;
            dado[topo] = caracter;
        } else{
            System.out.println("Pilha está cheia");
        }
    }

    public void desempilha(){
        if(!vazia()){
            dado[topo] = 0;
            topo --;
        } else{
            System.out.println("Pilha está vazia");
        }
    }

    public char topo(){
        if(!vazia()){
            return this.dado[this.topo];
        }else{
            return ' ';
        }
    }

}
