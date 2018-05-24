package my.banking.app.domain;

public class CreditTransferRequest {

    private Account sendingAccount;
    private Account receivingAccount;
    private TransferDetails transferDetails;

    public CreditTransferRequest setSendingAccount(Account sendingAccount) {
        this.sendingAccount = sendingAccount;
        return this;
    }

    public CreditTransferRequest setReceivingAccount(Account receivingAccount) {
        this.receivingAccount = receivingAccount;
        return this;
    }

    public CreditTransferRequest setTransferDetails(TransferDetails transferDetails) {
        this.transferDetails = transferDetails;
        return this;
    }
}
