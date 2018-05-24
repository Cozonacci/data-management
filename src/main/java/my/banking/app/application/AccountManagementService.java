package my.banking.app.application;

public interface AccountManagementService {

    default void ensureAccount(String bankName, int accountNumber, String accountStatus) {
        System.out.println(String.format("Account [%s] for [%s] bank - assured.", accountNumber, bankName));
    }
}
