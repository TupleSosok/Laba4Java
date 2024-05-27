import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CSVReader {
    public static List<Employee> getListFromCSVFile(String filename) throws IOException {
        Reader reader = new BufferedReader(new FileReader("src/main/resources/" + filename));

        CsvToBean<Employee> csvReader = new CsvToBeanBuilder(reader)
                .withType(Employee.class)
                .withSeparator(';')
                .withIgnoreLeadingWhiteSpace(true)
                .withIgnoreEmptyLine(true)
                .build();

        return csvReader.parse();
    }
}