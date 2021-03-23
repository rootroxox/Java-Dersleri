public class Ders24 {
    /*
                            FOR EACH DÖNGÜSÜ
            for(VeriTipi değişkenAdı : veriYapısı){
                code...
                code...
                code...
            }

            for(int i : ages){
                System.out.print(i);
            }

            */
    public static void main(String[] args) {
        int[] ages = new int[]{5,6,77,12,53};

//        for (int age : ages) {
//            System.out.println(age);
//        }
//
//        System.out.println("***********************");
//
//        for(int j : ages){
//            System.out.println(j);
//        }

        int[][] ikiBoyutluDizi = new int[][]{
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };

        for (int[] i : ikiBoyutluDizi) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("***************************");

        for (int[] ints : ikiBoyutluDizi) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }




    }

}
