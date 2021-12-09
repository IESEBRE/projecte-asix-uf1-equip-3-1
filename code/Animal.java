import java.util.Scanner;

public class Animal {
    //Constructor
    void animal() {
    }

    void talking() {

        //9. Quin tipus d’animal ets?

        char animal;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Quin tipus d'animal ets?");
        animal = lectura.nextLine().charAt(0);

        if (animal == 'G')
            System.out.println("Gos");
        else if (animal == 'M')
            System.out.println("Mono");
        else if (animal == 'S')
            System.out.println("Serp");

        else if (animal != 'G' && animal != 'M' && animal != 'S')
            System.out.println("No existeix");

        //Assignem resultats

        int r1 = 0;
        int r2;
        int r3 = 0;
        int r4;

        char unicode;
        unicode = lectura.nextLine().charAt(0);
        if (unicode > 'S')
            System.out.println("Serp");
        else if (unicode < 'S' && unicode > 'M')
            r1 = unicode - 'S';
        r2 = unicode - 'M';
        if (r1 < r2)
            System.out.println("Serp");
        else System.out.println("Mono");

        if (unicode > 'G')
            System.out.println("Gos");
        else if (unicode < 'G' && unicode > 'M')
            r3 = unicode - 'G';
        r4 = unicode - 'M';
        if (r3 < r4)
            System.out.println("Gos");
        else System.out.println("Mono");

        //10. A que t’agrada jugar?

        char jugar;
        System.out.println("A que t'agrada jugar?");
        System.out.println(" 0- Llençar Frisbee");
        System.out.println(" 1- Jugar a la pilota");
        System.out.println(" 2- Carrera de obstacles");
        System.out.println(" 3- Recollir Joguines");
        System.out.println(" 4- Buscar Menjar");
        System.out.println(" 5- Pilla Pilla");
        System.out.println(" 6- Jugar amb l'arena");
        System.out.println(" 7- Al parque");
        System.out.println(" 8- Jocs amb altres gossos");
        System.out.println(" 9- Trencar Joguines");
        jugar = lectura.nextLine().charAt(0);

        if (jugar == '0')
            System.out.println("T'agrada jugar a Llençar Frisbee");
        else if (jugar == '1')
            System.out.println("T'agrada jugar a la pilota");
        else if (jugar == '2')
            System.out.println("T'agrada jugar a la Carrera de obstacles");
        else if (jugar == '3')
            System.out.println("T'agrada jugar a Recollir Joguines");
        else if (jugar == '4')
            System.out.println("T'agrada jugar a Buscar Menjar");
        else if (jugar == '5')
            System.out.println("T'agrada jugar al Pilla Pilla");
        else if (jugar == '6')
            System.out.println("T'agrada jugar amb l'Arena");
        else if (jugar == '7')
            System.out.println("T'agrada jugar al Parque");
        else if (jugar == '8')
            System.out.println("T'agrada jugar a Jocs amb altres gossos");
        else if (jugar == '9')
            System.out.println("T'agrada jugar a Trencar Joguines");
        else
            System.out.println("Aquest joc no existeix a la llista");

        //11. Quin és el teu caràcter favorit?

        char caracter;
        System.out.println("Quin és el teu caràcter favorit?");
        caracter = lectura.nextLine().charAt(0);
        int r5 = caracter - 'A';
        int r6 = r5 / 2;
        int A = 'A';

        // Sortir quan A sigui més gran que r6

        while (A < 'A' + r6) {
            System.out.println(A);

            //Incrementa el valor de A
            A++;
            if (A > r6) break;

            //12. Llista tots els caràcters amb valor Unicode

            char uni1;
            char uni2;


            //13. Juguem a fer onomatopeies?

            //14. Posa-li un nom:

            String nom;
            nom = lectura.nextLine();
            System.out.println("Gràcies m'agrada aquest nom");

            //15. Pots recordar-me la nostra conversa?

            System.out.println(animal);
            System.out.println(jugar);
            System.out.println(caracter);


        }
    }
}
