package Aula01;

public class Mensagem {

    public static void saudacao(int hora){

        if (hora > 23){
            System.out.println("Horário inválido");
        } else {
            if (hora >=0 && hora <= 6){
                System.out.println("Bom dia!");
            } else if (hora > 6 && hora <=18){
                System.out.println("Boa tarde!");
            } else if (hora > 18 && hora <= 23){
                System.out.println("Boa noite!");
            }
        }
    }
}
