package live_coding.interview_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee lisa = new Employee("Lisa", "West street, 31/15", Designation.DEVELOPER, 27, "SI", "lisa@gmail.com", LocalDate.of(2024, 11, 10));
        Employee oleg = new Employee("Oleg", "East street, 18/14", Designation.SENIOR_SOFTWARE_ENGINEER, 41, "IR", "oleg@gmail.com", LocalDate.of(2019, 8, 22));
        Employee peter = new Employee("Peter", "1st line street, 21/155", Designation.QUALITY_ANALYST, 37, "DB", "peter@gmail.com", LocalDate.of(2020, 5, 8));
        Employee tomas = new Employee("Tomas", "3rd line street, 4/32", Designation.SOFTWARE_ENGINEER, 31, "SI", "tomas@gmail.com", LocalDate.of(2021, 4, 17));
        Employee stan = new Employee("Stan", "South street, 11/33", Designation.SENIOR_DEVELOPER, 34, "IR", "stan@gmail.com", LocalDate.of(2019, 10, 1));

        List<StoreData> storeDatas =  new ArrayList<>();
        storeDatas.add(new StoreData(lisa.getName(), lisa));
        storeDatas.add(new StoreData(oleg.getName(), oleg));
        storeDatas.add(new StoreData(peter.getName(), peter));
        storeDatas.add(new StoreData(tomas.getName(), tomas));
        storeDatas.add(new StoreData(stan.getName(), stan));
        storeDatas.add(new StoreData(lisa.getName(), lisa));
        storeDatas.add(new StoreData(oleg.getName(), oleg));
        storeDatas.add(new StoreData(peter.getName(), peter));
        storeDatas.add(new StoreData(tomas.getName(), tomas));
        storeDatas.add(new StoreData(stan.getName(), stan));

        // Filter Employees Aged 25-35 & Print with stream
        storeDatas.stream()
                .map(StoreData::getValue) // Extract Employee objects
                .filter(emp -> emp.getAge() >= 25 && emp.getAge() <= 35)
                .forEach(emp -> System.out.println(emp.getDetails()));

        // Filter Employees Aged 25-35 & Print with forEach loop
//        for(StoreData storeData: storeDatas) {
//            Employee employee = storeData.getValue();
//            if (employee.getAge() >= 25 && employee.getAge() <= 35) {
//                System.out.println(employee.getDetails());
//            }
//        }
    }
}
