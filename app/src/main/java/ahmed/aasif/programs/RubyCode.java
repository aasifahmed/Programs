package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 11/5/2018.
 */

public class RubyCode extends AppCompatActivity {

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
        if (st.equals("rb1")) {
            try {
                is = getResources().openRawResource(R.raw.rb_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb2")) {
            try {
                is = getResources().openRawResource(R.raw.rb_add_numbers2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb3")) {
            try {
                is = getResources().openRawResource(R.raw.rb_random3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb4")) {
            try {
                is = getResources().openRawResource(R.raw.rb_arithmetic4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb5")) {
            try {
                is = getResources().openRawResource(R.raw.rb_if5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb6")) {
            try {
                is = getResources().openRawResource(R.raw.rb_for6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb7")) {
            try {
                is = getResources().openRawResource(R.raw.rb_input7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb8")) {
            try {
                is = getResources().openRawResource(R.raw.rb_swap8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb9")) {
            try {
                is = getResources().openRawResource(R.raw.rb_table9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb10")) {
            try {
                is = getResources().openRawResource(R.raw.rb_string_concat10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb11")) {
            try {
                is = getResources().openRawResource(R.raw.rb_prime_no11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb12")) {
            try {
                is = getResources().openRawResource(R.raw.rb_odd_even12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb13")) {
            try {
                is = getResources().openRawResource(R.raw.rb_date13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb14")) {
            try {
                is = getResources().openRawResource(R.raw.rb_class_object14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb15")) {
            try {
                is = getResources().openRawResource(R.raw.rb_calculator15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb16")) {
            try {
                is = getResources().openRawResource(R.raw.rb_palindrome16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb17")) {
            try {
                is = getResources().openRawResource(R.raw.rb_factorial17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb18")) {
            try {
                is = getResources().openRawResource(R.raw.rb_armstrong18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb19")) {
            try {
                is = getResources().openRawResource(R.raw.rb_floyd19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("rb20")) {
            try {
                is = getResources().openRawResource(R.raw.rb_fibonacci_series20);
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
