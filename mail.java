package ORAZDURDY_HASHIMOV_5206706036;

import java.util.Scanner;

//Örnek 69: Toplama, çıkarama, çarpma ve bölme işlemi yapan programın algoritma
//ve akış diyagramını yazınız.
public class Soru_69 {
    public static void main(String[] args) {
        int num1, num2, sum, oprtn;
        Scanner in = new Scanner(System.in);
        System.out.print("birinci sayi gir: ");
        num1 = in.nextInt();
        System.out.print("ikinci sayi gir: ");
        num2 = in.nextInt();
        System.out.print("islem gir! 1-Topla, 2-Cikar, 3-Carp, 4-Bol: ");
        oprtn = in.nextInt();

        if (oprtn == 1){
            sum = num1 + num2;
            System.out.println(sum);
        } else if (oprtn == 2) {
            sum = num1 - num2;
            System.out.println(sum);
        } else if (oprtn == 3) {
            sum = num1 * num2;
            System.out.println(sum);
        } else if (oprtn == 4) {
            sum = num1 / num2;
            System.out.println(sum);
        } else {
            System.out.println("Yanlis islem numarasini girizdiniz!");
        }
    }
}
