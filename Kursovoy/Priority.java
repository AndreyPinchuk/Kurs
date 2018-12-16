package Kursovoy;

import java.util.List;

public class Priority {
    private Rating rating;  //оценка
    private String description; //коментарий к оценке

    public Priority(Rating rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public static double averagePriority(List<Priority> list) { //выщитование средней оценки рейтинга
        double prior = 0;
        for (Priority priority : list) {
            prior += priority.getRating().starts.length();
        }
        return Math.round(prior / list.size());
    }


    @Override
    public String toString() {
        return "Priority{" +
                "rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }

    public enum Rating { //оценки по рейтингу
        F("*"), D("**"), C("***"), B("****"), A("*****");

        private String starts;

        private Rating(String starts) {
            this.starts = starts;
        }
    }

    public Rating getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }
}
