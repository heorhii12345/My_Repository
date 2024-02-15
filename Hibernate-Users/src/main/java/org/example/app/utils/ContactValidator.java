package org.example.app.utils;

import java.util.HashMap;
import java.util.Map;

public class ContactValidator {

    public Map<String, String> validateContactData(Map<String, String> data) {

        Map<String, String> errors = new HashMap<>();

        if (data.containsKey("id") & AppValidator.isIdValid(data.get("id")))
            errors.put("id", Constants.WRONG_ID_MSG);

        if (data.containsKey("first_name")) {
            if (data.get("first_name") != null & data.get("first_name").isEmpty())
                errors.put("first name", Constants.INPUT_REQ_MSG);
        }

        if (data.containsKey("last_name")) {
            if (data.get("last_name") != null & data.get("last_name").isEmpty())
                errors.put("last name", Constants.INPUT_REQ_MSG);
        }

        if (data.containsKey("phone") & AppValidator.isPhoneValid(data.get("phone")))
            errors.put("phone", Constants.WRONG_PHONE_MSG);

        if (data.containsKey("email") & AppValidator.isEmailValid(data.get("email")))
            errors.put("email", Constants.WRONG_EMAIL_MSG);

        return errors;
    }
}
