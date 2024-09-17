public class latihan1 {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3};

        int jumlah = 0;
        for(int i = 0; i < ar.length; i++){
            jumlah += ar[i];
        }
        System.out.println("Jumlah elemen array: " + jumlah);
    }
}