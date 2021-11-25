import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Person {

    //Constructor
    void Person() {
    }

    boolean talking() {
        //Pregunta 1 (acabat)
        int cont = 0;
        System.out.println("Quin tipus de persona ets?");
        Scanner dades = new Scanner(System.in);
        int resp = dades.nextInt();
        while (true) {
            if (resp % 2 == 0 && resp % 3 == 0) {
                System.out.println("No binari");
                break;
            } else if (resp % 2 == 0) {
                System.out.println("Home");
                break;
            } else if (resp % 3 == 0) {
                System.out.println("Dona");
                break;
            } else {
                if (resp<=100) resp+=2;
                else resp-=4;
            }
        }

        //Pregunta 2 (switch) (acabat)
        System.out.println("Quin esport t'agrada?");
        System.out.println("1-Futbol 2-Basket 3- Natació 4-Tenis 5-Volleyball 6-Beisbol 7-Pilota vasca 8-Padel 9-Ciclisme 10- Ping pong");
        Scanner dados = new Scanner(System.in);
        int resDos = dados.nextInt();
        switch (resDos) {
            case 1:
                System.out.println("Futbol");
                break;
            case 2:
                System.out.println("Basket");
                break;
            case 3:
                System.out.println("Natació");
                break;
            case 4:
                System.out.println("Tenis");
                break;
            case 5:
                System.out.println("Volleyball");
                break;
            case 6:
                System.out.println("Beisbol");
                break;
            case 7:
                System.out.println("Pilota vasca");
                break;
            case 8:
                System.out.println("Padel");
                break;
            case 9:
                System.out.println("Ciclisme");
                break;
            case 10:
                System.out.println("Ping pong");
                break;
        }

        //Pregunta 3 (acabat)
        int i;
        System.out.println("Quin és el teu número favorit entre 0 i 100");
        Scanner datres = new Scanner(System.in);
        int reTres= datres.nextInt();
        int respTres= reTres/2;
        for (i=0; i<=respTres; i++)
            System.out.println(i);

        //Pregunta 4 (bucle)


        //Pregunta 5 (random) (else if) (no acabat)
        System.out.println("Introdueix pedra, paper o tisora");
        Scanner dacinc = new Scanner(System.in);
        var numcinc = Math.floor((Math.random()*3)+1);
        int resCinc = dacinc.nextInt();
        String resord;
        if (numcinc==1) {
            resord="Pedra";
        }  else if (numcinc==2) {
            resord="Paper";
        } else {
            resord="Tissores";
        }
        //Resposta del joc
        if (resCinc==resord) {
            System.out.println("Empat");
        } else if (resCinc=="Pedra" && resord=="Paper") {
            System.out.println("Has perdut");
        } else if (resCinc=="Pedra" && resord=="Tissores") {
            System.out.println("Has guanyat");
        } else if (resCinc=="Paper" && resord=="Tissores") {
            System.out.println("Has perdut");
        } else if (resCinc=="Paper" && resord=="Pedra") {
            System.out.println("Has guanyat");
        } else if (resCinc=="Tissores" && resord=="Pedra") {
            System.out.println("Has perdut");
        } else (resCinc=="Tissores" && resord=="Paper") {
            System.out.println("Has guanyat");
        }



        //Pregunta 6
        System.out.println("Posa-li un nom:");
        Scanner dasis = new Scanner(System.in);
        int reSis = dasis.nextInt();
        System.out.println("Gràcies, m'agrada aquest nom");

        //Pregunta 7 (no acabat)
        System.out.println("Pots recordar-me la nostra conversa?");
        System.out.println("Hem dic " + reSis + ", sóc " + resp + "el meu número preferit és el" + "resposta de guanyar");

        //Pregunta 8 (no acabat)
        System.out.println("Voleu sortir de l'aplicació?");
        Scanner davuit = new Scanner(System.in);
        int reVuit = davuit.nextInt();

        return true;
    }
}
