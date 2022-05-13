package Aula01;

public class Main {

    public static void main(String[] args) {

        Calculadora.soma(2, 3);
        Calculadora.subtracao(2000, 0);
        Calculadora.multiplicacao(2.5, 3.2);
        Calculadora.divisao(12, 2.5);

        Mensagem.saudacao(0);
        Mensagem.saudacao(13);
        Mensagem.saudacao(19);
        Mensagem.saudacao(24);

        Emprestimo.calcular(1, 1000);
        Emprestimo.calcular(2, 100);
    }
}
