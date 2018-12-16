package Kursovoy;

public class Customer {  //клиенты моей программы
    private final String name;
    private final Telephon telephon;
    private final String mail;

    public Customer(String name, Telephon telephon, String mail) {
        this.name = name;
        this.telephon = telephon;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public Telephon getTelephon() {
        return telephon;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", telephon='" + telephon + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
