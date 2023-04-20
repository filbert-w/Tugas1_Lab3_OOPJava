package tugas1_lab3_oopjava;

public class Kecepatan {
    double v, s, t, vt, tp, a;
    
//    Constructor Overloading
    Kecepatan(){
        this.v = 0;
        this.s = 0;
        this.t = 0;
    }
    
//    Constructor Overloading
//    parameter pertama adalah jarak, parameter kedua adalah waktu
    Kecepatan(double s, double t){
        this.v = s/t;
        this.s = s;
        this.t = t;
    }
    
//    Method Overloading
//    Method non void
//    Percepatan
    double Percepatan(double vt, double tp){
        this.vt = vt;
        this.tp = tp;
        this.a = (vt-v)/tp;
        return a;
    }
    
//    Method Overloading
//    Method non void
//    Perlambatan
    double Percepatan(double vt, double tp, int minus){
        this.vt = vt;
        this.tp = tp;
        this.a = (v-vt)/tp;
        return a;
    }
    
//    Method void
    void DataLengkap(){
        System.out.println("v (kecepatan awal) = "+v);
        System.out.println("s (jarak) = "+s);
        System.out.println("t (waktu) = "+t);
        System.out.println("vt (kecepatan akhir) = "+vt);
        System.out.println("tp (waktu percepatan/perlambatan) = "+tp);
        System.out.println("a (percepatan/perlambatan) = "+a);
    }
}
