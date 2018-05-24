package my.banking.app.test;

public class TestFacade {

    private static TestFacade instance;
    private TestDataProvider testDataProvider;

    private TestFacade(){}

    public static TestFacade getInstance() {
        if (instance == null){
            instance = new TestFacade();
        }
        return instance;
    }

    public TestDataProvider getTestDataProvider() {
        return testDataProvider;
    }
}
