import java.util.Random;

public class Homework14Zada4a1 {
    private Integer temperature1;
    private Integer temperature2;
    public void workingStat(){
        Random rand = new Random();
        temperature1 = rand.nextInt(90,130);
        temperature2 = rand.nextInt(70,110);
        if (temperature1 > 100 && temperature2 < 100){
            System.out.println("The device work properly.");
            System.out.print("\tThe temperature1 is "+temperature1+" \tThe temperature2 is " +
                    +temperature2);
        } else if (temperature1 > 100 && temperature2 > 100) {
            System.out.println("The device is not working! Check port 2 for problem!");
            System.out.print(" \tThe temperature1 is "+temperature1+" \tThe temperature2 is " +
                    +temperature2);
            System.out.println("\nPort2 is with "+(temperature2-100)+" Grad Celsius more than upper bond 100 Grad " +
                    "Celsius!");
        } else if (temperature1 < 100 && temperature2 <100) {
            System.out.println("The device is not working! Check port 1 for problem!");
            System.out.print(" \tThe temperature1 is "+temperature1+" \tThe temperature2 is " +
                    +temperature2);
            System.out.println("\nPort1 is with "+(-temperature1+100)+" Grad Celsius les than low bond 100 Grad " +
                    "Celsius!");
        }else {
            System.out.println("Port 1 and port 2 are out of service!");
            System.out.print(" \tThe temperature1 is "+temperature1+" \tThe temperature2 is " +
                    +temperature2);
            System.out.println("\nPort1 is with "+(-temperature1+100)+" Grad Celsius les than low bond 100 Grad " +
                    "Celsius!");
            System.out.println("Port2 is with "+(temperature2-100)+" Grad Celsius more than upper bond 100 Grad " +
                    "Celsius!");
        }
    }
}
