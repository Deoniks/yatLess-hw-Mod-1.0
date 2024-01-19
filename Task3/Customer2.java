package Task3;

public class Customer2 {
    private int id;
    private String name;
    private char gender;

    public Customer2(int id, String name, char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String gender){ // This method for ex4...
        if (gender.equals(Gender.MALE)){
            this.gender = 'M';
        }else if(gender.equals(Gender.FEMALE)){
            this.gender = 'F';
        }else
            this.gender = 'O';
    }

    @Override
    public String toString() {
        return "name=" + id;
    }
}
