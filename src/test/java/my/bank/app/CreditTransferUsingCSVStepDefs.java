package my.bank.app;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my.banking.app.application.AppFacade;
import my.banking.app.domain.CreditTransferResponse;
import my.banking.app.test.TestFacade;
import org.junit.Assert;

import java.util.Map;

import static my.banking.app.domain.TransferSubmissionStatus.SUBMITTED_FOR_APPROVAL;

public class CreditTransferUsingCSVStepDefs {

    private CreditTransferResponse creditTransferResponse;

    @Given("^(.*) bank has an (active|inactive) account with number (\\d+)$")
    public void bank_has_an_account_with_number(String bankName, String accountStatus, int accountNumber) {
        AppFacade.getInstance()
                .getAccountManagementService()
                .ensureAccount(bankName, accountNumber, accountStatus);
    }

    @When("^John initiates a credit transfer with details (.*)$")
    public void user_initiates_a_credit_transfer_with_details(String dataMarker) {

        Map<String, String> dataMap = TestFacade.getInstance().getTestDataProvider().getTestData(dataMarker);

        // to the interaction...

    }

    @Then("^credit transfer is submitted for approval$")
    public void credit_transfer_is_submitted_for_approval() {
        Assert.assertEquals("Incorrect credit transfer submission state.",
                SUBMITTED_FOR_APPROVAL, creditTransferResponse.getSubmissionStatus());
    }
}
