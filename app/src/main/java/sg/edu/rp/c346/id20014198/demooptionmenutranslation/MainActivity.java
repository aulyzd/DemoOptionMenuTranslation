package sg.edu.rp.c346.id20014198.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText1=findViewById(R.id.textViewTranslatedText1);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText1.setText("Hello ");
            return true;
        } else if (id == R.id.italianSelection) {
            tvTranslatedText1.setText("Ciao");
            return true;
        } else {
            tvTranslatedText1.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }


}