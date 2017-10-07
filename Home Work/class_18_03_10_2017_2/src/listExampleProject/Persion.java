package listExampleProject;

public class Persion {
    private long id;
    private String name;
    private Gender gender;

    public Persion(long id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }
    
    
}
