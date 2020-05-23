package ua.testing.model;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class InsuranceDerivativeTest {

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Test
    public void checkingAddInsuranceInDerivativeWhenInsuranceNotEqualsToNull() {
        TravelInsurance travelInsurance = new TravelInsurance();
        travelInsurance.setDefaults();

        InsuranceDerivative insuranceDerivative = new InsuranceDerivative();
        insuranceDerivative.addInsuranceInDerivative(new InsuranceInDerivative(Insurer.ORANTA, 5, travelInsurance));

        assertEquals(1, insuranceDerivative.getInsuranceInDerivative().size());
    }

    @Test
    public void checkingAddInsuranceInDerivativeWhenInsuranceEqualsToNull() throws Exception {
        InsuranceDerivative insuranceDerivative = new InsuranceDerivative();
        exp.expect(IllegalArgumentException.class);
        insuranceDerivative.addInsuranceInDerivative(null);
    }

    @Test
    public void checkingInsuranceDerivativeCost() {
        TravelInsurance travelInsurance = new TravelInsurance();
        travelInsurance.setDefaults();
        travelInsurance.setInsuranceAmount(1000);

        TravelInsurance travelInsurance1 = new TravelInsurance();
        travelInsurance1.setDefaults();
        travelInsurance1.setInsuranceAmount(2000);

        InsuranceDerivative insuranceDerivative = new InsuranceDerivative();
        insuranceDerivative.addInsuranceInDerivative(new InsuranceInDerivative(Insurer.ORANTA, 5, travelInsurance));
        insuranceDerivative.addInsuranceInDerivative(new InsuranceInDerivative(Insurer.ASKA, 10, travelInsurance1));

        assertEquals(25000, insuranceDerivative.getInsuranceDerivativeCost());
    }

    @Test
    public void checkingSortInsurancesByRiskDesc() {
        TravelInsurance travelInsurance = new TravelInsurance();
        travelInsurance.setDefaults();
        travelInsurance.setInsuranceRisk(0.3f);

        TravelInsurance travelInsurance1 = new TravelInsurance();
        travelInsurance1.setDefaults();
        travelInsurance1.setInsuranceRisk(0.2f);

        InsuranceDerivative insuranceDerivative = new InsuranceDerivative();
        insuranceDerivative.addInsuranceInDerivative(new InsuranceInDerivative(Insurer.ORANTA, 5, travelInsurance));
        insuranceDerivative.addInsuranceInDerivative(new InsuranceInDerivative(Insurer.ASKA, 10, travelInsurance1));

        insuranceDerivative.sortInsurancesByRiskDesc();

        boolean sortedInsurancesByRiskDesc = true;
        float maxInsurancesRisk = Float.MAX_VALUE;
        for (InsuranceInDerivative row : insuranceDerivative.getInsuranceInDerivative()) {
            if (row.getInsurance().getInsuranceRisk() > maxInsurancesRisk) {
                sortedInsurancesByRiskDesc = false;
                break;
            }
            maxInsurancesRisk = row.getInsurance().getInsuranceRisk();
        }
        assertTrue(sortedInsurancesByRiskDesc);
    }
}
