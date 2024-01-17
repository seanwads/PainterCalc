import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    }

    private void startup(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Sean's Lazy painter calculator for lazy painters!");
        System.out.println("How many walls are you painting today? Please enter a whole number greater than 0");

        int wallNum;
        boolean hasCeiling = false;

        String wallNumStr = reader.nextLine();
        wallNum = Integer.parseInt(wallNumStr);

        while(!(wallNum > 0)){
            System.out.println("Please enter a whole number greater than 0");
            wallNumStr = reader.nextLine();
            wallNum = Integer.parseInt(wallNumStr);
        }

        if(wallNum >=10){
            System.out.println("That's a lot of walls! Are you sure you want to proceed? (y/n)");
            String wallConfirmInput = reader.nextLine().toUpperCase();

            while(!wallConfirmInput.equals("Y") && !wallConfirmInput.equals("N")){
                System.out.println("Please enter y for yes or n for no");
                wallConfirmInput = reader.nextLine().toUpperCase();
            }

            if(wallConfirmInput.equals("N")){
                System.out.println("Would you like to exit? (y/n)");
                String exitConfirmInput = reader.nextLine().toUpperCase();

                while(!exitConfirmInput.equals("Y") && !exitConfirmInput.equals("N")){
                    System.out.println("Please enter y for yes or n for no");
                    exitConfirmInput = reader.nextLine().toUpperCase();
                }

                if(exitConfirmInput.equals("Y")){
                    System.exit(0);
                }
                else{
                    startup();
                }
            }
        }

        System.out.println("Are you painting a ceiling? (y/n)");
        String ceilingConfirmInput = reader.nextLine().toUpperCase();

        while(!ceilingConfirmInput.equals("Y") && !ceilingConfirmInput.equals("N")){
            System.out.println("Please enter y for yes or n for no");
            ceilingConfirmInput = reader.nextLine().toUpperCase();
        }

        if(ceilingConfirmInput.equals("Y")) hasCeiling = true;

        getWallsInput(wallNum, hasCeiling);
    }

    private void getWallsInput(int wallCount, boolean hasCeiling){
        Room room = new Room(wallCount + (hasCeiling? 1:0));
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i < wallCount; i++){
            System.out.println("Wall " + i + 1 + ":");
            System.out.println("Please enter the width of the wall in cm");
            int width = Integer.parseInt(reader.nextLine());

        }
    }
}
