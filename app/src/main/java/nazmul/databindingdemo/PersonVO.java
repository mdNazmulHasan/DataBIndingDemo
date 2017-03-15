package nazmul.databindingdemo;

/**
 * Created by Nazmul on 3/15/2017.
 */

public class PersonVO {

    private String name;
    private String occupation;

    public PersonVO(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}