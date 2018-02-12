package fauzi.hilmy.quizsimplenavbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityList extends AppCompatActivity {
    String[] menuItem = {
            "Hilmy Fauzi", "hilmy2602@gmail.com", "hill.fauzi", "muhammadhilmyfauzi", "Hilmy Fauzi", "hilmyfauzi26.wordpress.com", "Fauzee26"
    };

    Integer[] menuImage = {
            R.drawable.plus, R.drawable.gmail, R.drawable.instagram, R.drawable.line, R.drawable.linkedin, R.drawable.wordpress, R.drawable.github
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        SosmedAdapter adapter = new SosmedAdapter(this, menuItem, menuImage);
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "You Clicked " + menuItem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
