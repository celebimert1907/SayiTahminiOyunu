import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 100);
        System.out.println(number);

        Scanner input = new Scanner(System.in);

        int right = 4;
        for (int i = 0; i<5; i++){
            System.out.print("Lutfen bir sayi tahmininde bulunun: ");
            int estimation = input.nextInt();
            if (estimation == number){
                System.out.println("Dogru tahminde bulundunuz: " + "Istenilen sayi: " + number +
                        "\nTahmin edilen sayi: " + estimation);
            } else if (estimation < number){
                System.out.println("Tahmin edilen sayi beklenen sonuctan kucuktur. Tahmininizi yukseltin !" +
                        "\nKalan Hakkiniz: " + right--);
            } else if (estimation > number){
                System.out.println("Tahmin edilen sayi beklenen sanuctan buyuktur. Tahmininizi azaltin !" +
                        "\nKalan Hakkiniz: " + right--);
            } else if (number == estimation){
                System.out.println("Dogru tahminde bulundunuz. Tebrikler.");
                System.out.println("Kalan Hakkiniz: " + right);
                break;
            } else {
                System.out.println("İstenilen aralıkta sayi tahminiden bulunmadınız");
            }
        }

    }
}
