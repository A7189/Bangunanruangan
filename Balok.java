package bangunruang;

public class Balok extends BangunRuang{
    float p,l,t;

    
    @Override
    float volume() {
        float volume = (float)( p * l * t);
        System.out.println("Menghitung volume balok"+volume);
        return 0;
    }
    @Override
    float luaspermukaan() {
        float luaspermukaan = (float) 2 * (p * l + l * t + p * t);
        System.out.println("Menghitung luas permukaan balok"+luaspermukaan);
        return 0;
    }
}
