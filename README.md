# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi kalkulator menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa angka pertama dan angka kedua, dan memberikan output hasil perhitungan matematika.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kalkulator`, dan `Main`adalah contoh dari class.

```bash
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
```

2. **Object** adalah instance dari class. contoh pembuatan object.

```bash
Kalkulator kalkulator = new Kalkulator()
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `hasil` adalah contoh atribut.

```bash
protected double hasil;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object.

```bash
public Kalkulator() {
        this.hasil = 0;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut.

```bash
public void setHasil(double hasil) {
        this.hasil = hasil;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut.

```bash
public double getHasil() {
        return hasil;
    }

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. 

```bash
protected double hasil;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. 
```bash
public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Kalkulator kalkulator = new Kalkulator();
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. 

```bash
for (int i = 0; i < index; i++) {
                System.out.println(hasilArray[i]);
            }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan angka pertama: ");
                double angka1 = scanner.nextDouble();
                System.out.print("Masukkan angka kedua: ");
                double angka2 = scanner.nextDouble();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. 

```bash
double[] hasilArray = new double[10];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
catch (ArithmeticException e) {
                System.out.print("Terjadi kesalahan: " + e.getMessage());
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    0    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **90** |

## Pembuat

Nama: Ahmad Shawity
NPM: 210010023
