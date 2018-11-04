package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 11/4/2018.
 */

public class PythonPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"1. Hello World",
                "2. Addition of numbers", "3. Swapping of numbers", "4. Vowels in a String", "5. Largest number", "6. Count lowercase letters", "7. Odd or Even", "8. Prime Number", "9. Print random number","10. Sort Alphabets", "11. String palindrome", "12. Count digits & characters", "13. Print ASCII characters", "14. Average of 5 numbers", "15. Factorial of given number", "16. Convert KM to Miles", "17. Lease Common Multiple", "18. Find leap year", "19. Multiplication Table", "20. Calculator", "21. Armstrong number", "22. Area of Square", "23. Fibonacci Series", "24. Square root of given number", "25. Common letters in given strings"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), PythonCode.class);
                if (position == 0) {
                    i.putExtra("Program", "py1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "py2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "py3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "py4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "py5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "py6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "py7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "py8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "py9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "py10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "py11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "py12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "py13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "py14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "py15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "py16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "py17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "py18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "py19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "py20");
                    startActivity(i);
                } else if (position == 20) {
                    i.putExtra("Program", "py21");
                    startActivity(i);
                } else if (position == 21) {
                    i.putExtra("Program", "py22");
                    startActivity(i);
                } else if (position == 22) {
                    i.putExtra("Program", "py23");
                    startActivity(i);
                } else if (position == 23) {
                    i.putExtra("Program", "py24");
                    startActivity(i);
                } else if (position == 24) {
                    i.putExtra("Program", "py25");
                    startActivity(i);
                }
            }
        });
    }

}
