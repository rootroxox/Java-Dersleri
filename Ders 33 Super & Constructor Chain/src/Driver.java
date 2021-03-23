public class Driver {
                    //          SUPER
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Ayberk Saygı","555555555","sdjhsdgnjsdg@gmail.com");
        Akademisyen akademisyen = new Akademisyen("a","5","AA","SENG","Teacher");
        Memur memur = new Memur("m","5","a","Lojistik");
        Asistan asistan = new Asistan("Asistan","a","a","Seng","Asistan","-");
        Ogretmen ogretmen = new Ogretmen("a","a","a","Seng","Seng101","Prof");
        Guvenlik guvenlik = new Guvenlik("a","a","a","a","a");
        Bilgi bilgi = new Bilgi("a","a","a","a","a");

        System.out.println(bilgi.getAdSoyad());

        asistan.yemek();


    }
}
