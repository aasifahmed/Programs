package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 1/25/2018.
 */

public class BashCode extends AppCompatActivity {
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
        if(st.equals("b1")) {
            try {
                is = getResources().openRawResource(R.raw.bash_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b2")) {
            try {
                is = getResources().openRawResource(R.raw.bash_read2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b3")) {
            try {
                is = getResources().openRawResource(R.raw.bash_variables3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b4")) {
            try {
                is = getResources().openRawResource(R.raw.bash_factorial4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b5")) {
            try {
                is = getResources().openRawResource(R.raw.bash_arithmetic5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b6")) {
            try {
                is = getResources().openRawResource(R.raw.bash_greatthree6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b7")) {
            try {
                is = getResources().openRawResource(R.raw.bash_maxmin7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b8")) {
            try {
                is = getResources().openRawResource(R.raw.bash_palindrome8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b9")) {
            try {
                is = getResources().openRawResource(R.raw.bash_oddeven9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b10")) {
            try {
                is = getResources().openRawResource(R.raw.bash_n_odd10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b11")) {
            try {
                is = getResources().openRawResource(R.raw.bash_n_even11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b12")) {
            try {
                is = getResources().openRawResource(R.raw.bash_prime12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b13")) {
            try {
                is = getResources().openRawResource(R.raw.bash_stringlength13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b14")) {
            try {
                is = getResources().openRawResource(R.raw.bash_swapping14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b15")) {
            try {
                is = getResources().openRawResource(R.raw.bash_sumavg15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b16")) {
            try {
                is = getResources().openRawResource(R.raw.bash_gcd16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b17")) {
            try {
                is = getResources().openRawResource(R.raw.bash_calculator17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b18")) {
            try {
                is = getResources().openRawResource(R.raw.bash_leapyear18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b19")) {
            try {
                is = getResources().openRawResource(R.raw.bash_powervalue19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("b20")) {
            try {
                is = getResources().openRawResource(R.raw.bash_simcomint20);
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
