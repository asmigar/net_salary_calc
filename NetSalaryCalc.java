public class NetSalaryCalc {

    static final int VEHICLE_ALLOWANCE = 1000;
    static final int INCOME_TAX = 1200;

    static float calculateDA(int basicSalary){
        return basicSalary * .52f;
    }

    static float calculateHRA(int basicSalary){
        return basicSalary * .15f;
    }

    static float calculateGrossSalary(int basicSalary){
        return basicSalary + calculateDA(basicSalary) + calculateHRA(basicSalary) + VEHICLE_ALLOWANCE;
    }

    static float calculatePF(int basicSalary){
        return basicSalary * .12f;
    }

    static float calculateDeductions(int basicSalary){
        return calculatePF(basicSalary) + INCOME_TAX;
    }

    static float netSalary(int basicSalary){
        float grossSalary = calculateGrossSalary(basicSalary);
        float deductions = calculateDeductions(basicSalary);
        return grossSalary - deductions;
    }

    public static void main(String[] args) {
        String name = args[0];
        int basicSalary = Integer.parseInt(args[1]);
        System.out.println(name);
        System.out.println(basicSalary);

        System.out.println(name + ", your net salary is " + netSalary(basicSalary));
    }
}