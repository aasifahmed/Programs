package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 1/24/2018.
 */

public class JavaCode extends AppCompatActivity {
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
        if(st.equals("1")) {
            try {
                is = getResources().openRawResource(R.raw.java_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("2")) {
            try {
                is = getResources().openRawResource(R.raw.java_alphabet2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("3")) {
            try {
                is = getResources().openRawResource(R.raw.java_evennumbers3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("4")) {
            try {
                is = getResources().openRawResource(R.raw.java_factorial4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("5")) {
            try {
                is = getResources().openRawResource(R.raw.java_febonacci5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("6")) {
            try {
                is = getResources().openRawResource(R.raw.java_areademo6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("7")) {
            try {
                is = getResources().openRawResource(R.raw.java_concat7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("8")) {
            try {
                is = getResources().openRawResource(R.raw.java_nesting8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("9")) {
            try {
                is = getResources().openRawResource(R.raw.java_swap9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("10")) {
            try {
                is = getResources().openRawResource(R.raw.java_armstrong10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("11")) {
            try {
                is = getResources().openRawResource(R.raw.java_calculator11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("12")) {
            try {
                is = getResources().openRawResource(R.raw.java_odd12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("13")) {
            try {
                is = getResources().openRawResource(R.raw.java_matching13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("14")) {
            try {
                is = getResources().openRawResource(R.raw.java_prime14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("15")) {
            try {
                is = getResources().openRawResource(R.raw.java_palindrome15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else if(st.equals("16")) {
            try {
                is = getResources().openRawResource(R.raw.java_bank16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("17")) {
            try {
                is = getResources().openRawResource(R.raw.java_smallarray17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("18")) {
            try {
                is = getResources().openRawResource(R.raw.java_construct18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("19")) {
            try {
                is = getResources().openRawResource(R.raw.java_inheritance19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("20")) {
            try {
                is = getResources().openRawResource(R.raw.java_bubble20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("21")) {
            try {
                is = getResources().openRawResource(R.raw.java_insert21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("22")) {
            try {
                is = getResources().openRawResource(R.raw.java_selection22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("23")) {
            try {
                is = getResources().openRawResource(R.raw.java_marks23);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("24")) {
            try {
                is = getResources().openRawResource(R.raw.java_random24);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("25")) {
            try {
                is = getResources().openRawResource(R.raw.java_daymonth25);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("26")) {
            try {
                is = getResources().openRawResource(R.raw.java_encaps26);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("27")) {
            try {
                is = getResources().openRawResource(R.raw.java_polymorphism27);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("28")) {
            try {
                is = getResources().openRawResource(R.raw.java_abstraction28);
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
