package Kursovoy;

public class Profeshion {
    private Prof prof;
    private String description;

    public Profeshion(Prof prof, String description) {
        this.prof = prof;
        this.description = description;
    }

    public Prof getProf() {
        return prof;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Profeshion{" +
                "prof=" + prof +
                ", description='" + description + '\'' +
                '}';
    }

    //название професии с небольшым коментом для тех кто их оберает
    public enum Prof {
        Manicur("Маникьюр"), Nastroyka("Настройка электроприборов");

        private String name;

        private Prof(String name) {
            this.name = name;
        }
    }
}
