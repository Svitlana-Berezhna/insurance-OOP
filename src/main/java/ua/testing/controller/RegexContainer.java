package ua.testing.controller;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}
