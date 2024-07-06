package kalkulator;

    //Atribut
public class Kalkulator {
    protected double hasil;

    // Constructor
    public Kalkulator() {
        this.hasil = 0;
    }

    // Accessor
    public double getHasil() {
        return hasil;
    }

    // Mutator
    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    // Method untuk penjumlahan
    public void tambah(double a, double b) {
        this.hasil = a + b;
    }

    // Method untuk pengurangan
    public void kurang(double a, double b) {
        this.hasil = a - b;
    }
    
    // Method untuk perkalian
    public void kali(double a, double b) {
        this.hasil = a * b;
    }
    
    // Method untuk pembagian
    public void bagi(double a, double b) {
        this.hasil = a/b;
    }
}
