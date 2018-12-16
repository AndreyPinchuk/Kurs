package Kursovoy;

import java.util.List;

public class Worker extends Customer {
    private final int id;
    private Profeshion profeshion;
    private Location location;
    private List<Priority> priorities;  //лист который будет под профилем воркера, где будут коменты с оценками

    public Worker(String name, Telephon telephon, String mail, int id, Profeshion profeshion, Location location) {
        super(name, telephon, mail);
        this.id = id;
        this.profeshion = profeshion;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public Profeshion getProfeshion() {
        return profeshion;
    }

    public Location getLocation() {
        return location;
    }

    public List<Priority> getPriorities() {
        return priorities;
    }

    @Override
    public String toString() {
        return "\nWorker " +
                "id=" + id + ' ' + getName() + ' ' + getTelephon() + ' ' + getMail() + ' ' +
                ", profeshion=" + profeshion +
                ", location=" + location;
    }
}
