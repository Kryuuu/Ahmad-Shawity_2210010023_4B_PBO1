package kalkulator;

public class Perpangkatan {
    // Fungsi untuk menghitung perpangkatan
    public static int pangkat(int base, int eksponen) {
        int hasil = 1;
        for (int i = 0; i < eksponen; i++) {
            hasil *= base;
        }
        return hasil;
    }
}
