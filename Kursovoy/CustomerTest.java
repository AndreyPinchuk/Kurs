package Kursovoy;

import java.util.Scanner;

public class CustomerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        User user2 = new User("Bob", new Telephon("+380444501006").patNumber(), "mail@mail.com", 9);
        Worker worker2 = new Worker("Dobad", new Telephon("+380952345678").patNumber(), "sdfg@dg.ua", 0111, new Profeshion(Profeshion.Prof.Nastroyka, "PC, notebook"), new Location("Авдеевка").patLocal());
        Worker worker3 = new Worker("Sara", new Telephon("+380777348293").patNumber(), "asdd@dfdf.us", 99, new Profeshion(Profeshion.Prof.Manicur, "manicur"), new Location("Киев").patLocal());

        BD bd = new BD();
        bd.addWork(worker2);
        bd.addUser(user2);
        bd.addWork(worker3);

        System.out.println(bd.findWorker(Profeshion.Prof.Manicur, new Location("Киев").patLocal()));
        System.out.println(bd.findWorker(new Location("Киев").patLocal()));
        System.out.println(bd.findWorker(Profeshion.Prof.Nastroyka));
        System.out.println("============================================");
        System.out.println(bd.toString());

    }
}
