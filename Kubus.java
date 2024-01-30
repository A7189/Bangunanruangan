
package bangunruang;
public class Kubus extends BangunRuang{
    float s;
   @Override
    float volume(){
        float volume = (float) (s * s * s);
        System.out.println("Menghitung sisi bangun kubus"+volume);
        return 0;
    }
    @Override
    float luaspermukaan(){
        float luaspermukaan = (float) (6 * s * s);
        System.out.println("Menghitung sisi bangun kubus"+luaspermukaan);
        return 0;
}
}
