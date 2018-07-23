package lec2final;

public class HTMLReport extends BaseReport{

    HTMLReport(Report report, Customer customer) {
        super(report, customer);
    }

    public void print(){
        super.print();
        System.out.println("************************************");
        System.out.println(createReport(customer));
        }
    private String createReport(Customer customer){
        StringBuilder result = new StringBuilder("<table>" + "\n" + "\t" + "<tbody>" +
                "\n" + "\t" + "\t" + "<tr>" + "\n" + "\t" + "\t"+ "\t" + "<th colspan=" + "\"" + "3" + "\"" + ">"
                + "Учет аренды для " + customer.getName() + "</th>" + "\n" + "\t"+ "\t" + "</tr>" + "\n");

        for (Rental rental : customer.getRentals()) {
//показать результаты для этой аренды
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(String.valueOf(rental.rentalCost())).append("\n");
        }

//добавить нижний колонтитул
        result.append("Сумма задолженности составляет ").append(String.valueOf(customer.getTotalAmount())).append("\n");
        result.append("Вы заработали ").append(String.valueOf(customer.getFrequentRenterPoints())).append(" очков за активность");
        return result.toString();
    }
}
