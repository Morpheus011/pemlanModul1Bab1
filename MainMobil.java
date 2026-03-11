import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner lol = new Scanner(System.in);
        Mobil m1 = new Mobil();

        System.out.println("=== Masukkan Data Mobil ===");
        System.out.print("Masukkan Manufaktur : ");
        m1.setManufaktur(lol.nextLine());

        System.out.print("Masukkan No Plat    : ");
        m1.setNoPlat(lol.nextLine());

        System.out.print("Masukkan Warna      : ");
        m1.setWarna(lol.nextLine());

        System.out.print("Masukkan Kecepatan  : ");
        m1.setKecepatan(lol.nextInt());

        System.out.print("Masukkan Waktu      : ");
        m1.setWaktu(lol.nextDouble());

        System.out.println("\n=== Hasil Output ===");
        m1.displayMessage();
    }

}
