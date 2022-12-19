import java.util.Scanner;

public class havaSicakligiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

         */

        double sicaklik;
        System.out.print("Sıcaklığı Giriniz : ");
        sicaklik = input.nextDouble();
        if (sicaklik < 5) {
            System.out.print("Kayak yapabilirsiniz ");
        }
        if ((sicaklik >= 5) && (sicaklik <= 9)) {
            System.out.print("Sinemaya gidebilirsiniz ");
        }
        if (sicaklik >= 10 && sicaklik <= 15) {
            System.out.print("Sinemaya veya pikniğe gidebilirsiniz ");
        }
        if (sicaklik >= 16 && sicaklik <= 25) {
            System.out.print("Pikniğe gidebilirsiniz ");
        }
        if (sicaklik > 25) {
            System.out.print("Yüzebilirsiniz ");
        }

    }
}
