package ua.testing.model;

import java.util.Comparator;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
class InsuranceRiskDescComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        InsuranceInDerivative insuranceInDerivative1 = (InsuranceInDerivative) obj1;
        InsuranceInDerivative insuranceInDerivative2 = (InsuranceInDerivative) obj2;
        if (insuranceInDerivative1.getInsurance().getInsuranceRisk() >
                insuranceInDerivative2.getInsurance().getInsuranceRisk())
            return -1;
        if (insuranceInDerivative1.getInsurance().getInsuranceRisk() <
                insuranceInDerivative2.getInsurance().getInsuranceRisk())
            return 1;
        return 0;
    }
}
