package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 1/27/2018.
 */

public class PhpCode extends AppCompatActivity {
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
        if (st.equals("p1")) {
            try {
                is = getResources().openRawResource(R.raw.php_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p2")) {
            try {
                is = getResources().openRawResource(R.raw.php_variables2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p3")) {
            try {
                is = getResources().openRawResource(R.raw.php_ifelse3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p4")) {
            try {
                is = getResources().openRawResource(R.raw.php_switch4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p5")) {
            try {
                is = getResources().openRawResource(R.raw.php_while5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p6")) {
            try {
                is = getResources().openRawResource(R.raw.php_dowhile6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p7")) {
            try {
                is = getResources().openRawResource(R.raw.php_forloop7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p8")) {
            try {
                is = getResources().openRawResource(R.raw.php_foreach8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p9")) {
            try {
                is = getResources().openRawResource(R.raw.php_function9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p10")) {
            try {
                is = getResources().openRawResource(R.raw.php_arithmetic10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p11")) {
            try {
                is = getResources().openRawResource(R.raw.php_array11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p12")) {
            try {
                is = getResources().openRawResource(R.raw.php_cookies12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p13")) {
            try {
                is = getResources().openRawResource(R.raw.php_session13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p14")) {
            try {
                is = getResources().openRawResource(R.raw.php_getmethod14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p15")) {
            try {
                is = getResources().openRawResource(R.raw.php_fileopenclose15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p16")) {
            try {
                is = getResources().openRawResource(R.raw.php_directory16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p17")) {
            try {
                is = getResources().openRawResource(R.raw.php_swappingno17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p18")) {
            try {
                is = getResources().openRawResource(R.raw.php_factorial18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p19")) {
            try {
                is = getResources().openRawResource(R.raw.php_fibonacci19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p20")) {
            try {
                is = getResources().openRawResource(R.raw.php_palindrome20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p21")) {
            try {
                is = getResources().openRawResource(R.raw.php_armstrong21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p22")) {
            try {
                is = getResources().openRawResource(R.raw.php_postmethod22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("p23")) {
            try {
                is = getResources().openRawResource(R.raw.php_errorhandling23);
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
