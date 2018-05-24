package my.bank.app;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.banking.app.application.AppFacade;
import my.banking.app.data.InstanceGenerator;
import my.banking.app.domain.Account;
import my.banking.app.domain.CreditTransferRequest;
import my.banking.app.domain.CreditTransferResponse;
import my.banking.app.domain.TransferDetails;
import org.junit.Assert;

import static my.banking.app.domain.TransferSubmissionStatus.SUBMITTED_FOR_APPROVAL;

public class CreditTransferUsingModelStepDefs {

    private CreditTransferResponse creditTransferResponse;

    @Given("^(.*) bank has an (active|inactive) account with number (\\d+)$")
    public void bank_has_an_account_with_number(String bankName, String accountStatus, int accountNumber) {
        AppFacade.getInstance()
                .getAccountManagementService()
                .ensureAccount(bankName, accountNumber, accountStatus);
    }

    @When("^John initiates a credit transfer from account (\\d+) to account (\\d+)$")
    public void user_initiates_a_credit_transfer_from_account_to_account(int debitAccount, int creditAccount) {

        Account sending = InstanceGenerator.of(Account.class)
                .setAccountNumber(debitAccount);

        Account receiving = InstanceGenerator.of(Account.class)
                .setAccountNumber(creditAccount);

        TransferDetails transferDetails = InstanceGenerator.of(TransferDetails.class);

        CreditTransferRequest creditTransferRequest = InstanceGenerator.of(CreditTransferRequest.class)
                .setSendingAccount(sending)
                .setReceivingAccount(receiving)
                .setTransferDetails(transferDetails);

        creditTransferResponse = AppFacade.getInstance()
                .getCreditTransferService().submitTransfer(creditTransferRequest);

    }

    @Then("^credit transfer is submitted for approval$")
    public void credit_transfer_is_submitted_for_approval() {
        Assert.assertEquals("Incorrect credit transfer submission state.",
                SUBMITTED_FOR_APPROVAL, creditTransferResponse.getSubmissionStatus());
    }
}
