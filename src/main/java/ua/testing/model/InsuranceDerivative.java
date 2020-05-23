package ua.testing.model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class InsuranceDerivative {
    private static int count = 0;
    private int id;
    private ArrayList<InsuranceInDerivative> insuranceInDerivative;

    public InsuranceDerivative() {
        this.id = ++count;
    }

    public void addInsuranceInDerivative(InsuranceInDerivative newInsuranceInDerivative) {
        if (newInsuranceInDerivative == null) {
            throw new IllegalArgumentException("Argument of insurance in derivative is null.");
        }
        if (insuranceInDerivative == null) {
            insuranceInDerivative = new ArrayList<InsuranceInDerivative>();
        }
        insuranceInDerivative.add(newInsuranceInDerivative);
    }

    public boolean removeInsuranceInDerivative(int InsuranceInDerivativeId) {
        InsuranceInDerivative removedInsuranceInDerivative = searchInsuranceInDerivativeById(InsuranceInDerivativeId);
        if (removedInsuranceInDerivative == null) {
            return false;
        } else {
            insuranceInDerivative.remove(removedInsuranceInDerivative);
            return true;
        }
    }

    private InsuranceInDerivative searchInsuranceInDerivativeById(int insuranceInDerivativeId) {
        InsuranceInDerivative searchedInsuranceInDerivative = null;
        for (InsuranceInDerivative searchInsuranceInDerivative : insuranceInDerivative) {
            if (insuranceInDerivativeId == searchInsuranceInDerivative.getId()) {
                searchedInsuranceInDerivative = searchInsuranceInDerivative;
            }
        }
        return searchedInsuranceInDerivative;
    }

    public long getInsuranceDerivativeCost() {
        long insuranceDerivativeCost = 0L;
        for (InsuranceInDerivative row : insuranceInDerivative) {
            insuranceDerivativeCost += row.getQuantity() * row.getInsurance().getInsuranceAmount();
        }
        return insuranceDerivativeCost;
    }

    public void sortInsurancesByRiskDesc() {
        Collections.sort(insuranceInDerivative, new InsuranceRiskDescComparator());
    }

    /**
     * <p>Searches insurances in derivative by risk
     * between nsuranceInDerivativeRiskMin and insuranceInDerivativeRiskMax inclusive.</p>
     *
     * @param insuranceInDerivativeRiskMin Minimum value of insurance risk in the derivative (inclusive)
     * @param insuranceInDerivativeRiskMax Maximum value of insurance risk in the derivative (inclusive)
     * @return searchedInsurancesInDerivativeArrayList Array list of insurances with risk
     * between nsuranceInDerivativeRiskMin and insuranceInDerivativeRiskMax inclusive
     */
    public ArrayList<Insurance> searchInsurancesInDerivativeByRisk(Float insuranceInDerivativeRiskMin,
                                                                   Float insuranceInDerivativeRiskMax) {
        ArrayList<Insurance> searchedInsurancesInDerivativeArrayList = new ArrayList<Insurance>();
        if (insuranceInDerivativeRiskMin == null) {
            insuranceInDerivativeRiskMin = Float.MIN_VALUE;
        }
        if (insuranceInDerivativeRiskMax == null) {
            insuranceInDerivativeRiskMax = Float.MAX_VALUE;
        }
        for (InsuranceInDerivative searchInsuranceInDerivative : insuranceInDerivative) {
            if (searchInsuranceInDerivative.getInsurance().getInsuranceRisk() >= insuranceInDerivativeRiskMin &&
                    searchInsuranceInDerivative.getInsurance().getInsuranceRisk() <= insuranceInDerivativeRiskMax) {
                searchedInsurancesInDerivativeArrayList.add((Insurance) searchInsuranceInDerivative.getInsurance());
            }
        }
        return searchedInsurancesInDerivativeArrayList;
    }

    public ArrayList<Insurance> searchInsurancesInDerivativeByAmount(Long insuranceInDerivativeAmountMin,
                                                                     Long insuranceInDerivativeAmountMaX) {
        ArrayList<Insurance> searchedInsurancesInDerivativeArrayList = new ArrayList<Insurance>();
        if (insuranceInDerivativeAmountMin == null) {
            insuranceInDerivativeAmountMin = Long.MIN_VALUE;
        }
        if (insuranceInDerivativeAmountMaX == null) {
            insuranceInDerivativeAmountMaX = Long.MAX_VALUE;
        }
        for (InsuranceInDerivative searchInsuranceInDerivative : insuranceInDerivative) {
            if (searchInsuranceInDerivative.getInsurance().getInsuranceAmount() >= insuranceInDerivativeAmountMin &&
                    searchInsuranceInDerivative.getInsurance().getInsuranceAmount() <= insuranceInDerivativeAmountMaX) {
                searchedInsurancesInDerivativeArrayList.add(searchInsuranceInDerivative.getInsurance());
            }
        }
        return searchedInsurancesInDerivativeArrayList;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", insuranceInDerivative=" + insuranceInDerivative.getClass().getSimpleName() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setInsuranceInDerivative(ArrayList<InsuranceInDerivative> insuranceInDerivative) {
        this.insuranceInDerivative = insuranceInDerivative;
    }

    public ArrayList<InsuranceInDerivative> getInsuranceInDerivative() {
        return insuranceInDerivative;
    }
}
