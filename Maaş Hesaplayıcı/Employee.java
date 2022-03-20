public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary,double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        return (this.salary < 1000) ? 0: (this.salary * 0.03);
    }

    double bonus(){
        return (this.workHours <= 40) ? 0: ((this.workHours - 40) * 30);
    }

    double raiseSalary(){
        int activeYears = 2021 - this.hireYear;
        if(activeYears < 10) return (this.salary * 0.05);
        else if(activeYears < 20) return (this.salary * 0.10);
        else return (this.salary * 0.15);
    }

    void toStrings(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() + this.raiseSalary() - this.tax()));
    }

}
