package dat153.hvl.no.oblig1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 /*       ArrayList<String> names = new ArrayList<>();
        names.add("Daniel");
        names.add("Per");
        addData(names);*/
    }

    public void namesOnClick(View v) {
        startActivity(new Intent(this, NamesActivity.class));
    }

    public void picturesOnClick(View v) {
        startActivity(new Intent(MainActivity.this, PictureActivity.class));
    }

    public void learningOnClick(View v) {
        startActivity(new Intent(MainActivity.this, LearningActivity.class));
    }

/*    private void addData(ArrayList<String> names) {
        SharedPreferences prefs = getApplication().getSharedPreferences("appData", MODE_PRIVATE);

        for (String name : names) {
            prefs.edit().putString(name, "default").apply();
        }
    }*/
}
