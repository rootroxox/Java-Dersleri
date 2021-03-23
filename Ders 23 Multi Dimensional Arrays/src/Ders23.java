public class Ders23 {
    /*
                        ÇOK BOYUTLU DİZİLER (MULTI DIMENSIONAL ARRAYS)

          VeriTipi[][][].... diziAdı = new Veritipi[boyut][boyut][boyut]...;

          Örnek = int[][] ikiBoyutluArray = new int[3][5];

          |0,0|     |0,1|      |0,2|     |0,3|       |0,4|
          |1,0|     |1,1|      |1,2|     |1,3|       |1,4|
          |2,0|     |2,1|      |2,2|     |2,3|       |2,4|

          |1|     |2|      |3|     |4|       |5|
          |1|     |2|      |3|     |4|       |5|
          |1|     |2|      |3|     |4|       |5|


     */

    public static void main(String[] args) {
        int[][] ikiBoyutluArray = new int[3][5];

//        for (int i = 0; i < ikiBoyutluArray.length; i++) {
//            for (int j = 0; j < ikiBoyutluArray[i].length; j++) {
//                ikiBoyutluArray[i][j] = j;
//            }
//        }

//        for (int i = 0; i < ikiBoyutluArray.length; i++) {
//            for (int j = 0; j < ikiBoyutluArray[i].length; j++) {
//                System.out.println(ikiBoyutluArray[i][j] + " ");
//            }
//            System.out.println();
//        }
                                        //3  3
        int[][] ikiBoyutluArray2 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < ikiBoyutluArray2.length; i++) {
            for (int j = 0; j < ikiBoyutluArray2[i].length; j++) {
                System.out.println(ikiBoyutluArray2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
