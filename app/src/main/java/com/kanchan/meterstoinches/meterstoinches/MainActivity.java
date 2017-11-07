package com.kanchan.meterstoinches.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEnterMeters;
    private Button mConvertButton;
    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnterMeters = (EditText) findViewById(R.id.editTextID);
        mConvertButton = (Button) findViewById(R.id.convertID);
        mResultTextView = (TextView)  findViewById(R.id.resultID);

        mConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double result = 0.00;
                double metervalue;
                try {
                    metervalue =Double.parseDouble(mEnterMeters.getText().toString());
                }catch(Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(), "Please enter a number:", Toast.LENGTH_SHORT);
                    toast.show();
                    return;
                }
                result = metervalue * multiplier;
                mResultTextView.setText(String.format("%.2f",result) + " Inches");
            }
        });
    }
}
