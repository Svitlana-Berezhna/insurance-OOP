package ua.testing.model;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public abstract class Insurance {
    private long insuranceAmount;
    private float insuranceRisk;
    private long insurancePayment;
    private int durationOfContract;

    public Insurance() {
    }

    public Insurance(long insuranceAmount, float insuranceRisk, long insurancePayment, int durationOfContract) {
        this.insuranceAmount = insuranceAmount;
        this.insuranceRisk = insuranceRisk;
        this.insurancePayment = insurancePayment;
        this.durationOfContract = durationOfContract;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "insuranceAmount=" + insuranceAmount +
                ", insuranceRisk=" + insuranceRisk +
                ", insurancePayment=" + insurancePayment +
                ", durationOfContract=" + durationOfContract +
                '}';
    }

    public long getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(long insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public float getInsuranceRisk() {
        return insuranceRisk;
    }

    public void setInsuranceRisk(float insuranceRisk) {
        this.insuranceRisk = insuranceRisk;
    }

    public long getInsurancePayment() {
        return insurancePayment;
    }

    public void setInsurancePayment(long insurancePayment) {
        this.insurancePayment = insurancePayment;
    }

    public int getDurationOfContract() {
        return durationOfContract;
    }

    public void setDurationOfContract(int durationOfContract) {
        this.durationOfContract = durationOfContract;
    }
}
