package my.banking.app.domain;

public class Account {

    private int accountNumber;
    private String sortCode;

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public String getSortCode() {
        return sortCode;
    }

    public Account setSortCode(String sortCode) {
        this.sortCode = sortCode;
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", sortCode='" + sortCode + '\'' +
                '}';
    }
}
