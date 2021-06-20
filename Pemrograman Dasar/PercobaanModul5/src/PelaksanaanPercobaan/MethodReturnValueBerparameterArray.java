package PelaksanaanPercobaan;

public class MethodReturnValueBerparameterArray {

    public static void main(String[] args) {

        int [] arr = {2,7,5,19,4,11,3,27,17,10};
        sort(arr);
        for (int value : arr) {
            System.out.print(value+" ");
        }
    }

    private static int[] sort (int [] acak){
        int bil1 = 0;
        int bil2 = 0;
        while(bil1<acak.length){
            bil2=bil1;
            while (bil2<acak.length){
                if (acak[bil1]<acak[bil2]){
                    int temp = acak[bil1];
                    acak [bil1] = acak [bil2];
                    acak[bil2] = temp;

                }
                bil2++;
            }
            bil1++;
        }
        return acak;
    }
}
