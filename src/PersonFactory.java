import java.util.ArrayList;
import java.util.Collections;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        for(int i = 0; i < allPersons.size()-1; i++){
            if(person.getLastName().compareTo((allPersons.get(i)).getLastName()) < 0){
                allPersons.add(i,person);
            }
        }
    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<>();
        for(int k = 0; k<allPersons.size()-1;k++){
            if(allPersons.get(k).getAge()<18){
                under18.add(allPersons.get(k));
            }
        }
        return under18;
    }

    public boolean checkLastName(String lastName) {
        boolean checkLastName = false;
        for(int x = 0; x < allPersons.size()-1;x++){
            if(lastName.compareTo(allPersons.get(x).getLastName())==0){
                checkLastName = true;
                break;
            }
        }
        return checkLastName;
    }
}
