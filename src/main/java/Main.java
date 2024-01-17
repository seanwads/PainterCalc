import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to Sean's Lazy painter calculator for lazy painters!");
        System.out.println("How many walls are you painting today? Please enter a whole number greater than 0");

        boolean isValid = false;
        int wallNum;

        while(!isValid){
            String wallNumStr = reader.nextLine();
            wallNum = Integer.parseInt(wallNumStr);

            if(wallNum > 0 && wallNum < 10){
                isValid = true;
            } else if(wallNum >= 10){
                System.out.println("That's a lot of walls! Are you sure you want to proceed? (y/n)");
                if(reader.nextLine().equals("y") || reader.nextLine().equals("yes") || reader.nextLine().equals("Yes") || reader.nextLine().equals("1")){
                    isValid = true;
                }
            } else {
                System.out.println("Please enter a whole number greater than 0");
            }
        }

        System.out.println("And are you painting a ceiling? (y/n)");
        isValid = false;

        while(!isValid){
            
        }

    }

    private void getWallsInput(int wallCount){

    }
}
