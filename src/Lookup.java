import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Lookup {

    public static void main(String args[]){

        //deserialize the HashMap object ./surname.dat
        HashMap<String, Surname> surnameHashMap = new HashMap<>();
        try{
            FileInputStream HashFileStream = new FileInputStream("./surname.dat");
            ObjectInputStream HashObjectStream = new ObjectInputStream(HashFileStream);
            surnameHashMap = (HashMap<String, Surname>) HashObjectStream.readObject();
            HashFileStream.close();
            HashObjectStream.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        catch(ClassNotFoundException cnf){
            System.out.println("%%%%CLASS%%%%");
            cnf.printStackTrace();
        }

        //Continuously query the user for a surname until user enters quit
        //Case insensitive

        Scanner input = new Scanner(System.in);
        String userInput = "";

        while(!"QUIT".equals(userInput)){

            System.out.println("Enter a surname (or quit to end): ");
            userInput = input.next();
            input.nextLine();
            userInput = userInput.toUpperCase();
            if(!"QUIT".equals(userInput)){
                if(surnameHashMap.get(userInput) != null){
                    Surname newSurname = surnameHashMap.get(userInput);
//                    newSurname.printMe();
                    System.out.println("-----------------");
                    System.out.println("userInput: " + userInput);
                    System.out.println("Surname: " + newSurname.getSurname());
                    System.out.println("Frequency: " + newSurname.getFrequency());
                    System.out.println("Rank: " + newSurname.getRank());
                }else{
                    System.out.println("Surname: " + userInput + " not found");
                }
            }

        }
        System.out.println("Process finished with exit code 0");

    }

}
