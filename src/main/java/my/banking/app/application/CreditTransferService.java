package my.banking.app.application;

import my.banking.app.domain.CreditTransferRequest;
import my.banking.app.domain.CreditTransferResponse;
import my.banking.app.domain.TransferSubmissionStatus;

public interface CreditTransferService {

    default CreditTransferResponse submitTransfer(CreditTransferRequest creditTransferRequest) {
        // long processing around creditTransferRequest...
        return new CreditTransferResponse()
                .setSubmissionStatus(TransferSubmissionStatus.SUBMITTED_FOR_APPROVAL);
    }
}
