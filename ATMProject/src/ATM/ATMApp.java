package ATM;

import java.util.Scanner;

class ATMApp {
    public int balance = 1500;
    public Scanner kb = new Scanner(System.in);
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        ATMApp select = new ATMApp();
        String userName, password;

        int right = 3;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız:");
            userName = kb.nextLine();
            System.out.print("Parola");
            password = kb.nextLine();

            if (userName.equals("Patika") && password.equals("dev123")) {
                System.out.print("Sisteme giriş yaptınız!");
                select.doWorkForSelect();
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                System.out.printf("Kalan hakkınız %d%n", right);
                if (right == 0)
                    System.out.println("Hesabınız bloke olmuştur, lütfen banka ile iletişime geçiniz.");
            }
        }
    }

    public void doWorkForSelect()
    {
        Scanner kb = new Scanner(System.in);

        int select;
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1 - Para Yatırma\n" +
                           "2 - Para Çekme \n" +
                           "3 - Bakiye Sorgulama\n" +
                           "4 - Çıkış    ");
        select = kb.nextInt();

        switch (select) {
            case 1:
                doWorkForDeposit();
                break;
            case 2:
                doWorkForWithdraw();
                break;
            case 3:
                doWorkForBalance();
                break;
            default:
                doWorkQuit();
        }
    }

    public void doWorkForDeposit()
    {
        System.out.print("Yatırmak istediğiniz miktarı giriniz:");
        int money = kb.nextInt();
        balance += money;
        System.out.printf("İşleminiz başarıyla gerçekleştirilmiştir. Yeni bakiyeniz:%d%n", balance);
    }

    public void doWorkForWithdraw()
    {
        System.out.print("Çekmek istediğiniz miktarı giriniz:");
        int money = kb.nextInt();

        if (balance < money)
            System.out.print("Bakiyeniz yetersiz");
        else {
            balance -= money;
            System.out.printf("İşleminiz başarıyla gerçekleştirilmiştir. Yeni bakiyeniz:%d%n", balance);
        }
    }

    public void doWorkForBalance()
    {
        System.out.printf("Bakiyeniz :%d%n", balance);
    }
    public static void doWorkQuit()
    {
        System.out.print("Hoşçakalın!");
    }
}
