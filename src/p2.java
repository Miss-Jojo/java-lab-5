interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Salary {
    double basic = 50000;

    public void earnings() {
        System.out.println("Earnings - " + (basic + 0.8 * basic + 0.15 * basic));
    }

    public void deductions() {
        System.out.println("Deduction - " + (0.12 * basic));
    }

    public void bonus() {
        // Not implemented here
    }
}

class Substaff extends Manager {

    public void bonus() {
        System.out.println("Bonus - " + (0.5 * basic));
    }

    public static void main(String[] args) {
        Substaff s = new Substaff();
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
