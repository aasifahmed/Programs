package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 11/5/2018.
 */

public class Rubyprograms extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"1. Hello World",
                "2. Addition of numbers", "3. Print Random number", "4. Arithmetic Operations", "5. If Statement", "6. For Statement", "7. Get Input", "8. Swapping of Number", "9. Multiplication Table","10. String Concatenate", "11. Prime Numbers", "12. Odd or Even number", "13. Date & Time Functions", "14. Class & Object Example", "15. Calculator", "16. String Palindrome", "17. Factorial program", "18. Armstrong number", "19. Floyd Triangle", "20. Fibonacci Series"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), RubyCode.class);
                if (position == 0) {
                    i.putExtra("Program", "rb1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "rb2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "rb3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "rb4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "rb5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "rb6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "rb7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "rb8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "rb9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "rb10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "rb11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "rb12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "rb13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "rb14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "rb15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "rb16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "rb17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "rb18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "rb19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "rb20");
                    startActivity(i);
                }
            }
        });
    }

}
