package br.com.escolaarcadia.listview_rowview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Martin on 24/08/2015.
 */
public class PersonalizadoListAdapter extends ArrayAdapter<String> {
    private Activity context = null;
    private String[] itemname = new String[0];
    private Integer[] imgid = new Integer[0];

    public PersonalizadoListAdapter(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.umalinha, itemname);

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }


    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.umalinha, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extratxt.setText("Descrição " + itemname[position]);
        return rowView;

    };
}
