import java.util.Random;
import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {
        Random newRandom = new Random();
        int randomnumber = newRandom.nextInt(11);
        System.out.println("Введите число от 0 до 10:");
        Scanner newScanner = new Scanner(System.in);
        int scannerNumber = newScanner.nextInt();
        for (int schetchik = 3; schetchik > 0; --schetchik) {
            if (scannerNumber > randomnumber) {
                System.out.println("Ваше число больше загаданного Осталось попыток: " + schetchik);
                Scanner newscannerT = new Scanner(System.in);
                int scannerttwo = newscannerT.nextInt();
                scannerNumber = scannerttwo;
            } else if (scannerNumber < randomnumber) {
                System.out.println("Ваше число Меньше загаданного. Осталос попыток " + schetchik);
                Scanner newscnnaerThr = new Scanner(System.in);
                int newScannerThree = newscnnaerThr.nextInt();
                scannerNumber = newScannerThree;
            }
        }
        if (scannerNumber > randomnumber || scannerNumber < randomnumber) {
            System.out.println("Поражение!");
        }
        else  {
            System.out.println("Победа!");
        }
    }
}