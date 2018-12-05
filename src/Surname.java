//Surname class that holds a surname, the frequency of that surname and the rank of that surname

import java.io.Serializable;

public class Surname implements Serializable{
    private String Surname;
    private double frequency;
    private int rank;


    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void printMe(){
        System.out.println("#########");
        System.out.println(Surname);
        System.out.println(frequency);
        System.out.println(rank);
        System.out.println("#########");
    }

}
