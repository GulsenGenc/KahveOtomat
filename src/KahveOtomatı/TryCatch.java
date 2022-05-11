package KahveOtomatı;

import java.util.Scanner;

public class TryCatch {
    static Scanner scan = new Scanner(System.in);

    public static String stringGiris() {
        boolean flag = false;
        String secim = "";

        do {
            System.out.println("Lütfen secim yapınız\n");
            try {
                secim = scan.next();
            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız");
                flag = true;
                stringGiris();
            }

        } while (flag);
        return secim;
    }

    public static int intGiris() {
        int secim = 0;
        boolean flag = false;

      do {
          if (flag)
          System.out.println("Lütfen secim yapınız\n");
          try {
              secim = scan.nextInt();
              scan.nextLine();
              break;
          } catch (Exception e) {
              System.out.println("Hatalı giriş yaptınız");

          }
      }while (flag);

        return secim;
    }
}




