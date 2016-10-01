package apps.mtawfig.com.shambatbreakingnewsapplication;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Mostafa on 29/09/2016.
 */
public class ContactInfo {
    //public String name;
    //public String mobile;
    //public boolean isSentTo;

    private String _id;
    private String _displayName;

    public String getId(){return _id;}
    public String getDisplayName(){return _displayName;}
    public void setId(String id){_id=id;}
    public void setDisplayName(String displayName){_displayName=displayName;}
}
