class Employee {
    // Attributes
    private String name;
    private int id;
    private double basicSalary;
    private double grossSalary;

    // Constructor
    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Method to calculate gross salary
    public void calculateGrossSalary(double hraPercent, double allowancePercent) {
        double hra = (hraPercent / 100) * basicSalary;
        double allowances = (allowancePercent / 100) * basicSalary;
        grossSalary = basicSalary + hra + allowances;
    }

    // Method to apply a bonus
    public void applyBonus(double bonus) {
        grossSalary += bonus;
    }

    // Method to print updated salary details
    public void printSalaryDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("");
    }
}