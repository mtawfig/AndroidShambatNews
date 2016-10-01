package apps.mtawfig.com.shambatbreakingnewsapplication;

import android.app.ListActivity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ContactsActivity extends AppCompatActivity {

    String phoneNumber;
    ListView lv;
    ArrayList<String> contacts = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ContactList contactList=this.getContacts();
        ArrayAdapter<ContactInfo> adapter=new ContactAdapter(this, contactList.getContacts());

        new ListActivity().setListAdapter(adapter);
    }

    private ContactList getContacts()
    {
        ContactList contactList=new ContactList();
        Uri uri=ContactsContract.Contacts.CONTENT_URI;
        ContentResolver cr=getContentResolver();
        String sortOrder = ContactsContract.Contacts.DISPLAY_NAME + " COLLATE LOCALIZED ASC";
        Cursor cur=cr.query(uri, null, null, null, sortOrder);
        if(cur.getCount()>0)
        {
            String id;
            String name;
            while(cur.moveToNext())
            {
                ContactInfo c =new ContactInfo();
                id = cur.getString(cur.getColumnIndex(ContactsContract.Contacts._ID));
                name=cur.getString(cur.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                c.setId(id);
                c.setDisplayName(name);
                contactList.addContact(c);
            }
        }
        cur.close();
        return contactList;
    }

    public void backButtonClick(View view) {
        onBackPressed();
    }

    public void uploadContacts(View view) {
        /*try {
            Firebase.setAndroidContext(this);
            Firebase ref = new Firebase(Config.FIREBASE_URL);
            FirebaseApp app = ref.getApp();
            app.goOnline();
            Toast.makeText(this.getApplicationContext(), "Application " + app.toString(), Toast.LENGTH_LONG).show();
            Firebase postRef = ref.child("contacts");
            Map<String, String> contact1 = new HashMap<>();
            contact1.put("name", "Mosafa Towfig");
            contact1.put("number", "0912557767");
            postRef.push().setValue(contact1);
            Map<String, String> contact2 = new HashMap<String, String>();
            contact2.put("name", "Mohammed Abdelfattah");
            contact2.put("number", "0923439426");
            postRef.push().setValue(contact2);


            Toast.makeText(this.getApplicationContext(), "Contacts uploaded", Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(this.getApplicationContext(), ex.toString(), Toast.LENGTH_LONG).show();
        }*/
    }

}
