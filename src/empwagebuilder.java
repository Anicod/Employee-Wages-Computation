public class empwagebuilder {
    static final int EMP_STATUS = 1;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == EMP_STATUS)
            System.out.println("employee is present");
        else
            System.out.println("employee is absent");
    }
}

