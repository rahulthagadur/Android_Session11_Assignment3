package com.example.thagadur.android_session11_assignment3;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    private DBhelper dBhelper;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dBhelper = new DBhelper(this);
        Employee employee_One = new Employee(BitmapFactory.decodeResource(
                getResources(), R.drawable.inspiration), "Bill Gates", 60);
        dBhelper.open();
        dBhelper.insertEmpDetails(employee_One);
        dBhelper.close();
        employee_One = null;
        dBhelper.open();
        employee_One = dBhelper.getEmpDetails();
        dBhelper.close();

        TextView employeeName = (TextView) findViewById(R.id.employee_name);
        employeeName.setText(employee_One.getName());

        ImageView emplyeePhoto= (ImageView) findViewById(R.id.employee_photo);
        emplyeePhoto.setImageBitmap(employee_One.getBitmap());

        TextView emplyoeeAge= (TextView) findViewById(R.id.emplyoee_age);
        emplyoeeAge.setText("" + employee_One.getAge());

    }
}