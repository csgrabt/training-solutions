package week05d04.junior;

import java.time.LocalDate;

public class Product {
    private final String name;
    private final LocalDate expirationDate;

    public Product(String name, int year, int month, int day) {
        this.name = name;
        this.expirationDate = LocalDate.of(year, month, day);
    }


    public String getName() {
        return name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }


}
