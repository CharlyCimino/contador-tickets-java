package ar.charlycimino.ejemplos.contadortickets;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Ticket t1 = new Ticket("2021/07/20", "563546299");
        Ticket t2 = new Ticket("2021/07/16", "433452399");
        Ticket t3 = new Ticket("2021/07/19", "243525699");
        Ticket t4 = new Ticket("2021/07/18", "234423599");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }

}
