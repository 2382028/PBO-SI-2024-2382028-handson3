public class H1 {
    public static void main(String[] args) {
        String[] buah = {"Apel", "Pisang", "Mangga", "jeruk"};

        //menggunakan for
        System.out.println("Menggunakan for");
        for (int i = 0; i < buah.length; i++) {
            System.out.println(buah[i]);
        }

        //menggunakan for each
        System.out.println("Menggunakan for-each");
        for (String b : buah) {
            System.out.println(b);
        }

        //menggunakan while
        System.out.println("Menggunakan while");
        int i = 0;
        while (i < buah.length){
            System.out.println(buah[i]);
            i++;
        }

        //menggunakan do-while
        System.out.println("Menggunakan do-while");
        i = 0;
        do{
            System.out.printf(buah[i]);
            i++;
        }while(i < buah.length);

    }
}