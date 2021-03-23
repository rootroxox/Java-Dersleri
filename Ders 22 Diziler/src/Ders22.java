public class Ders22 {
    /*
                        DİZİLER

          VeriTipi[] diziAdı = new VeriTipi[NumOfItems];



     */
    public static void main(String[] args) {
        int[] array = new int[10];
        String[] names = new String[2];

        names[0] = "Ayberk";
        names[1] = "Murat";

        System.out.println(names[0]);





       // {             () () () () () () () () () ()            }

        for (int i = 0; i<array.length; i++){
            array[i] = i;
        }

        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }


    }
}
