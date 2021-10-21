package model.entities.entities;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Client {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    String name;
    String email;
    Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name +
                " (" +
                sdf.format(birthDate) +
                ") - " +
                email;
    }

}
