package dat153.hvl.no.oblig1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowPictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_picture);

        String name = getIntent().getStringExtra("name");

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(name);

        ImageView img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(getResources().getIdentifier(name.toLowerCase(),"drawable", getPackageName()));
    }
}
