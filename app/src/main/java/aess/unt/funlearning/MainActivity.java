package aess.unt.funlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button cambio;
    TextView lbregistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Acá veremos el cambio al menu del usuario
        cambio = findViewById(R.id.btn_registrar);
        cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cambio = new Intent(MainActivity.this,menu_usuario.class);
                startActivity(cambio);
            }
        });
//Acá iremos al menu registrar
        lbregistrar = findViewById(R.id.txt_registrar);
        lbregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lbregistrar1 = new Intent(MainActivity.this,activity_register.class);
                startActivity(lbregistrar1);
            }
        });
    }
}
