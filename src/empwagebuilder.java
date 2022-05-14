public class Empwagebuilder {
    static final int EMP_STATUS = 1;

    static final int WAGES_PER_HOUR = 20;
    static final int FULL_TIME_WORKER = 8;

    static final int PART_TIME_WORKER = 4;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == EMP_STATUS) {
            System.out.println("employee is present");
            int wages_per_day = WAGES_PER_HOUR * FULL_TIME_WORKER;
            System.out.println("employee is wages per day " + wages_per_day);

            int Part_TIME_WORKER_WAGES = PART_TIME_WORKER * WAGES_PER_HOUR;
            System.out.println("employee wages:" + Part_TIME_WORKER_WAGES);

        } else
            System.out.println("employee is absent");
    }
}

