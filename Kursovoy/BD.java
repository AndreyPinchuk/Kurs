package Kursovoy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BD {
    private List<Worker> workers = new ArrayList<>();
    private List<User> users = new ArrayList<>();


    public void addWork(Worker worker) { //добавления Воркера
        workers.add(worker);
    }

    public void addUser(User user) { //добавления Юзера
        users.add(user);
    }

    public List<Worker> findWorker(Profeshion.Prof prof, Location location) {
        List<Worker> w = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getProfeshion().getProf().equals(prof)) {
                if (worker.getLocation().toString().equals(location.toString())) {
                    w.add(worker);
                }
            }
        }
        return w;
    }

    public List<Worker> findWorker(Location location) {
        List<Worker> w = new ArrayList<>();
        for (Worker worker : workers) {
            if (Objects.equals(worker.getLocation().toString(), location.toString())) {
                w.add(worker);
            }
        }
        return w;
    }

    public List<Worker> findWorker(Profeshion.Prof prof) {
        List<Worker> w = new ArrayList<>();
        for (Worker worker : workers) {
            if (Objects.equals(worker.getProfeshion().getProf(), prof)) {
                w.add(worker);
            }
        }
        return w;
    }

//Это всё ещё в розработке, будет сериализация и десериализация в файл



    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "BD{" +
                "workers=" + workers + "\n" +
                "users=" + users +
                '}';
    }
}
