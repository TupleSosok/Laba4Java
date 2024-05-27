import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CSVReader<Employee> reader = new CSVReader<Employee>();
        List<Employee> employees = reader.getListFromCSVFile("foreign_names.csv", Employee.class);
        for(Employee i : employees){
            System.out.println(i.toString());
        }
    }
}
