/*
    https://app.patika.dev/moduller/java101/pratik-login-1

    Ödev
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
    şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
    "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
     yazan programı yazınız.
 */

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password, newPassword;
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adi: ");
        userName = input.nextLine();

        System.out.print("Parola: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Basariyla giris yaptiniz!");
        }
        else{
            System.out.println("Bilgileriniz yanlis! Parolanizi sifirlamak ister misiniz?\n1-)Evet 2-)Hayir");
            choice = Integer.parseInt(input.nextLine());

            if(choice == 1){
                System.out.print("Yeni parolanizi giriniz: ");
                newPassword = input.nextLine();

                if(newPassword.equals(password) || newPassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Sifre basariyla olusturuldu!");
                }
            }
        }



    }
}
