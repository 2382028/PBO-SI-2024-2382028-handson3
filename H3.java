public class H3 {
    public static void main(String[] args) {
        //menggunakan for
        System.out.println("Menggunakan for");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
        }
        //menggunakan for each
        System.out.println("Menggunakan for-each");
        int[] angka = new int[20]; // Array untuk menampung angka dari 1 hingga 20
        for (int j = 0; j < angka.length; j++) {
            angka[j] = j + 1;
        }
        for (int a : angka) {
            if (a % 3 == 0) {
                continue;
            }
            if (a > 15) {
                break;
            }
            System.out.println(a);
        }

        //menggunakan while
        System.out.println("Menggunakan while");
        int i = 1;
        while (i <= 20) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
            i++;
        }

        //menggunakan do-while
        System.out.println("Menggunakan do-while");
        i = 1;
        do {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            if (i > 15) {
                break;
            }
            System.out.println(i);
            i++;
        } while (i <= 20);
    }
}