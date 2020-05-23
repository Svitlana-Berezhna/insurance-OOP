package ua.testing.controller;

import ua.testing.model.*;
import ua.testing.view.View;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class Controller {
    private Model model;
    private View view;

    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));
//                    new Locale("en"));

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        TravelInsurance travelInsurance = new TravelInsurance();
        travelInsurance.changeDefaults(Insurer.ORANTA, 5, 55, 555, 5, "02.12.20", "02.06.21", 5, 5,
                true, true, true, true);
        travelInsurance.setDefaults();

        TravelInsurance travelInsurance1 = new TravelInsurance();
        travelInsurance1.setDefaults();
        travelInsurance1.setInsuranceAmount(100L);
        travelInsurance1.setInsuranceRisk(1000L);

        TravelInsurance travelInsurance2 = new TravelInsurance();
        travelInsurance2.setDefaults();

        InsuranceDerivative insuranceDerivative = new InsuranceDerivative();
        InsuranceInDerivative insuranceInDerivative = new InsuranceInDerivative(Insurer.ORANTA, 5, travelInsurance);
        insuranceDerivative.addInsuranceInDerivative(insuranceInDerivative);

        InsuranceInDerivative insuranceInDerivative1 = new InsuranceInDerivative(Insurer.ASKA, 55, travelInsurance1);
        insuranceDerivative.addInsuranceInDerivative(insuranceInDerivative1);

        InsuranceInDerivative insuranceInDerivative2 = new InsuranceInDerivative(Insurer.ASKA, 55, travelInsurance1);
        insuranceDerivative.addInsuranceInDerivative(insuranceInDerivative2);

        view.printMessage(bundle.getString("insurance.risk.desc.sorting"));
        insuranceDerivative.sortInsurancesByRiskDesc();
        for (InsuranceInDerivative row : insuranceDerivative.getInsuranceInDerivative()) {
            view.printMessage("" + row.getInsurance());
        }

        view.printMessage(bundle.getString("insurance.risk.searching"));
        ArrayList<Insurance> searchedInsurancesInDerivativeArrayList =
                insuranceDerivative.searchInsurancesInDerivativeByRisk(1000f, 1111f);
        for (Insurance insurance : searchedInsurancesInDerivativeArrayList) {
            view.printMessage("" + insurance);
        }
        searchedInsurancesInDerivativeArrayList.clear();

        view.printMessage(bundle.getString("insurance.amount.searching"));
        searchedInsurancesInDerivativeArrayList =
                insuranceDerivative.searchInsurancesInDerivativeByAmount(5L, 99L);
        for (Insurance insurance : searchedInsurancesInDerivativeArrayList) {
            view.printMessage("" + insurance);
        }
    }
}
