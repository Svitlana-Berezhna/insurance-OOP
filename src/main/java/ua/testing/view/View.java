package ua.testing.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static ua.testing.view.TextConstant.INPUT_STRING_DATA;
import static ua.testing.view.TextConstant.WRONG_INPUT_DATA;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));
//                    new Locale("en"));

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
