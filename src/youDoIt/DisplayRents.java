package youDoIt;

import java.util.Scanner;

public class DisplayRents {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int [] [] rents = {{400, 450, 510},
                {500, 560, 630},
                {625, 676, 740},
                {1000, 1250, 1600}};
        int floor;
        int bdrms;
//        for(floor = 0; floor < rents.length; ++floor){
//            for(bdrms = 0; bdrms < rents[floor].length; ++bdrms){
//                System.out.println("Floor " + floor + " Bedrooms " + bdrms + " Rent is $" + rents[floor][bdrms]);
//            }
//        }
        for(floor = 0; floor < rents.length; ++floor) {
            System.out.println("Enter a floor to live on (0 - 3) >> ");
            floor = input.nextInt();
        }
        for(bdrms = 0; bdrms < rents[floor].length; ++bdrms){
            System.out.println("Enter amount of bedrooms you want (0 - 2) >> ");
            bdrms = input.nextInt();
        }
    }
}
//NEED TO FINISH STILLLLLLL