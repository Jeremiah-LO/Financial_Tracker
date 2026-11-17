package service;
import java.util.ArrayList;

import model.Expense;
import model.Income;
import model.Transaction;
import model.Transaction.Category;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

    public class TransactionService {
        private ArrayList<Transaction> transactions;

        public void addExpense(double amount, String description, Category category, LocalDate date)  {
            Expense expense = new Expense(amount, description, category, date);
            transactions.add(expense);
        }
        public void addIncome(double amount, String description, Category category, LocalDate date)   {
            Income income = new Income(amount, description, category, date);
            transactions.add(income);
        }
        public double getTotalExpenses() {
            double total = 0;
            for (Transaction t : transactions) {
                if(t instanceof Expense) {
                    total += t.getAmount();
                }
            }
            return total;
        }

        public double getTotalIncome() {
            double total = 0;
            for(Transaction t: transactions) {
                if(t instanceof Income) {
                    total += t.getAmount();
                }
            }
            return total;
        }


    }

