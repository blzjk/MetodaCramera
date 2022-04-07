package WdMN;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rozwiązywanie układu równań 3x3 metodą Cramera. " +
                "\na1x + b1y + c1z = d1\na2x + b2y + c2z = d2\na3x + b3y + c3z = d3\n");

        System.out.println("Podaj współczynniki pierwszego równania a1x + b1y + c1z = d1\na1 = ");
        int a1 = scanner.nextInt();
        System.out.println("b1 = ");
        int b1 = scanner.nextInt();
        System.out.println("c1 = ");
        int c1 = scanner.nextInt();
        System.out.println("d1 = ");
        int d1 = scanner.nextInt();

        System.out.println("Podaj współczynniki drugiego równania a2x + b2y + c2z = d2\na2 = ");
        int a2 = scanner.nextInt();
        System.out.println("b2 = ");
        int b2 = scanner.nextInt();
        System.out.println("c2 = ");
        int c2 = scanner.nextInt();
        System.out.println("d2 = ");
        int d2 = scanner.nextInt();

        System.out.println("Podaj współczynniki trzeciego równania a3x + b3y + c3z = d3\na3 = ");
        int a3 = scanner.nextInt();
        System.out.println("b3 = ");
        int b3 = scanner.nextInt();
        System.out.println("c3 = ");
        int c3 = scanner.nextInt();
        System.out.println("d3 = ");
        int d3 = scanner.nextInt();

        //Obliczanie współczynnika głównego W
        int W = a1*b2*c3 + b1*c2*a3 + c1*a2*b3 - a3*b2*c1 - b3*c2*a1 - c3*a2*b1;
        System.out.println("Współczynnik główny W = " + W);

        //Obliczanie współczynnika Wx
        int Wx = d1*b2*c3 + b1*c2*d3 + c1*d2*b3 - d3*b2*c1 - b3*c2*d1 - c3*d2*b1;
        System.out.println("Współczynnik Wx = " + Wx);

        //Obliczanie współczynnika Wy
        int Wy = a1*d2*c3 + d1*c2*a3 + c1*a2*d3 - a3*d2*c1 - d3*c2*a1 - c3*a2*d1;
        System.out.println("Współczynnik Wy = " + Wy);

        //Obliczanie współczynnika Wz
        int Wz = a1*b2*d3 + b1*d2*a3 + d1*a2*b3 - a3*b2*d1 - b3*d2*a1 - d3*a2*b1;
        System.out.println("Współczynnik Wz = " + Wz);
        System.out.println();


        if(W==0){
            if(Wx==0 && Wy==0 && Wz==0){
                System.out.println("Układ nieoznaczony.");
            }
            else if (Wx!=0 || Wy!=0 || Wz!=0){
                System.out.println("Układ sprzeczny.");
            }

        } else {
            double x = Wx/W;
            double y = Wy/W;
            double z = Wz/W;
            System.out.println("Układ oznaczony. Rozwiązaniem układu są liczby: \nx = " + x + "\ny = " + y + "\nz = " + z);
        }

    }
}
