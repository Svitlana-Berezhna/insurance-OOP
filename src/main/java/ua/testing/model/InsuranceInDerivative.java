package ua.testing.model;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class InsuranceInDerivative {
    private static int count = 0;
    private int id;
    private Insurer insurer;
    private int quantity;
    private Insurance insurance;

    public InsuranceInDerivative(Insurer insurer, int quantity, Insurance insurance) {
        this.id = ++count;
        this.insurer = insurer;
        this.quantity = quantity;
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", insurer=" + insurer +
                ", quantity=" + quantity +
                ", insurance=" + insurance.getClass().getSimpleName() +
                '}';
    }

    public Insurer getInsurer() {
        return insurer;
    }

    public void setInsurer(Insurer insurer) {
        this.insurer = insurer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public int getId() {
        return id;
    }
}
