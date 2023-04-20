package tugas1_lab3_oopjava;

public class Tugas1_Lab3_OOPJava {

    public static void main(String[] args) {
        System.out.println("\nMenghitung Kecepatan dan Percepatan(jarak(meter), waktu(sekon), kecepatan(m/s))\n");
        
//        objek 1
        Kecepatan Hitung1 = new Kecepatan();
//        objek 2
        Kecepatan Hitung2 = new Kecepatan(100, 5);
        System.out.println("Kecepatan objek 1 tanpa parameter: "+Hitung1.v); // kecepatan objek 1
        System.out.println("Kecepatan objek 2 dengan parameter jarak 100 dan waktu 5: "+Hitung2.v); // kecepatan objek 2
        System.out.println("Percepatan objek 1 dengan parameter kecepatan akhir 20 dan waktu dari kecepatan awal hingga kecepatan akhir 5: "+Hitung1.Percepatan(20, 5)); // percepatan objek 1
        System.out.println("Perlambatan objek 2 dengan parameter kec akhir 2, waktu kec awal menjadi kec akhir 5, dan parameter -1: "+Hitung2.Percepatan(2, 5, -1)); // perlambatan objek 2
        System.out.println("\nData Objek 1");
        Hitung1.DataLengkap();
        System.out.println("\nData Objek 2");
        Hitung2.DataLengkap();
    }
    
}
