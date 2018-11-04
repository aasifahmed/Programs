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

public class JSCode extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_layout);
//        BufferedReader reader = null;
        text = (TextView) findViewById(R.id.code);
        Intent in = getIntent();
        String st = in.getStringExtra("Program");
//        int res = Integer.parseInt(st);
        InputStream is;
        byte[] buffer;
        if(st.equals("js1")) {
            try {
                is = getResources().openRawResource(R.raw.js_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js2")) {
            try {
                is = getResources().openRawResource(R.raw.js_factorial2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js3")) {
            try {
                is = getResources().openRawResource(R.raw.js_ifelse3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js4")) {
            try {
                is = getResources().openRawResource(R.raw.js_switch4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js5")) {
            try {
                is = getResources().openRawResource(R.raw.js_function5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js6")) {
            try {
                is = getResources().openRawResource(R.raw.js_arithmetic6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js7")) {
            try {
                is = getResources().openRawResource(R.raw.js_touppercase7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js8")) {
            try {
                is = getResources().openRawResource(R.raw.js_alert8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js9")) {
            try {
                is = getResources().openRawResource(R.raw.js_confirm9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js10")) {
            try {
                is = getResources().openRawResource(R.raw.js_prompt10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js11")) {
            try {
                is = getResources().openRawResource(R.raw.js_date11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js12")) {
            try {
                is = getResources().openRawResource(R.raw.js_array12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js13")) {
            try {
                is = getResources().openRawResource(R.raw.js_url13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js14")) {
            try {
                is = getResources().openRawResource(R.raw.js_print14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js15")) {
            try {
                is = getResources().openRawResource(R.raw.js_leapyear15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js16")) {
            try {
                is = getResources().openRawResource(R.raw.js_areasquare16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js17")) {
            try {
                is = getResources().openRawResource(R.raw.js_time17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js18")) {
            try {
                is = getResources().openRawResource(R.raw.js_quicksort18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js19")) {
            try {
                is = getResources().openRawResource(R.raw.js_selectsort19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js20")) {
            try {
                is = getResources().openRawResource(R.raw.js_insertsort20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js21")) {
            try {
                is = getResources().openRawResource(R.raw.js_bubblesort21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js22")) {
            try {
                is = getResources().openRawResource(R.raw.js_identitymatrix22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js23")) {
            try {
                is = getResources().openRawResource(R.raw.js_verifyage23);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js24")) {
            try {
                is = getResources().openRawResource(R.raw.js_eventhandler24);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("js25")) {
            try {
                is = getResources().openRawResource(R.raw.js_errordebug25);
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
