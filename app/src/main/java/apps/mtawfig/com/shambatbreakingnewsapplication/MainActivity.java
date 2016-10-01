package apps.mtawfig.com.shambatbreakingnewsapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase db = openOrCreateDatabase("shmbat_news",MODE_PRIVATE,null);


    }

    public void gotoSyncContactsActivity(View view)
    {
        startActivity(new Intent(MainActivity.this, ContactsActivity.class));
    }

    public void gotoSmsActivity(View view)
    {
        startActivity(new Intent(MainActivity.this, SmsActivity.class));
    }
}
