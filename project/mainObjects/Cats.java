package project.mainObjects;
import java.io.Serializable;

public class Cats implements Serializable {
    public int id;
    public String catName;
    public int catAge;
    public boolean isInCage;

    public Cats(){}

    public Cats(String id, String catName, String catAge, String isInCage){
        this(Integer.parseInt(id), catName, Integer.parseInt(catAge), Boolean.parseBoolean(isInCage));
    }

    public Cats(int id, String catName, int catAge, boolean isInCage){
        this.id=id;
        this.catName=catName;
        this.catAge=catAge;
        this.isInCage=isInCage;
    }

    public String showName(){
        return String.format("%d, Imię - %s, Wiek - %d", this.id, this.catName, this.catAge);
    }

}
