package com.example.mipt2darbas;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mipt2darbas.utils.TextCounter;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinner = (Spinner) findViewById(R.id.spinnerOptions);
// Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.options_array,
                android.R.layout.simple_spinner_item
        );
// Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        spinner.setAdapter(adapter);
    }


    public void buttonOnClick(View view) {
        EditText userInput = findViewById(R.id.editTextUserInput);
        TextView outPut = findViewById(R.id.textViewOutput);
        if(!userInput.getText().toString().isEmpty()) {
            if (spinner.getSelectedItemPosition() == 1) {

                Toast.makeText(this, "selectedWords", Toast.LENGTH_SHORT).show();
                int result = TextCounter.countWords(userInput.getText().toString());
                String stringResult = String.valueOf(result);
                outPut.setText(stringResult);

            }
            if (spinner.getSelectedItemPosition() == 2) {

                Toast.makeText(this, "selectedChars", Toast.LENGTH_SHORT).show();
                int result = TextCounter.countChars(userInput.getText().toString());
                String stringResult = String.valueOf(result);
                outPut.setText(stringResult);

            }
            if (spinner.getSelectedItemPosition() == 0) {

                Toast.makeText(this, "selectedSentences", Toast.LENGTH_SHORT).show();
                int result = TextCounter.countSentences(userInput.getText().toString());
                String stringResult = String.valueOf(result);
                outPut.setText(stringResult);

            }

            if (spinner.getSelectedItemPosition() == 3) {

                Toast.makeText(this, "selectedNumbers", Toast.LENGTH_SHORT).show();
                int result = TextCounter.countNumbers(userInput.getText().toString());
                String stringResult = String.valueOf(result);
                outPut.setText(stringResult);

            }
        }
        else {


            Toast.makeText(this, String.valueOf(spinner.getSelectedItemPosition()), Toast.LENGTH_SHORT).show();

        }

    }
}