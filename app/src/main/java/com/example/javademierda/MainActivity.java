package com.example.javademierda;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
//    @BindView(R.id.nav_host_fragment)
    //android.widget.fragment navHostFragment;
//    android.widget.fragment navHostFragment;
    @BindView(R.id.fab)
    FloatingActionButton fab;

    /* Variables */
    //@BindView(R.id.toolbar)
    //Toolbar toolbar;

    @BindView(R.id.etNombre)
    EditText etNombre;

    @BindView(R.id.etApellidos)
    EditText etApellidos;

    @BindView(R.id.etEmail)
    EditText etEmail;

    @BindView(R.id.etTelefono)
    EditText etTelefono;

    @BindView(R.id.swTerminos)
    Switch swTerminos;

/*    @BindView(R.id.content_main)
    RelativeLayout contentMain;

    @BindView(R.id.fab)
    FloatingActionButton fab;

    @BindView(R.id.nav_view)
    NavigationView navView;

    @BindView(R.id.drawer_Layour)
    DrawerLayour dreawerLayout;
    /**/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //La omite Toolbar toolbar = findViewById(R.id.toolbar);
        //Toolbar toolbar = (ToolBar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //La omite FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick(R.id.btnGuardar)
    public void saveData(){
        if(swTerminos.isChecked()){
            Toast.makeText(this, "Registrando a " + etNombre.getText().toString() + "...",
                    Toast.LENGTH_SHORT).show();
        } /*else {
            Snackbar.make(content_main, "Debe aceptar los terminos y condiciones.", Snackbar.LENGTH_LONG)
                    .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            swTerminos.setChecked(true);
                        }
                    })
                    .show();
        }*/
    }
}
