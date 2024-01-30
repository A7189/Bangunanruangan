
package bangunruang;

public class BolaBunder extends BangunRuang{
    float r;
    @Override
    float volume(){
        float volume = (float) (r *r * r);
        System.out.println("Menghitung volume bangun bola"+ volume);
        return 0;
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = (float) ( 4 * Math.PI * r * r);
        System.out.println("Menghitung luaspermukaan bangun bola"+ luaspermukaan);
        return 0;
    }
}
