public class empwagebuilder {
    static final int EMP_STATUS = 1;
    static final int WAGES_PER_HOUR = 20
    static final int PART_TIME_WORKER = 4;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == EMP_STATUS) {
            System.out.println("employee is present");
            int Part_TIME_WORKER_WAGES = PART_TIME_WORKER * WAGES_PER_HOUR;
            System.out.println("employee wages:" + Part_TIME_WORKER_WAGES);
        } else
            System.out.println("employee is absent");
    }
}

