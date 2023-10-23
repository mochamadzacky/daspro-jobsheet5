import java.util.Scanner;

public class ModifikasiPemilihanPercobaan120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukan angka: ");
        int angka = input20.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";
        System.out.println(hasil);
    }
}
