import java.util.ArrayList;

public class Homework14Zada4a3 {
        private Integer floorNow = 0;
    public void numberOfLifts(int floor, int stepUp, int stepDown) {
        if(stepUp>=floor){
            System.out.println("You are lucky- lift go direkt up!");
        } else if (stepDown>=stepUp) {
            System.out.println("Sorry, you will never go up!");
        }
        ArrayList<Integer> floorArr = new ArrayList<Integer>();
        floorArr.add(floorNow);
        while (floorNow<floor){
            floorNow = floorNow + stepUp - stepDown;
            floorArr.add(floorNow);
        }
        for (Integer i=0; i< floorArr.size()-1;i++){
            System.out.print("\tStep № "+i+"\t: from floor "+floorArr.get(i)+"\t-> to floor "+floorArr.get(i+1)+" | ");
        }
        floorNow = 0;
    }
}
