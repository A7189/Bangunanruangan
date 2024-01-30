
package bangunruang;

public class LimasSegitiga extends BangunRuang{
    float a,ts,tl,lst;
    @Override
    float volume() {
        float volume = (float)( 1/3 * (1/2*a*ts) * tl);
        System.out.println("Menghitung volume limas"+volume);
        return 0;
    }
    
    @Override
    float luaspermukaan() {
        float luasalas = (float)( a * ts/2 + 3*lst );
        System.out.println("Menghitung luas alas limas"+luasalas);
        return 0;
    }
}
