package kalkulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Kalkulator kalkulator = new Kalkulator();
            double[] hasilArray = new double[10]; // Array untuk menyimpan hasil operasi
            int index = 0;
            
            //seleksi
            while (true) {
                System.out.println("Pilih operasi: ");
                System.out.println("1. Tambah");
                System.out.println("2. Kurang");
                System.out.println("3. Kali");
                System.out.println("4. Bagi");
                System.out.println("5. Keluar");
                
                int pilihan = scanner.nextInt();
                
                if (pilihan == 5) {
                    break;
                }
                
                System.out.print("Masukkan angka pertama: ");
                double angka1 = scanner.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double angka2 = scanner.nextDouble();
                
                try {
                    switch (pilihan) {
                        case 1:
                            kalkulator.tambah(angka1, angka2);
                            System.out.println("Hasil: " + kalkulator.getHasil());
                            hasilArray[index++] = kalkulator.getHasil();
                            break;
                        case 2:
                            kalkulator.kurang(angka1, angka2);
                            System.out.println("Hasil: " + kalkulator.getHasil());
                            hasilArray[index++] = kalkulator.getHasil();
                            break;
                        case 3:
                            kalkulator.kali(angka1, angka2);
                            System.out.println("Hasil: " + kalkulator.getHasil());
                            hasilArray[index++] = kalkulator.getHasil();
                            break;
                        case 4:
                            kalkulator.bagi(angka1, angka2);
                            System.out.println("Hasil: " + kalkulator.getHasil());
                            hasilArray[index++] = kalkulator.getHasil();
                            break;   
                        default:
                            System.out.println("Pilihan tidak valid");
                            break;
                    }
            } catch (ArithmeticException e) {
                System.out.print("Terjadi kesalahan: " + e.getMessage());
            }
            }
            
            // Menampilkan hasil operasi yang disimpan dalam array
            System.out.println("Hasil operasi sebelumnya:");
            for (int i = 0; i < index; i++) {
                System.out.println(hasilArray[i]);
            }
        }
    }
}
