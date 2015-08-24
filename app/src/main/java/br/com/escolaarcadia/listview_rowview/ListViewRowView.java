package br.com.escolaarcadia.listview_rowview;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewRowView extends Activity {
    /*
    http://cdn3.lendo.org/wp-content/uploads/2009/01/joao-e-maria.jpg
    https://conversademenina.files.wordpress.com/2010/04/alice-no-pais-das-maravilhas07.jpg?w=640
    http://images.popmatters.com/film_art/r/robinhood-s3-splsh.jpg
    http://usuarioweb.infonet.com.br/~LAMPIAO/images/lampiaoD.jpg
    http://cinema10.com.br/upload/filmes/filmes_1118_Gato-de-Botas-15.jpg
    http://www.comregras.com/wp-content/uploads/2015/05/o-patinho-feio-e1431468612148.jpg
    http://cartoonsimages.com/sites/default/files/field/image/donald-2_79466a.jpg
    https://upload.wikimedia.org/wikipedia/pt/f/f1/Scrooge_McDuck.jpg
     */
    ListView list;

    String[] listanomes = {
            "João",
            "Maria",
            "Alice",
            "Robin",
            "Lampião",
            "Gato de Botas",
            "Patinho Feio",
            "Donald",
            "Tio Patinhas"
    };

    Integer[] imgid = {
            R.drawable.joaomaria,
            R.drawable.joaomaria,
            R.drawable.alice,
            R.drawable.robinhood,
            R.drawable.lampiao,
            R.drawable.gatodebotas,
            R.drawable.patinhofeio,
            R.drawable.donald,
            R.drawable.patinhas
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_row_view);

        PersonalizadoListAdapter adapter=new PersonalizadoListAdapter(this, listanomes, imgid);
        list = (ListView) findViewById(R.id.ListViewNome);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Slecteditem = listanomes[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
