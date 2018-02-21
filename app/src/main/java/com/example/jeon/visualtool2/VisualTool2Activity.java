package com.example.jeon.visualtool2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class VisualTool2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                            ((RadioButton) view).getText(),
                            Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio2:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                            ((RadioButton) view).getText(),
                            Toast.LENGTH_SHORT).show();
                break;

        }


    }
    public void onRadioButtonClicked2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio3:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                            ((RadioButton) view).getText(),
                            Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio4:
                if (checked)
                    Toast.makeText(getApplicationContext(),
                            ((RadioButton) view).getText(),
                            Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
