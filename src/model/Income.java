package model;

import java.time.LocalDate;

public class Income extends Transaction{

    public Income(double amount, String description, Category category, LocalDate date) {
        super(amount, description, category, date);
    }

    @Override
    public String getType() {
        return "INCOME";
    }
}
