package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView lvCards = (ListView) findViewById(R.id.list_cards);
        CardsAdapter adapter = new CardsAdapter(this);

        lvCards.setAdapter(adapter);
        adapter.addAll(new CardModel(R.drawable.c, R.string.c, R.string.c_prg),
                new CardModel(R.drawable.cpp, R.string.cpp, R.string.cpp_prog),
                new CardModel(R.drawable.java, R.string.java, R.string.java_program),
                new CardModel(R.drawable.html, R.string.html_css, R.string.html_css_prog),
                new CardModel(R.drawable.js, R.string.javascript, R.string.js_prog),
                new CardModel(R.drawable.php, R.string.php, R.string.php_prog),
                new CardModel(R.drawable.linux, R.string.bash, R.string.bash_prog),
                new CardModel(R.drawable.python, R.string.python, R.string.python_prog));
        lvCards.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent c = new Intent(getApplicationContext(), CPrograms.class);
                    startActivity(c);
                } else if(position == 1) {
                    Intent cpp = new Intent(getApplicationContext(), CppPrograms.class);
                    startActivity(cpp);
                } else if (position == 2) {
                    Intent java = new Intent(getApplicationContext(), JavaPrograms.class);
                    startActivity(java);
                }
                else if (position == 3) {
                    Intent html = new Intent(getApplicationContext(), HtmlPrograms.class);
                    startActivity(html);
                }
                else if (position == 4) {
                    Intent js = new Intent(getApplicationContext(), JSPrograms.class);
                    startActivity(js);
                }
                else if (position == 5) {
                    Intent php = new Intent(getApplicationContext(), PhpPrograms.class);
                    startActivity(php);
                }
                else if (position == 6) {
                    Intent bash = new Intent(getApplicationContext(), BashPrograms.class);
                    startActivity(bash);
                }
                else if (position == 7) {
                    Intent python = new Intent(getApplicationContext(), PythonPrograms.class);
                    startActivity(python);
                }
            }
            });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = "Learn C, C++, Java, HTML & CSS, JavaScript, PHP, Python, Bash Commands programs in a single app. Explore 100+ programs and enjoy coding! Download it from https://play.google.com/store/apps/details?id=ahmed.aasif.programs";
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Programs");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Select to Share!"));
            return true;
        } else if(id == R.id.action_about) {
            Intent i = new Intent(getApplicationContext(), AboutActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
