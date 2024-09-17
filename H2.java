public class H2 {
    public static void main(String[] args) {


        //menggunakan for
        System.out.println("Menggunakan for");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        //menggunakan for each
        System.out.println("Menggunakan for-each");
        int[] angka = new int[10];
        int index = 0;
        for (int i = 2; i <= 20; i += 2) {
            angka[index] = i;
            index++;
        }
        for (int a : angka) {
            System.out.println(a);
        }


        //menggunakan while
        System.out.println("Menggunakan while");
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //menggunakan do-while
        System.out.println("Menggunakan do-while");
        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}