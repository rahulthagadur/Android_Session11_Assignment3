package com.example.thagadur.android_session11_assignment3;

/**
 * Created by Thagadur on 10/13/2017.
 */
import android.graphics.Bitmap;

/**
 * Generate getters and setters
 */
public class Employee {
    private Bitmap bmp;
    private String name;
    private int age;

    public Employee(Bitmap b, String n, int k) {
        bmp = b;
        name = n;
        age = k;
    }

    public Bitmap getBitmap() {
        return bmp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
