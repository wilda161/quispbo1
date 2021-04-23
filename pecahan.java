package pecahan;
import java.util.Scanner;

public class pecahan{
    public static void main(String[] args) {
        double pembilang;
        double penyebut;
        double hasil;

        Scanner input = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("==========Menghitung Pecahan==========");
        System.out.println("======================================");
        System.out.print("masukan Pembilang :");
        pembilang=input.nextDouble();
        System.out.print("masukan penyebut :");
        penyebut=input.nextDouble();

        hasil = pembilang/penyebut;
        System.out.println("Hasilnya adalah : "+hasil);
    } 
}