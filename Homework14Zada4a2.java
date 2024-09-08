import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Homework14Zada4a2 {
    private Integer divisor =2;
    private Integer N;
    private ArrayList<Integer> divisorArr = new ArrayList<>();
    private Collection<?> Integer;

    public void dayCount() {
            Scanner reader = new Scanner(System.in);
            System.out.println("Please inser balans your acount:");
            N = reader.nextInt();
            Integer bufer = N;
            System.out.println(" You have: " + N + " Euro.");
            while (bufer!=0) {
                for (divisor = 2; divisor * divisor <= bufer; divisor++) {
                    if (bufer % divisor == 0) {
                        System.out.println("Min divisor for number "+bufer+" = " + divisor);
                        break;
                    }
                }
                if (divisor * divisor <= bufer) {
                    System.out.println("Max divisor for number "+bufer+"  = " + bufer / divisor);
                    System.out.println("----------------");
                    divisorArr.add(bufer / divisor);
                } else {
                    System.out.println(bufer+"  is simple number and max divisor = 1");
                    System.out.println("----------------");
                    divisorArr.add(1);
                }
                bufer = bufer - divisorArr.get(divisorArr.size() - 1);
            }
            System.out.println("divisors:");
            for (Integer i : divisorArr) {
                        System.out.print("\t" + i + ",");
                    }
        System.out.println("\n The numbers of divisors = "+divisorArr.size()+" and dis mean that we need "+divisorArr.size()+" day to withdrow total balans");
        System.out.println("\nOptimal schema for withdrow:");
            bufer=N;
        for (int i =0;i< divisorArr.size();i++){
            System.out.print("\tDay №"+(i+1)+"\tbalans: "+bufer+"\t withdrow sum: "+divisorArr.get(i));
            bufer = bufer -divisorArr.get(i);
        }
        divisorArr.removeAll(divisorArr);
    }
}
