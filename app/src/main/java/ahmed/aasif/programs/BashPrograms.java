package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 1/25/2018.
 */

public class BashPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[]{"1. Hello World",
                "2. Read value", "3. Variables", "4. Factorial", "5. Arithmetic operation", "6. Greatest of three numbers", "7. Maximum & Minimum value", "8. Palindrome", "9. Odd or Even number", "10. N Odd numbers", "11. N Even numbers", "12. Prime number", "13. String Length", "14. Swapping of numbers", "15. Sum & average of numbers", "16. GCD of numbers", "17. Calculator", "18. Find leap year", "19. Find power value of given number", "20. Simple & Compound Interest"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), BashCode.class);
                if (position == 0) {
//                    String str = "Hello.txt";
                    i.putExtra("Program", "b1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "b2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "b3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "b4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "b5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "b6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "b7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "b8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "b9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "b10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "b11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "b12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "b13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "b14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "b15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "b16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "b17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "b18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "b19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "b20");
                    startActivity(i);
                }
            }
            });
    }
}
