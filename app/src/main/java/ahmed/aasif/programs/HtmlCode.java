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

public class HtmlCode extends AppCompatActivity {
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
        if(st.equals("h1")) {
            try {
                is = getResources().openRawResource(R.raw.html_hello1);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h2")) {
            try {
                is = getResources().openRawResource(R.raw.html_basic2);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h3")) {
            try {
                is = getResources().openRawResource(R.raw.html_lists3);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h4")) {
            try {
                is = getResources().openRawResource(R.raw.html_links4);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h5")) {
            try {
                is = getResources().openRawResource(R.raw.html_table5);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h6")) {
            try {
                is = getResources().openRawResource(R.raw.html_form6);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h7")) {
            try {
                is = getResources().openRawResource(R.raw.css_font7);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h8")) {
            try {
                is = getResources().openRawResource(R.raw.css_borders8);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h9")) {
            try {
                is = getResources().openRawResource(R.raw.css_text9);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h10")) {
            try {
                is = getResources().openRawResource(R.raw.html_frame10);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h11")) {
            try {
                is = getResources().openRawResource(R.raw.html_iframe11);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h12")) {
            try {
                is = getResources().openRawResource(R.raw.html_footer12);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h13")) {
            try {
                is = getResources().openRawResource(R.raw.html_audio13);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h14")) {
            try {
                is = getResources().openRawResource(R.raw.html_video14);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h15")) {
            try {
                is = getResources().openRawResource(R.raw.html_canvas15);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h16")) {
            try {
                is = getResources().openRawResource(R.raw.html_comment16);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h17")) {
            try {
                is = getResources().openRawResource(R.raw.html_meta17);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h18")) {
            try {
                is = getResources().openRawResource(R.raw.html_marquee18);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h19")) {
            try {
                is = getResources().openRawResource(R.raw.html_externallinks19);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h20")) {
            try {
                is = getResources().openRawResource(R.raw.html_svg20);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h21")) {
            try {
                is = getResources().openRawResource(R.raw.html_progressbar21);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h22")) {
            try {
                is = getResources().openRawResource(R.raw.html_section22);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h23")) {
            try {
                is = getResources().openRawResource(R.raw.html_textformat23);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h24")) {
            try {
                is = getResources().openRawResource(R.raw.html_input24);
                buffer = new byte[is.available()];
                is.read(buffer);
                is.close();
                this.text.setText(new String(buffer));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if(st.equals("h25")) {
            try {
                is = getResources().openRawResource(R.raw.html_fileupload25);
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
