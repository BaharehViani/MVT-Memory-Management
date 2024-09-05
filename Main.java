import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter memory size: ");
        int memorySize = scan.nextInt();
        int freeSpace = memorySize;
        int filledUpTo = 0;
        while (true) {
            System.out.println("enter process size: ");
            int currentProcessSize = scan.nextInt();
            if (freeSpace < currentProcessSize) {
                System.out.println("not enough space");
                break;
            }
            freeSpace -= currentProcessSize;
            System.out.println((filledUpTo+1) + " to " + (filledUpTo+currentProcessSize) + " is allocated to process");
            filledUpTo += currentProcessSize;
        }
        System.out.println("external fragmentation = " + freeSpace);
        scan.close();
    }
}