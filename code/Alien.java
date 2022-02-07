
import java.util.Scanner;

public class Alien {
    // Constructor
    void Alien() {
    }

    //    boolean talking () {
    public static void main(String[] args) {


        System.out.println("biri biri biri");
        float resposta;
        Scanner alien = new Scanner(System.in);
        System.out.println("Introdueix un numero float entre el (0..10)");
        resposta = alien.nextFloat();
//        System.out.println((resposta % 100));  7.8 * 10 = 78 % 10 = 8
        int decimal=(int)(resposta*10);

        decimal=decimal%10;
        if (decimal > 5) {
            Math.round(resposta);
            System.out.println("Alien de tipus Pau");
        } else if (decimal < 5) {
            Math.round(resposta);
            System.out.println("Alien de tipus Assasí");
        } else {
            Math.round(resposta);
            System.out.println("Alien de tipus Sucubo");
        }

        float resposta2;
        System.out.println("Introdueix un numero float entre el 0 i el 1");
        resposta2 = alien.nextFloat();
        int decimals=(int)(resposta2*10);

//        decimals=decimals%10;
        if (decimals == 1) {
            Math.round(decimals);
            System.out.println("Viatja volant");
        } else if (decimals == 2) {
            Math.round(decimals);
            System.out.println("Viatja en Cohet");
        } else if (decimals == 3) {
            Math.round(decimals);
            System.out.println("Viatja en Nau");
        } else if (decimals == 4) {
            Math.round(decimals);
            System.out.println("Viatja en vaixell");
        } else if (decimals == 5) {
            Math.round(decimals);
            System.out.println("Viatja en bicicleta");
        } else if (decimals == 6) {
            Math.round(decimals);
            System.out.println("Viatja en cotxe ");
        } else if (decimals == 7) {
            Math.round(decimals);
            System.out.println("Viatja en moto");
        } else if (decimals == 8) {
            Math.round(decimals);
            System.out.println("Viatja en avió");
        } else if (decimals == 9) {
            Math.round(decimals);
            System.out.println("Viatja en camell");
        } else if (decimals == 10) {
            Math.round(decimals);
            System.out.println("Viatja en caball");
        } else {}



        float resposta3;
        System.out.println("Quin es el teu numero preferit entre el 0,0 i ...");
        Scanner num = new Scanner(System.in);
        float resp = num.nextInt();

        resposta3 = alien.nextFloat();
//        return true;
    }

}
