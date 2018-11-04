package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Aasif on 2/2/2018.
 */

public class CppCode extends AppCompatActivity {
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
        if (st.equals("cpp1")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp2")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_addtwono2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp3")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_variables3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp4")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_constant4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp5")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_ifelse5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp6")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_switch6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp7")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_forloop7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp8")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_while8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp9")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_dowhile9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp10")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_function10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp11")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_strlen11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp12")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_swappingno12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp13")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_factorial13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp14")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_fibonacci14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp15")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_palindrome15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp16")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_randomno16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp17")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_reversestring17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp18")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_strconcat18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp19")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_oddoreven19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp20")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_leapyear20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp21")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_arithmetic21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp22")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_armstrong22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp23")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_calculator23);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp24")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_floydtriangle24);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp25")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_pascaltriangle25);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp26")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_date26);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp27")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_bubblesort27);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp28")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_selectionsort28);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (st.equals("cpp29")) {
            try {
                is = getResources().openRawResource(R.raw.cpp_insertionsort29);
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
