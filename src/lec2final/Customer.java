package lec2final;

import java.util.ArrayList;
import java.util.List;


class Customer {
    private String _name;
    private List<Rental> _rentals = new ArrayList<>();

    Customer(String name) {
        _name = name;
    }

    void addRental(Rental arg) {
        _rentals.add(arg);
    }

    String getName() {
        return _name;
    }

    List<Rental> getRentals() {
        return _rentals;
    }
    int getFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : _rentals) {
            frequentRenterPoints += rental.rentalPoints();
        }
        return frequentRenterPoints;
    }

    double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : _rentals) {
            totalAmount += rental.rentalCost();
        }
        return totalAmount;
    }
}