
package bangunruang;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BangunRuang bangunruang = new BangunRuang();

        BolaBunder bolabunder = new BolaBunder();
        System.out.print("Masukan jari bola: ");
        bolabunder.r = input.nextInt();

        Balok balok = new Balok();
        System.out.print("Masukan panjang balok: ");
        balok.p = input.nextInt();
        System.out.print("Masukan lebar balok: ");
        balok.l = input.nextInt();
        System.out.print("Masukan tinggi balok: ");
        balok.t = input.nextInt();

        Kubus kubus = new Kubus();
        System.out.print("Masukan Panjang persegi panjang: ");
        kubus.s = input.nextInt();
        
        LimasSegitiga limasegitiga = new LimasSegitiga();
        System.out.print("Masukan Alas limas segitiga: ");
        limasegitiga.a = input.nextInt();
        System.out.print("Masukan tinggi segitiga segitiga: ");
        limasegitiga.ts = input.nextInt();
        System.out.print("Masukan tinggi limas: ");
        limasegitiga.tl = input.nextInt();
        System.out.print("Masukan luas sisi tegak: ");
        limasegitiga.lst = input.nextInt();
        

        //bangundatar.luas();
        //bangundatar.keliling();

        bolabunder.volume();
        bolabunder.luaspermukaan();
        
        balok.volume();
        balok.luaspermukaan();

        kubus.volume();
        kubus.luaspermukaan();

        limasegitiga.volume();
        limasegitiga.luaspermukaan();
    }
}
