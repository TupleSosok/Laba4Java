import lombok.Data;

import java.util.Date;

@Data
public class Employee {

    Long id;

    String name;

    String male;

    Date birthdate;

    String division;

    int salary;
}
