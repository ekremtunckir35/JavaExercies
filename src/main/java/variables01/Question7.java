package variables01;

import java.util.Scanner;

public class Question7 {
    // Iki tam sayiyi degistirmek icin bir kod yaziniz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki sayi giriniz:");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Degistirmeden once :" + n1 + " - " + n2);

        //1.cozum yolu
        double temp = n1;
        n1 = n2;
        n2 = temp;
        //System.out.println("Degistirdikten sonra :" + n1 + "-" + n2);
//---------------------------------
        //2.cozum yolu
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Degistirdeikten sonra:" +n1 +"-"+n2);
    }
}