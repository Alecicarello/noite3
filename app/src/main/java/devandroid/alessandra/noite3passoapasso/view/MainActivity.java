package devandroid.alessandra.noite3passoapasso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.alessandra.noite3passoapasso.R;
import devandroid.alessandra.noite3passoapasso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
    }

}