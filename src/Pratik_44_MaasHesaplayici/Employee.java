package Pratik_44_MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000)
            return 0;
        if (this.salary > 1000)
            return (this.salary * 0.03);
        return -1;
    }

    double bonus() {
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        return -1;
    }

    double raiseSalary() {
        int fark = 2021 - this.hireYear;
        if (fark < 10)
            return this.salary * 0.05;
        else if (fark > 9 && fark < 20)
            return this.salary * 0.1;
        else if (fark > 19)
            return this.salary * 0.15;
        return -1;
    }

    @Override
    public String toString() {
        return "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Tarihi: " + this.hireYear +
                "\nVergi: " + this.tax() +
                "\nBonus: " + this.bonus() +
                "\nMaaş Artışı: " + this.raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + (this.salary - this.tax() + this.bonus()) +
                "\nToplam Maaş: " + (this.salary + this.raiseSalary());
    }
}
