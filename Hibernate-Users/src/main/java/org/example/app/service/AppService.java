package org.example.app.service;

import org.example.app.controller.ContactController;
import org.example.app.exceptions.OptionException;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.view.*;

public class AppService {

    ContactController controller = new ContactController();

    public void filterChoice(int choice) {
        switch (choice) {
            case 1 -> controller.createContact();
            case 2 -> controller.readContacts();
            case 3 -> controller.updateContact();
            case 4 -> controller.deleteContact();
            case 5 -> controller.readContactById();
            case 0 -> new AppView().getOutput(Integer.toString(choice));
            default -> {
                try {
                    throw new OptionException(Constants.INCORRECT_OPTION_MSG);
                } catch (OptionException e) {
                    new AppView().getOutput(e.getMessage());
                    AppStarter.startApp();
                }
            }
        }
    }
}
