package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 2/2/2018.
 */

public class CppPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"1. Hello World",
                "2. Addition of numbers", "3. Variable", "4. Constant", "5. If-else statement", "6. Switch case", "7. For loop", "8. While loop", "9. Do-while loop", "10. Function", "11. String Length", "12. Swapping of numbers", "13. Factorial of a number", "14. Fibonacci series", "15. Check palindrome", "16. Print randome number", "17. Reverse string", "18. String concatenate", "19. Check odd or even", "20. Find leap year", "21. Arithmetic operations", "22. Armstrong number", "23. Calculator", "24. Floyd Triangle", "25. Pascal Triangle", "26. Print date", "27. Bubble sort", "28. Selection sort", "29. Insertion sort"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), CppCode.class);
                if (position == 0) {
                    i.putExtra("Program", "cpp1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "cpp2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "cpp3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "cpp4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "cpp5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "cpp6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "cpp7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "cpp8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "cpp9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "cpp10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "cpp11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "cpp12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "cpp13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "cpp14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "cpp15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "cpp16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "cpp17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "cpp18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "cpp19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "cpp20");
                    startActivity(i);
                } else if (position == 20) {
                    i.putExtra("Program", "cpp21");
                    startActivity(i);
                } else if (position == 21) {
                    i.putExtra("Program", "cpp22");
                    startActivity(i);
                } else if (position == 22) {
                    i.putExtra("Program", "cpp23");
                    startActivity(i);
                } else if (position == 23) {
                    i.putExtra("Program", "cpp24");
                    startActivity(i);
                } else if (position == 24) {
                    i.putExtra("Program", "cpp25");
                    startActivity(i);
                } else if (position == 25) {
                    i.putExtra("Program", "cpp26");
                    startActivity(i);
                } else if (position == 26) {
                    i.putExtra("Program", "cpp27");
                    startActivity(i);
                } else if (position == 27) {
                    i.putExtra("Program", "cpp28");
                    startActivity(i);
                } else if (position == 28) {
                    i.putExtra("Program", "cpp29");
                    startActivity(i);
                }
            }
        });
    }

}
