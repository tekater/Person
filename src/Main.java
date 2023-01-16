import person.Programmer;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("John");
        p.setYearsOfBirth(2000);
        p.setAddress("Street 149");
        p.setStartDate(new Date());
        p.setSalary(500_000L);
        p.setProgrammingLanguages(new String[] {"Java","Scala","Kotlin","Julia"});
        System.out.println("Name: " + p.getName());
        System.out.println("Years of Birth: " + p.getYearsOfBirth());
        System.out.println("Salary: " + p.getSalary());
        System.out.println("Address: " + p.getAddress());
        System.out.println("Prog.Languages: " + Arrays.toString(p.getProgrammingLanguages()));

    }
}
