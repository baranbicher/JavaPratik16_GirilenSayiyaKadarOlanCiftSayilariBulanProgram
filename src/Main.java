import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, number=0, avarage,total=0;
        System.out.print("Sayı Girin: ");
        k = input.nextInt();

        for (int i = 0; i <=k;i++){
            if (i %3 == 0 && i %4 == 0){
                number++;
                total+=i;

                System.out.println(i);

            }
        }
        avarage = total/number;
        System.out.println("Girdiğiniz sayıya kadar, 3 ile 4'e bölünen sayılraın toplamı: " + total);
        System.out.println("Girdiğiniz sayıyya kadar, 3 ile 4'e bölünen sayıların ortalaması: " + avarage);

    }
}