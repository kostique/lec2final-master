package lec2final;

public class SystemOutReport implements Report {
    private Customer customer;

    SystemOutReport(Customer customer){
        this.customer = customer;
    }

    private String createReport(Customer customer) {
        StringBuilder result = new StringBuilder("Учет аренды для " + customer.getName() + "\n");

        for (Rental rental : customer.getRentals()) {
//показать результаты для этой аренды
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(String.valueOf(rental.rentalCost())).append("\n");
        }

//добавить нижний колонтитул
        result.append("Сумма задолженности составляет ").append(String.valueOf(customer.getTotalAmount())).append("\n");
        result.append("Вы заработали ").append(String.valueOf(customer.getFrequentRenterPoints())).append(" очков за активность");
        return result.toString();
    }
    public void print(){
        System.out.println(createReport(customer));
    }
}

