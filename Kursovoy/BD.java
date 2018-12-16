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
//        try {
//            fileWrite(workers,"c:\\Program Files\\Java\\OOP Java\\src\\Kursovoy\\Worker.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
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
//    public <T> void fileWrite(List<T> arrayList, String s) throws IOException{
//        try {
//            FileWriter fw = new FileWriter(s,true);
//
//            BufferedWriter bufOut = new BufferedWriter(fw);
//
//            for (T t : arrayList) {
//                bufOut.write(t.toString()+"\n");
//            }
//
//        } catch (IOException e){
//            System.out.println("Error!"+e);
//        }
//    }
//
//
/////*    private List<Location> locations = new ArrayList<>();
////
////    public void addLoc(String s) {
////        try {
////            FileReader fr = new FileReader(s);
////            BufferedReader burIN = new BufferedReader(fr);
////            String s0;
////            String[] ss;
////            while ((s0=burIN.readLine()) !=null){
////                ss = s0.split(" ");
////
////                for (String s1 : ss) {
////                    locations.add(new Location(s1));
////                }
////            }
////
////
////        } catch (IOException e) {
////            e.printStackTrace();
//
////        }
//
////    }*/
//
////    public <T> List<T> fileRead(String s) throws IOException{
////        try {
////            FileReader fr = new FileReader(s);
////            BufferedReader bufIn = new BufferedReader(fr);
////            List t = new ArrayList<>();
////            String s1;
////            while ((s1 = bufIn.readLine()) !=null){
////                t.add(s1.split(",="));
////            }
////
////            for (Object o : t) {
////                System.out.println(o.toString());
////            }
////        }catch (IOException e){
////            System.out.println("Error!" + e);
////        }
////    }


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
