package ua.testing.model;

import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class TravelInsurance extends Insurance {
    private String startDate;
    private String endDate;
    private long deductible;
    private int numberOfPersons;
    private boolean travel;
    private boolean sport;
    private boolean activeRest;
    private boolean employment;

    public TravelInsurance() {
    }

    public TravelInsurance(Insurer insurer, long insuranceAmount, float insuranceRisk, long insurancePayment,
                           int durationOfContract, String startDate, String endDate, long deductible, int numberOfPersons,
                           boolean travel, boolean sport, boolean activeRest, boolean employment) {
        super(insuranceAmount, insuranceRisk, insurancePayment, durationOfContract);
        this.startDate = startDate;
        this.endDate = endDate;
        this.deductible = deductible;
        this.numberOfPersons = numberOfPersons;
        this.travel = travel;
        this.sport = sport;
        this.activeRest = activeRest;
        this.employment = employment;
    }

    public void changeDefaults(Insurer insurer, long insuranceAmount, float insuranceRisk, long insurancePayment,
                               int durationOfContract, String startDate, String endDate, long deductible,
                               int numberOfPersons, boolean travel, boolean sport, boolean activeRest, boolean employment) {
        TravelInsurance travelInsuranceDefaults = new TravelInsurance(insurer, insuranceAmount, insuranceRisk,
                insurancePayment, durationOfContract, startDate, endDate, deductible, numberOfPersons, travel, sport,
                activeRest, employment);
        try {
            FileOutputStream fos = new FileOutputStream(new File("./travelInsuranceDefaults.xml"));
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(travelInsuranceDefaults);
            encoder.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setDefaults() {
        try {
            FileInputStream fis = new FileInputStream(new File("./travelInsuranceDefaults.xml"));
            XMLDecoder decoder = new XMLDecoder(fis);
            TravelInsurance travelInsuranceDefaults = (TravelInsurance) decoder.readObject();

            this.setInsuranceAmount(travelInsuranceDefaults.getInsuranceAmount());
            this.setInsuranceRisk(travelInsuranceDefaults.getInsuranceRisk());
            this.setInsurancePayment(travelInsuranceDefaults.getInsurancePayment());
            this.setDurationOfContract(travelInsuranceDefaults.getDurationOfContract());
            this.setStartDate(travelInsuranceDefaults.getStartDate());
            this.setEndDate(travelInsuranceDefaults.getEndDate());
            this.setDeductible(travelInsuranceDefaults.getDeductible());
            this.setNumberOfPersons(travelInsuranceDefaults.getNumberOfPersons());
            this.setTravel(travelInsuranceDefaults.isTravel());
            this.setSport(travelInsuranceDefaults.isSport());
            this.setActiveRest(travelInsuranceDefaults.isActiveRest());
            this.setEmployment(travelInsuranceDefaults.isEmployment());

            decoder.close();
            fis.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public long getDeductible() {
        return deductible;
    }

    public void setDeductible(long deductible) {
        this.deductible = deductible;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public boolean isTravel() {
        return travel;
    }

    public void setTravel(boolean travel) {
        this.travel = travel;
    }

    public boolean isSport() {
        return sport;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public boolean isActiveRest() {
        return activeRest;
    }

    public void setActiveRest(boolean activeRest) {
        this.activeRest = activeRest;
    }

    public boolean isEmployment() {
        return employment;
    }

    public void setEmployment(boolean employment) {
        this.employment = employment;
    }
}
