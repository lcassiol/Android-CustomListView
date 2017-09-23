package com.example.lcassiol.androidcustomlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by lcass on 9/23/2017.
 */

public class CustomListViewAdapter extends ArrayAdapter{

    public CustomListViewAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }


    @Override
    public void add(@Nullable Object object) {
        super.add(object);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;

        row = convertView;
        DataHandler handler;

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_view_cel, parent, false);
            handler = new DataHandler();
            handler.imagePerson = (ImageView) row.findViewById(R.id.profile_photo);
            handler.personName = (TextView) row.findViewById(R.id.person_name);
            handler.personDesc = (TextView) row.findViewById(R.id.person_description);
            row.setTag(handler);
        }else{
            handler = (DataHandler) row.getTag();
        }

        DataProvider dataProvider;
        dataProvider = (DataProvider) this.getItem(position);
        handler.imagePerson.setImageResource(dataProvider.getIcon());
        handler.personName.setText(dataProvider.getName());
        handler.personDesc.setText(dataProvider.getDescription());


        return row;
    }

    private class DataHandler{
        ImageView imagePerson;
        TextView personName;
        TextView personDesc;
    }
}
