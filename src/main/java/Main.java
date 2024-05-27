import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> employees = CSVReader.getListFromCSVFile("foreign_names.csv");
        for(Employee i : employees){
            System.out.println(i.toString());
        }
    }
}
