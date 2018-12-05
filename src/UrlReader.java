import java.net.*;
import java.io.*;

public class UrlReader {
    public static void main(String[] args) throws Exception {

       URL oracle = new URL("https://www2.census.gov/topics/genealogy/1990surnames/dist.all.last");

        //URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(oracle.openStream()));
        int i = 0;
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.print("Line# ");
            System.out.println(i);
            i++;
            System.out.println(inputLine);
            String regexInput = inputLine.replaceAll("\\s+", "\\\t");
            String regexInput2 = regexInput.replaceAll("\\n", "");
            String [] split = regexInput2.split("\\t");
            System.out.println(split.length);
            double frequency = Double.parseDouble(split[1]);
            System.out.print("-----------DOUBLE: ");
            System.out.println(frequency);
            System.out.print("-----------INT: ");
            int rank = Integer.parseInt(split[3]);
            System.out.println(rank);
            for(int j = 0; j < split.length;j++){
                System.out.println("#####");
                System.out.println(split[j]);


            }
            Thread.sleep(6000);
        }
        in.close();
    }
}