package ua.testing;

import ua.testing.controller.Controller;
import ua.testing.model.*;
import ua.testing.view.View;

/**
 * <h1>Task 11 - Insurance (OOP)</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-20
 */
public class Main {
    public static void main(String[] args) {
        Controller controller =
                new Controller(new Model(), new View());
        controller.processUser();
    }
}
