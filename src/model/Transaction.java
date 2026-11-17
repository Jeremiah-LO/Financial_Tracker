package model;

import java.util.UUID;
import java.time.LocalDate;


public abstract class Transaction {

    public enum Category {
        FOOD,
        TRANSPORT,
        HOUSING,
        ENTERTAINENT,
        HEALTH,
        SALARY,
        FREELANCE,
        OTHER
    }
    private final String id; // generates random id
    private final double amount;
    private final String description;
    private final LocalDate date;
    private final Category category;


    public Transaction(double amount, String description, Category category, LocalDate date) {
    this.id = UUID.randomUUID().toString().substring(0,8);
    this.amount = amount;
    this.description = description;
    this.category = category;
    this.date = date;
    }

    public abstract String getType();

    public String getID () { return id; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }
    public Category getCategory() { return category; }



}
