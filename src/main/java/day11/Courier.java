package day11;

public class Courier implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(warehouse.getBalance()+1000);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() >= 10000) {
            salary *= 2;
        }
    }
}
