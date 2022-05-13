package Aula01;

public class Emprestimo {

    public static void calcular(int qntParcelas, double valor){

        double juros;

        if (qntParcelas == 1){
            System.out.println(valor);
        }
        else if (qntParcelas > 1 && qntParcelas < 4){
            juros = 1.5;
            System.out.println(valor + (valor * (juros)/100));
        } else if (qntParcelas > 4 && qntParcelas < 13){
            juros = 2.5;
            System.out.println(valor + (valor * (juros)/100));
        } else {
            juros = 3.0;
            System.out.println(valor + (valor * (juros)/100));
        }
    }
}
