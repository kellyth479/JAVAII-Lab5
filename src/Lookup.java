import java.util.Scanner;

public class Lookup {

    public static void main(){

        //deserialize the HashMap object ./surname.dat

        //Continuously query the user for a surname until user enters quit
        //Case sensitive

        Scanner input = new Scanner(System.in);
        String userInput = new String();

        while(!"quit".equals(userInput)){

            System.out.println("Enter a surname (or quit to end): ");
            String query = input.next();
            input.nextLine();




        }

    }

}
