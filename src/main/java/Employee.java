import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.Data;

import java.util.Date;

@Data
public class Employee {

    @CsvBindByName(column = "id")
    Long id;

    @CsvBindByName(column = "name")
    String name;

    @CsvBindByName(column = "gender")
    String male;

    @CsvBindByName(column = "BirtDate")
    @CsvDate("dd.MM.yyyy")
    Date birthdate;

    @CsvBindByName(column = "Division")
    String division;

    @CsvBindByName(column = "Salary")
    int salary;
}
