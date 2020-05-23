package ua.testing.model;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public enum Insurer {
    ORANTA("Oranta NASK", "Kiev, st. Zdolbunovskaya, 7D", "Kiev, st. Zdolbunovskaya, 7D",
            "+38 (044) 537-58-00", "+38 (044) 537-58-83", "", "",
            "", ""),
    UKRAINIAN_INSURANCE_GROUP("Ukrainian Insurance Group (UIG)", "03038, Kiev, st. Fedorova, 32-A",
            "03038, Kiev, st. Fedorova, 32-A", "(044) 503-99-95", "(044) 503-99-97",
            "", "", "", ""),
    ASKA("ASKA", "03186, Kiev, st. Antonova, 5", "03186, Kiev, st. Antonova, 5",
            "(044) 455-99-70, 455-99-79", "(044) 455-99-70, 455-99-79", "",
            "", "", ""),
    TAS("TAS, insurance group", "03062, Kiev, Peremohy ave., 65",
            "03062, Kiev, Peremohy ave., 65", "(044) 536-00-20", "(044) 536-00-21",
            "", "", "", ""),
    INGO_UKRAINE("INGO Ukraine", "Kiev, st. Bulvarno-Kudriavska, 33",
            "Kiev, st. Bulvarno-Kudriavska, 33", "+38 044 490-27-44", "+38 044 490-27-48",
            "", "", "", ""),
    EXPRESS_INSURANCE("Express Insurance", "01004, Kiev, Ukraine, st. Krasnoarmeyskaya 15/2",
            "01004, Kiev, Ukraine, st. Krasnoarmeyskaya 15/2", "+38 (044) 594-87-00",
            "+38 (044) 594-87-02", "", "", "", ""),
    GLOBUS("Globus", "88000, Uzhhorod, st. Sobranetskaya, 60",
            "01010 Kiev, Andrey Ivanov St., 21/17-1", "+3 8 (0312) 61 54 34, +38 (044) 280 31 20",
            "", "", "", "", ""),
    ARSENAL_INSURANCE("Arsenal Insurance", "03056, Kiev, st. Borshchagovskaya, 154",
            "03056, Kiev, st. Borshchagovskaya, 154", "+38 (044) 502-67-37",
            "+38 (044) 502-67-37", "", "", "", "");

    Insurer(String name, String legalAddress, String mailingAddress, String phone, String fax, String individualTaxNumber,
            String paymentBankAccount, String bank, String BIC) {
        this.name = name;
        this.legalAddress = legalAddress;
        this.mailingAddress = mailingAddress;
        this.phone = phone;
        this.fax = fax;
        this.individualTaxNumber = individualTaxNumber;
        this.paymentBankAccount = paymentBankAccount;
        this.bank = bank;
        this.BIC = BIC;
    }

    private final String name;
    private final String legalAddress;
    private final String mailingAddress;
    private final String phone;
    private final String fax;
    private final String individualTaxNumber;
    private final String paymentBankAccount;
    private final String bank;
    private final String BIC;
}
