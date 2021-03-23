public class Ogretmen extends Akademisyen{
    private String unvan;

    public Ogretmen(String adSoyad, String telefon, String ePosta, String bolum,
                    String gorev, String unvan) {
        super(adSoyad, telefon, ePosta, bolum, gorev);
        this.unvan = unvan;
    }

    @Override
    public void giris(){
        System.out.println("Öğretmen "+ this.adSoyad + " Giriş Yaptı!");
    }

    public void sınavıOku(){
        System.out.println("Sınavlar Okundu!");
    }

    public void toplantıGir(){
        System.out.println("Toplantıya Girildi!");
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
