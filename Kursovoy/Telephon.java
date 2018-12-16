package Kursovoy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Telephon {
    private String phoneNumber;

    public Telephon(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//проверка на правильность введения номера Украины
    public Telephon patNumber() throws IllegalArgumentException {
        Pattern pattern = Pattern.compile("^((\\+?380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher((CharSequence) phoneNumber);

        if (matcher.matches()) {
            return new Telephon(phoneNumber);
        } else {
            throw new IllegalArgumentException("Phone number '" + phoneNumber + "' is incorrect");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
