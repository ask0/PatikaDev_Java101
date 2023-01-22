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
        else if(fark > 9 && fark < 20)
            return this.salary * 0.1;
        else if(fark > 19)
            return this.salary * 0.15;
        return -1;
    }

    @Override
    public String toString() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Tarihi: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş Artışı: " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - this.tax() + this.bonus()));
        System.out.println("Toplam Maaş: " + (this.salary + this.raiseSalary()));
        return null;
    }
}
