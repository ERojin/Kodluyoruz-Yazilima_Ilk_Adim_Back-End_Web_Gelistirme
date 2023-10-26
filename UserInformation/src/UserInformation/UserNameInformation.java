package UserInformation;

import java.util.Scanner;

public class UserNameInformation {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        String userName = kb.nextLine();
        System.out.print("Kullanıcı adına ait şifrenizi giriniz:");
        String password = kb.nextLine();

        userInfoCheck(userName,password);
    }
    public static void userInfoCheck(String userName, String password)
    {
        Scanner kb = new Scanner(System.in);
        if (userName.equals("Patika") && password.equals("java123"))
            System.out.print("Giriş başarılı" );
        else {
            System.out.print("Giriş başarısız!");
            System.out.print("Tekrar şifre oluşturmak ister misiniz? Şifre oluşturmak için 'evet' yazabilirsiniz");
            String answer = kb.nextLine();
            if (answer.equals("evet"))
                newPassword(password);
        }
    }

    public static void newPassword(String password)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Yeni şifrenizi giriniz:");
        String newpassword = kb.nextLine();

        if (newpassword.equals("java123")) {
            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz:");

            for (;;) {
                System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz:");
                newpassword = kb.nextLine();

                if (!newpassword.equals("java123"))
                    break;
            }
            System.out.print("Yeni şifre oluşturuldu!");

        }
        else
            System.out.print("Yeni şifre oluşturuldu!");
    }
}
