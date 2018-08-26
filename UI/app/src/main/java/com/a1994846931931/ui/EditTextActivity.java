package com.a1994846931931.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTextActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        editText = findViewById(R.id.edit_text);
        findViewById(R.id.b_vaporwave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String raw = editText.getText().toString().toUpperCase().replace(" ", "");
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < raw.length(); i++) {
                    stringBuilder.append(raw.charAt(i));
                    stringBuilder.append(" ");
                }
                String V_A_P_O_R_W_A_V_E = stringBuilder.toString();
                editText.setText(V_A_P_O_R_W_A_V_E);

            }
        });
    }
}
