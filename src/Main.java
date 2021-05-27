class Main {
    public static void main(String[] args) {
        Expressao expressao = new Expressao();
        int res = expressao.validar("(1+5)(56+12)");
        if (res == 1) {
            System.out.println("A expressão está correta");
        } else if (res == 0) {
            System.out.println("A expressão está incorreta");
        } else {
            System.out.println(res);
        }
    }
}