import java.util.Scanner;

public class Input{
    public static void main(String[] ars){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        double b = s.nextDouble();
        float c = s.nextFloat();
        long d = s.nextLong();
        boolean e = s.nextBoolean();
        String f = s.next(); // it will take only a word
        String g = s.nextLine(); //it will take the whole string

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(a);
    }
}
