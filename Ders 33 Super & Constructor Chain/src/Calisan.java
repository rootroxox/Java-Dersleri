public class Calisan {
    private String adSoyad,telefon,ePosta;

    public Calisan(String adSoyad, String telefon, String ePosta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.ePosta = ePosta;
    }

    public void giris(){
        System.out.println(this.adSoyad + " Giriş Yapıldı!");
    }

    public void cikis(){
        System.out.println(this.adSoyad + " Çıkış Yapıldı!");
    }

    public void yemek(){
        System.out.println(this.adSoyad + " Yemek yenildi!");
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }
}
