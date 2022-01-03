package com.example.konvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.textValue);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          //Code here executes on main thread after user presses button
                                          Toast.makeText(MainActivity.this,"Weight successfully converted",Toast.LENGTH_SHORT).show();
                                         String s = editText.getText().toString();
                                         int kg = Integer.parseInt(s);
                                         double pound = 2.205 * kg;

                                         textView.setText("calculated weight is " + pound);
/*

                                         //Spinner Element
                                         Spinner spinner = (Spinner) findViewById(R.id.drop);

                                         //Spinner DropDown Elements

                                          List<String> categories = new ArrayList<String>();
                                          categories.add("Kg to Pounds");
                                          categories.add("Pounds to Kg");

                                          //Creating Adapter for Spinner

                                          ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item,categories);
                                          // Dropdown Layout Style - list view with radio button
                                          dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

                                          spinner.setAdapter(dataAdapter);
                                          //onMenuItemSelected(AdapterView<?>parent, View view, int position, long id)
*/

                                      }
                                  }
        );
    }

}