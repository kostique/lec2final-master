package lec2final;

public class BaseReport implements Report{
    private Report report;
    Customer customer;
    BaseReport(Report report, Customer customer){
        this.report = report;
        this.customer = customer;
    }

    @Override
    public void print() {
        report.print();
    }
}
