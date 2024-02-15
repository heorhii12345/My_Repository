package org.example.app.controller;

import org.example.app.service.ContactService;
import org.example.app.utils.AppStarter;
import org.example.app.view.*;

public class ContactController {

    ContactService service = new ContactService();

    public void createContact() {
        ContactCreateView createView = new ContactCreateView();
        createView.getOutput(service.createContact(createView.getData()));
        AppStarter.startApp();
    }

    public void readContacts() {
        ContactReadView readView = new ContactReadView();
        readView.getOutput(service.readContacts());
        AppStarter.startApp();
    }

    public void updateContact() {
        ContactUpdateView updateView = new ContactUpdateView();
        updateView.getOutput(service.updateContact(updateView.getData()));
        AppStarter.startApp();
    }

    public void deleteContact() {
        ContactDeleteView deleteView = new ContactDeleteView();
        deleteView.getOutput(service.deleteContact(deleteView.getData()));
        AppStarter.startApp();
    }

    public void readContactById() {
        ContactReadByIdView readByIdView = new ContactReadByIdView();
        readByIdView.getOutput(service.readContactById(readByIdView.getData()));
        AppStarter.startApp();
    }
}
