package apps.mtawfig.com.shambatbreakingnewsapplication;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
	private List<ContactInfo> _contacts=new ArrayList<ContactInfo>();
	public List<ContactInfo> getContacts(){return _contacts;}
	
	public void addContact(ContactInfo contact){ this._contacts.add(contact);}
	
}
