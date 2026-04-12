
import java.io.Serializable;

class student implements Serializable{
    private String name;
    private int S_ID;
    private int age;
    private transient String password;

    public student(String name, int S_ID, int age, String password) {
        this.name = name;
        this.S_ID = S_ID;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getS_ID() {
        return S_ID;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}