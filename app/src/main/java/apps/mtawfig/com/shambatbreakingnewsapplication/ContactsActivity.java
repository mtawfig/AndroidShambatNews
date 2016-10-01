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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);


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
