package edu.cascadia.mobile.apps.hellogithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.cascadia.mobile.apps.hellogithub.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}
