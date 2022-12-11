import java.util.Scanner;

public class KullaniciGirisJava101 {
    public static void main(String[] args) {
        String upassword = "pass123.", UuserName = "patika", userName, password, accept;
        Scanner input = new Scanner(System.in);
        System.out.print("kullanıcı adı: ");
        userName = input.nextLine();
        System.out.print("password: ");
        password = input.nextLine();
        if (userName.equals(UuserName) && password.equals(upassword)) {
            System.out.println("Şifre ve kullanıcı adı doğru");
            System.out.println("Giriş yapılıyor");

        } else if (userName.equals(UuserName) && !(password.equals(upassword))) {
            System.out.println("Şifreniz yanlış");
            System.out.print("Şifrenizi değiştirmek istermisiniz e/h");
            accept = input.nextLine();
            if (accept.equals("e") || accept.equals("E")) {
                System.out.print("yeni şifrenizi giriniz");
                password = input.nextLine();
                System.out.print("yeni şifreniz: " + password);
            } else {
                System.out.println("çıkış yapılıyor");
            }
        } else {
            System.out.println("şifre veya kullanıcı adınız yanlıs");
        }

    }
}
