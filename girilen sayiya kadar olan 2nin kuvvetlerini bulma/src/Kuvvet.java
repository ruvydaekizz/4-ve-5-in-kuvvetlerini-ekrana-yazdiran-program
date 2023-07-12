import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {

        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        // formül i*=2  ile bulunmalıdır.

        Scanner scan = new Scanner(System.in);

        int n;
        System.out.print("Değeri giriniz: ");
        n = scan.nextInt();

        for (int i = 1; i < n; i *= 2) {

            System.out.println(i);
        }

        //ÖDEV- Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scanner = new Scanner(System.in);

        int sayi1;
        System.out.print("Değeri giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.println("4'ün Kuvvetleri: ");

        for (int i1 = 1; Math.pow(4, i1) <= sayi1; i1++) {

            System.out.println((int) Math.pow(4, i1));
        }

        System.out.println("5'in Kuvvetleri: ");

        for (int i1 = 1; Math.pow(5, i1) <= sayi1; i1++){

            System.out.println((int) Math.pow(5,i1));
        }


    }
}
