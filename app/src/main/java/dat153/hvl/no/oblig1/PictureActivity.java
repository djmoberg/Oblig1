package dat153.hvl.no.oblig1;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.daniel);
        ImageView imageView2 = new ImageView(this);
        imageView2.setImageResource(R.drawable.os);
//        layout.addView(imageView);
//        layout.addView(imageView2);

        ArrayList<ImageView> views = new ArrayList<>();
        views.add(imageView);
        views.add(imageView2);
        //git test

        ListView lv = (ListView) findViewById(R.id.listView);
        ArrayAdapter<ImageView> adapter = new ArrayAdapter<ImageView>(this, R.layout.image_view_test, views);
        lv.setAdapter(adapter);
    }
}
