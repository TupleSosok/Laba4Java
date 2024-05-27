import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.io.File.separator;

public class Main {

    public static List<Employee> getListFromCSVFile(String filename) throws IOException {

        InputStream in = Main.class.getClassLoader().getResourceAsStream("src/main/resources/" + filename);
        CSVReader reader = new CSVReader(new InputStreamReader(in));
        CsvToBean<Employee> csvToBean = new CsvToBeanBuilder(reader)
                .withSkipLines(1)
                .withSeparator(';')
                .withType(Employee.class)
                .build();
        return csvToBean.parse();
    }
    public static void main(String[] args) throws IOException {
        List<Employee> employees = getListFromCSVFile("foreign_names.csv");
        for(Employee i : employees){
            System.out.println(i.toString());
        }

    }
}
