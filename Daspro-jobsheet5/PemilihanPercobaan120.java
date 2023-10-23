import java.util.Scanner;

public class PemilihanPercobaan120 {
    public static void main(String[] args) {
        Scanner input20Scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input20Scanner.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka " + angka + " adalah bilangan genap");
        else
            System.out.println("Angka " + angka + " adalah bilangan ganjil");

        
        input20Scanner.close();
    }
}

    
