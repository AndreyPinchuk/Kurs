package Kursovoy;

public class User extends Customer {
    private final int id;   //уникальный при создании профиля

    public User(String name, Telephon telephon, String mail, int id) {
        super(name, telephon, mail);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nUser " +
                "id=" + id +' '+ getName() + ' ' + getTelephon()+ ' ' + getMail();
    }
}
