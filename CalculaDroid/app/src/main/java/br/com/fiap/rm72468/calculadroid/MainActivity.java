package br.com.fiap.rm72468.calculadroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumero1 = null;
    private EditText edtNumero2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View v) {
        edtNumero1 = (EditText) findViewById(R.id.edtNum1);
        edtNumero2 = (EditText) findViewById(R.id.edtNum2);

        double n1 = Double.parseDouble(edtNumero1.getText().toString());
        double n2 = Double.parseDouble(edtNumero2.getText().toString());

        double resultado = n1 + n2;

        Toast.makeText(MainActivity.this, "Soma é: " + String.valueOf(resultado), Toast.LENGTH_SHORT).show();
    }

}
