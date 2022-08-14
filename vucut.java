import java.util.Scanner;

public class vucut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("boyunu m cinsinden  girin");
        double boy =scanner.nextDouble();
        System.out.print("kilonuzu girin");
        int kilo =scanner.nextInt();

        double kitle=kilo/(boy*boy);
        System.out.print("vücut kitle indeksi = "+kitle);





    }
}
