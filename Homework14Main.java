import java.util.Scanner;

public class Homework14Main {
    public static void main(String[] args) {
        Homework14Zada4a1 zad1 =new Homework14Zada4a1(){};
        Homework14Zada4a2 zad2 = new Homework14Zada4a2(){};
        Homework14Zada4a3 zad3 = new Homework14Zada4a3(){};
        Scanner reader = new Scanner(System.in);
        Integer chois;
        do{
            System.out.println("\nChoose: \t1. Zada4a1\t2. Zada4a2 \t3. Zada4a3\t4. Zada4a4\t5. Exit");
            chois= reader.nextInt();
            if(chois.equals(1)){
                zad1.workingStat();
            } else if (chois.equals(2)) {
                zad2.dayCount();
            } else if (chois.equals(3)) {
                System.out.println("Insert how many floor has bilding:");
                Integer floor = reader.nextInt();
                System.out.println("Insert how many floor up go lift:");
                Integer stepUp =reader.nextInt();
                System.out.println("Insert how many floor down go lift:");
                Integer stepDown = reader.nextInt();
                zad3.numberOfLifts(floor,stepUp,stepDown);
            } else if (chois.equals(5)) {
                System.out.println("Goodbyu!");
                break;
            }else {
                System.out.println("Input 1 to 5");
            }
        }while (true);
    }
}
