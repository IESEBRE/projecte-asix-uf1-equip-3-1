import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Person {

    //Constructor
    void Person() {
    }

    boolean talking() {
        //Variables que s'inicialitzen antes que el programa
        Scanner dades = new Scanner(System.in);
        String reSis=null;
        int resp=0;
        int i=0;
        int jugador=0;
        boolean sortir=false;
        //Selecció de preguntes
        while (!sortir) {
            System.out.println("1- Quin tipus de persona ets?");
            System.out.println("2- Quin esport t'agrada?");
            System.out.println("3- Quin és el teu número favorit entre 0 i 100");
            System.out.println("4- Digues els dos nombres que vols multiplicar");
            System.out.println("5- Juguem a pedra, paper o tisora?");
            System.out.println("6- Hem vols ficar un nom?");
            System.out.println("7- Pots recordar-me la nostra conversa?");
            System.out.println("8- Vull sortir de l'aplicació");

            //int swipreg = dades.nextInt();
            int swipreg=Integer.valueOf(dades.nextLine());
            switch (swipreg) {
                case 1:
                    //Pregunta 1 (acabat)
                    int cont = 0;
                    System.out.println("Quin tipus de persona ets?");
                    resp = Integer.valueOf(dades.nextLine());
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
                    break;
                case 2:
                    //Pregunta 2 (switch) (acabat)
                    System.out.println("Quin esport t'agrada?");
                    System.out.println("1-Futbol 2-Basket 3- Natació 4-Tenis 5-Volleyball 6-Beisbol 7-Pilota vasca 8-Padel 9-Ciclisme 10- Ping pong");
                    int resDos = Integer.valueOf(dades.nextLine());
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
                    break;
                case 3:
                    //Pregunta 3 (acabat)

                    System.out.println("Quin és el teu número favorit entre 0 i 100");
                    int reTres= Integer.valueOf(dades.nextLine());
                    int respTres= reTres/2;
                    for (i=0; i<=respTres; i++)
                        System.out.println(i);
                    break;
                case 4:
                    //Pregunta 4 (bucle, bucle, if)
                    int c;
                    int d;
                    System.out.println("Digues els dos nombres que vols multiplicar");
                    int a = Integer.valueOf(dades.nextLine());
                    int b = Integer.valueOf(dades.nextLine());
                    for (c = a; c <=b; c++) {
                        System.out.println();
                        for (d = b; d >=a; d--) {
                            if ((c*d) % 2 == 0)
                                System.out.println(c * d);
                        }
                    }
                    break;
                case 5:
                    //Pregunta 5 (random) (else if) (acabat)
                    System.out.println("Introdueix pedra, paper o tisora");
                    System.out.print("Començem: ");
                    int maquina=0;
                    boolean trenc=false;

                    do {
                        int numcinc = (int) Math.floor((Math.random()*3)+1);
                        System.out.println("\n1. Pedra\n 2. Paper\n 3. Tisora\n");
                        int resCinc = Integer.valueOf(dades.nextLine());
                        switch (numcinc) {
                            case 1:
                                switch (resCinc) {
                                    case 1:
                                        System.out.println("Empates");
                                        break;
                                    case 2:
                                        System.out.println("Guanyes");
                                        jugador++;
                                        break;
                                    case 3:
                                        System.out.println("Perds");
                                        maquina++;
                                        break;
                                }
                                break;
                            case 2:
                                switch (resCinc) {
                                    case 1:
                                        System.out.println("Perds");
                                        maquina++;
                                        break;
                                    case 2:
                                        System.out.println("Empates");
                                        break;
                                    case 3:
                                        System.out.println("Guanyes");
                                        jugador++;
                                        break;
                                }
                                break;
                            case 3:
                                switch (resCinc) {
                                    case 1:
                                        System.out.println("Guanyes");
                                        jugador++;
                                        break;
                                    case 2:
                                        System.out.println("Perds");
                                        maquina++;
                                        break;
                                    case 3:
                                        System.out.println("Empates");
                                        break;
                                }
                                break;

                        }
                        if (jugador==5) {
                            System.out.println("Felicitats, has guanyat");
                            trenc  = true;
                        } else if (maquina==5) {
                            System.out.println("Mala sort, has perdut");
                            trenc=true;
                        }
                    } while (!trenc);
                    break;
                case 6:
                    //Pregunta 6 (acabat)
                    System.out.println("Posa-li un nom:");
                    reSis = dades.nextLine();
                    System.out.println("Gràcies, m'agrada aquest nom");
                    break;
                case 7:
                    //Pregunta 7 (acabat ?)
                    System.out.println("Pots recordar-me la nostra conversa?");
                    System.out.println("Hem dic " + reSis + ", sóc " + resp + " el meu número preferit és el " + i + " i al joc he fet una puntuació de " + jugador);
                    break;
                case 8:
                    //Pregunta 8 (acabat)
                    System.out.println("Voleu sortir de l'aplicació?");
                    String reVuit = dades.nextLine();
                    if (reVuit.equals("Si")) {
                        sortir=true;
                    }
                    break;
            }
        }
        return true;
    }
}
