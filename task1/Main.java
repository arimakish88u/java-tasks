import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan, digit;
        double roubles;
        Scanner yuihhjnj = new Scanner(System.in);
        yuan = yuihhjnj.nextInt();
        digit = yuan % 10;
        roubles = yuan * ROUBLES_PER_YUAN;
        if (yuan >= 0) {
            if (yuan % 100 > 10 &&  yuan % 100 < 20)
                System.out.print(yuan + " китайских юаней это ");
            else if (digit == 1)
                System.out.print(yuan + " китайский юань это ");
            else if (digit > 1 && digit < 5)
                System.out.print(yuan + " китайских юаня это ");
            else
                System.out.print(yuan + " китайских юаней это ");
            System.out.println(Math.round(roubles * 100.0) / 100.0 + " в российских рублях.");
        }
        else
            System.out.println("Ошибка! Отрицательные значения не принимаются.");

    }
}
