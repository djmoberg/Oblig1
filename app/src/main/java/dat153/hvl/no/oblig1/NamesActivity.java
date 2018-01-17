package dat153.hvl.no.oblig1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);

        getData();
    }

    private void getData() {
        SharedPreferences prefs = getApplication().getSharedPreferences("appData", MODE_PRIVATE);
        Map<String, ?> names = prefs.getAll();
        listViewController(names);
    }

    private void listViewController(Map<String, ?> names) {
        ListView listView = (ListView) findViewById(R.id.listView);
        final ArrayList<String> listItems = new ArrayList<String>();

        for (Map.Entry<String, ?> entry : names.entrySet()) {
            listItems.add(entry.getKey());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItems);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(NamesActivity.this, ShowPictureActivity.class));
            }
        });

    }
}
