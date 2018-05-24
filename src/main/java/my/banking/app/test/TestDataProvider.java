package my.banking.app.test;

import java.util.HashMap;
import java.util.Map;

public interface TestDataProvider {

    default Map<String,String> getTestData(String dataMarker){
        System.out.println("Reading the data from CSV file.");
        return new HashMap<>();
    }
}
