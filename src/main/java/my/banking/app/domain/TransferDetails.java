package my.banking.app.domain;

import java.time.LocalDate;

public class TransferDetails {

    private Boolean previousYearFlag;
    private Boolean currentYearFlag;
    private LocalDate applicationDate;
    private LocalDate effectiveDate;
    private TransferType transferType;

    public Boolean getPreviousYearFlag() {
        return previousYearFlag;
    }

    public void setPreviousYearFlag(Boolean previousYearFlag) {
        this.previousYearFlag = previousYearFlag;
    }

    public Boolean getCurrentYearFlag() {
        return currentYearFlag;
    }

    public void setCurrentYearFlag(Boolean currentYearFlag) {
        this.currentYearFlag = currentYearFlag;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    @Override
    public String toString() {
        return "TransferDetails{" +
                "previousYearFlag=" + previousYearFlag +
                ", currentYearFlag=" + currentYearFlag +
                ", applicationDate=" + applicationDate +
                ", effectiveDate=" + effectiveDate +
                ", transferType=" + transferType +
                '}';
    }
}
