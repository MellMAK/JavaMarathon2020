package day11;
/*
In the warehouse, the assembly and packaging of the online order takes place.
Create classes:
- Warehouse. Fields : countOrder (number of collected orders), balance (income from delivered orders). Get и set methods
for both fields. To get information about the values of warehouse fields, override the method toString().
- Picker , with field "salary" , only with get() method.
- Courier, with field "salary" , only with get() method.
Each member class must implement the interface  Worker , in which you need to declare methods doWork() and bonus().
Every time an employee does their job (method doWork()), he is paid wages (80 - for Picker, 100 - for Courier).
Also, when calling doWork() on the Picker, the value of the countOrder field in the Warehouse class increases by 1.
When calling doWork() on the Courier, the balance variable in the Warehouse class is incremented by 1000.
Employees are entitled to a bonus (individual calculation for each): when the 1500th order is shipped at the warehouse,
the picker's salary earned by that time is tripled. When the warehouse has earned 1,000,000, the courier's salary earned
up to that point is doubled.

To demonstrate and test the operation of the program, create a warehouse and 1 worker each, call the doWork() and
bonus() methods for each, so many times that each of the employees receives a bonus. Display the balance and the number
of completed orders in the warehouse and the salary of each employee in the console.

Create a second warehouse, also accept 1 employee with a single call to doWork () for each. Check that warehouse 1 and
its employees do not change their values.*/
public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();

        System.out.println(warehouse + " " + picker + " " + courier);

        for (int i = 0; i <1500 ; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse + " " + picker + " " + courier);

        picker.bonus();
        courier.bonus();

        System.out.println(warehouse + " " + picker + " " + courier);

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);

        picker2.doWork();
        courier2.doWork();

        System.out.println(warehouse2 + " " + picker2 + " " + courier2);

    }
}
