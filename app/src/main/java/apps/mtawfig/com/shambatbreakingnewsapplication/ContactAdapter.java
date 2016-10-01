package apps.mtawfig.com.shambatbreakingnewsapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<ContactInfo> {



    private final List<ContactInfo> _contacts;

    private final Activity _context;



    public ContactAdapter(Activity context, List<ContactInfo> contacts)

    {

        super(context,R.layout.contact_list_item,contacts);

        this._contacts=contacts;

        this._context=context;

    }

    static class ViewHolder {

        protected TextView text;

        private ContactInfo  _contact;

        protected void setContact(ContactInfo contact)

        {

            text.setText(contact.getDisplayName());

            _contact=contact;

        }

        protected ContactInfo getContact() {return _contact;}

    }

    @Override

    public ContactInfo getItem(int position)

    {

        return _contacts.get(position);

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent)

    {

        View view=null;

        if(convertView==null)

        {

            LayoutInflater inflater=_context.getLayoutInflater();

            view=inflater.inflate(R.layout.contact_list_item, null);

            final ViewHolder viewHolder=new ViewHolder();

            viewHolder.text=(TextView)view.findViewById(R.id.txtDisplayName);

            viewHolder.setContact(_contacts.get(position));

            view.setTag(viewHolder);

        }



        return view;

    }

}