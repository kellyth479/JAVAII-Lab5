import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

public class CensusData {

    public static void main(String args[])throws Exception{

        //Read from the URL
        URL census = new URL("https://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");
        BufferedReader in = new BufferedReader(new InputStreamReader(census.openStream()));
        int i = 0;
        String inputLine;
        Surname newSurname = new Surname();
        Surname testSurname = new Surname();
        HashMap<String, Surname> surnameHashMap = new HashMap<>();
        String surname;
        double frequency;
        int rank;
        while ((inputLine = in.readLine()) != null) {
            System.out.println("#####");
            System.out.print("Line# ");
            System.out.println(i);
            i++;
            System.out.println(inputLine);
            String regexInput = inputLine.replaceAll("\\s+", "\\\t");
            String [] split = regexInput.split("\\t");
//            System.out.println(split.length);
            surname = split[0];
            frequency = Double.parseDouble(split[1]);
            rank = Integer.parseInt(split[3]);
            newSurname.setSurname(surname);
            newSurname.setFrequency(frequency);
            newSurname.setRank(rank);
//            System.out.println("#####");
            System.out.println("Surname: " + newSurname.getSurname());
            System.out.println("Frequency: " + newSurname.getFrequency());
            System.out.println("Rank: " + newSurname.getRank());
            surnameHashMap.put(surname, newSurname);
            testSurname = surnameHashMap.get(surname);
            System.out.println("Test Surname: " + testSurname.getSurname());
            System.out.println("Test Frequency: " + testSurname.getFrequency());
            System.out.println("Test Rank: " + testSurname.getRank());
//            for(int j = 0; j < split.length;j++){
//                System.out.println("#####");
//                System.out.println(split[j]);
//            }
            Thread.sleep(1000);
        }
        in.close();



        //create Surname object for each row in the file

        //add the Surname object to a HashMap using the Surname as the key

        //Serialize the HashMap to ./surname.dat


    }
}
