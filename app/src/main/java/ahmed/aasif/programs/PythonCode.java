package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 11/4/2018.
 */

public class PythonCode extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_layout);
        text = (TextView) findViewById(R.id.code);
        Intent in = getIntent();
        String st = in.getStringExtra("Program");
        InputStream is;
        byte[] buffer;
        if (st.equals("py1")) {
            try {
                is = getResources().openRawResource(R.raw.py_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py2")) {
            try {
                is = getResources().openRawResource(R.raw.py_add_numbers2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py3")) {
            try {
                is = getResources().openRawResource(R.raw.py_swapping3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py4")) {
            try {
                is = getResources().openRawResource(R.raw.py_vowels4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py5")) {
            try {
                is = getResources().openRawResource(R.raw.py_large_nos5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py6")) {
            try {
                is = getResources().openRawResource(R.raw.py_lowercase6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py7")) {
            try {
                is = getResources().openRawResource(R.raw.py_odd_even7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py8")) {
            try {
                is = getResources().openRawResource(R.raw.py_prime_no8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py9")) {
            try {
                is = getResources().openRawResource(R.raw.py_random_nos9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py10")) {
            try {
                is = getResources().openRawResource(R.raw.py_sort_alpha10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py11")) {
            try {
                is = getResources().openRawResource(R.raw.py_string_palindrome11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py12")) {
            try {
                is = getResources().openRawResource(R.raw.py_strings_digit12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py13")) {
            try {
                is = getResources().openRawResource(R.raw.py_ascii13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py14")) {
            try {
                is = getResources().openRawResource(R.raw.py_average_nos14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py15")) {
            try {
                is = getResources().openRawResource(R.raw.py_factorial15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py16")) {
            try {
                is = getResources().openRawResource(R.raw.py_km_miles16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py17")) {
            try {
                is = getResources().openRawResource(R.raw.py_lcm17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py18")) {
            try {
                is = getResources().openRawResource(R.raw.py_leap_year18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py19")) {
            try {
                is = getResources().openRawResource(R.raw.py_multiplication_table19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py20")) {
            try {
                is = getResources().openRawResource(R.raw.py_calculator20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py21")) {
            try {
                is = getResources().openRawResource(R.raw.py_armstrong21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py22")) {
            try {
                is = getResources().openRawResource(R.raw.py_area_of_square22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py23")) {
            try {
                is = getResources().openRawResource(R.raw.py_fibonacci_series23);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py24")) {
            try {
                is = getResources().openRawResource(R.raw.py_square_root24);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("py25")) {
            try {
                is = getResources().openRawResource(R.raw.py_common_letters25);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
