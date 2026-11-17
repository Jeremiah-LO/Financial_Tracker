package model;

import java.time.LocalDate;

public class Expense extends Transaction{


public Expense(double amount, String description, Category category, LocalDate date) {
    super(amount, description, category, date);
}

@Override
    public String getType() {
    return "EXPENSE";
}




}
