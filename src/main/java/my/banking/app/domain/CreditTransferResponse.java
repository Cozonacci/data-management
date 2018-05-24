package my.banking.app.domain;

public class CreditTransferResponse {

    private TransferSubmissionStatus submissionStatus;

    public TransferSubmissionStatus getSubmissionStatus() {
        return submissionStatus;
    }

    public CreditTransferResponse setSubmissionStatus(TransferSubmissionStatus submissionStatus) {
        this.submissionStatus = submissionStatus;
        return this;
    }
}
