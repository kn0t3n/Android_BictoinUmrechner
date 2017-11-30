package bitcoinumrechner.sabel.com.bitcoinumrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button umrechnen;
    private EditText euro, bitcoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        umrechnen = findViewById(R.id.umrechnen);

        euro = findViewById(R.id.euro);
        bitcoin = findViewById(R.id.bitcoin);

        euro.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                bitcoin.setText(bitcoin.getText().toString());
            }
        });
    }
}
