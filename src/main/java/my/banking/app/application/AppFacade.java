package my.banking.app.application;

public class AppFacade {

    private static AppFacade instance;
    
    private CreditTransferService creditTransferService;
    private AccountManagementService accountManagementService;

    private AppFacade(){
        creditTransferService = new CreditTransferService();
        accountManagementService = new AccountManagementService();
    }

    public static AppFacade getInstance() {
        if (instance == null){
            instance = new AppFacade();
        }
        return instance;
    }

    public CreditTransferService getCreditTransferService() {
        return creditTransferService;
    }

    public AccountManagementService getAccountManagementService() {
        return accountManagementService;
    }
}
