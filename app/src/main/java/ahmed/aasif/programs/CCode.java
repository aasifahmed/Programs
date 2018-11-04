package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 2/1/2018.
 */

public class CCode extends AppCompatActivity {
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
        if (st.equals("c1")) {
            try {
                is = getResources().openRawResource(R.raw.c_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c2")) {
            try {
                is = getResources().openRawResource(R.raw.c_addnumbers2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c3")) {
            try {
                is = getResources().openRawResource(R.raw.c_variable3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c4")) {
            try {
                is = getResources().openRawResource(R.raw.c_constant4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c5")) {
            try {
                is = getResources().openRawResource(R.raw.c_ifelse5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c6")) {
            try {
                is = getResources().openRawResource(R.raw.c_switch6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c7")) {
            try {
                is = getResources().openRawResource(R.raw.c_forloop7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c8")) {
            try {
                is = getResources().openRawResource(R.raw.c_while8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c9")) {
            try {
                is = getResources().openRawResource(R.raw.c_dowhile9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c10")) {
            try {
                is = getResources().openRawResource(R.raw.c_array10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c11")) {
            try {
                is = getResources().openRawResource(R.raw.c_string11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c12")) {
            try {
                is = getResources().openRawResource(R.raw.c_function12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c13")) {
            try {
                is = getResources().openRawResource(R.raw.c_factorial13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c14")) {
            try {
                is = getResources().openRawResource(R.raw.c_fibonacci14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c15")) {
            try {
                is = getResources().openRawResource(R.raw.c_lenofarr15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c16")) {
            try {
                is = getResources().openRawResource(R.raw.c_prime16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c17")) {
            try {
                is = getResources().openRawResource(R.raw.c_printdate17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c18")) {
            try {
                is = getResources().openRawResource(R.raw.c_randomno18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c19")) {
            try {
                is = getResources().openRawResource(R.raw.c_stringconcate19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c20")) {
            try {
                is = getResources().openRawResource(R.raw.c_sumavg3num20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c21")) {
            try {
                is = getResources().openRawResource(R.raw.c_sumnno21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c22")) {
            try {
                is = getResources().openRawResource(R.raw.c_swappingno22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c23")) {
            try {
                is = getResources().openRawResource(R.raw.c_armstrong23);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c24")) {
            try {
                is = getResources().openRawResource(R.raw.c_flyodtriangle24);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c25")) {
            try {
                is = getResources().openRawResource(R.raw.c_pascaltriangle25);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c26")) {
            try {
                is = getResources().openRawResource(R.raw.c_palindrome26);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c27")) {
            try {
                is = getResources().openRawResource(R.raw.c_leapyear27);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c28")) {
            try {
                is = getResources().openRawResource(R.raw.c_simcomint28);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c29")) {
            try {
                is = getResources().openRawResource(R.raw.c_arithmetic29);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c30")) {
            try {
                is = getResources().openRawResource(R.raw.c_bubblesort30);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c31")) {
            try {
                is = getResources().openRawResource(R.raw.c_selectionsort31);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("c32")) {
            try {
                is = getResources().openRawResource(R.raw.c_insertionsort32);
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
