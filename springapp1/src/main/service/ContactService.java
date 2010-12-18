package main.service;

import java.util.List;

import main.form.Contact;

public interface ContactService {
	public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}
