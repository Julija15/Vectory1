import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector1[] vectors = Vector1.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].dlinna());
        System.out.println(vectors[0].scalarProizvedenie(vectors[1]));
        System.out.println(vectors[0].vectoryProizvedenie(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtraction(vectors[1]));
    }
}