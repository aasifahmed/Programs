package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 2/1/2018.
 */

public class CPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"1. Hello World",
                "2. Addition of numbers", "3. Variable", "4. Constant", "5. If-else statement", "6. Switch case", "7. For loop", "8. While loop", "9. Do-while loop", "10. Array", "11. String", "12. Function", "13. Factorial of a number", "14. Fibonacci series", "15. Find length of an array", "16. Check prime number", "17. Print date", "18. Print random numbers", "19. String concatenate", "20. Sum & average of 3 numbers", "21. Sum of N numbers", "22. Number swapping", "23. Armstrong number", "24. Floyd Triangle", "25. Pascal Triangle", "26. Check palindrome", "27. Check leap year", "28. Simple & Compound interest", "29. Arithmetic Operations", "30. Bubble sort", "31. Selection sort", "32. Insertion sort"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), CCode.class);
                if (position == 0) {
//                    String str = "Hello.txt";
                    i.putExtra("Program", "c1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "c2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "c3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "c4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "c5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "c6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "c7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "c8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "c9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "c10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "c11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "c12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "c13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "c14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "c15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "c16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "c17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "c18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "c19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "c20");
                    startActivity(i);
                } else if (position == 20) {
                    i.putExtra("Program", "c21");
                    startActivity(i);
                } else if (position == 21) {
                    i.putExtra("Program", "c22");
                    startActivity(i);
                } else if (position == 22) {
                    i.putExtra("Program", "c23");
                    startActivity(i);
                } else if (position == 23) {
                    i.putExtra("Program", "c24");
                    startActivity(i);
                } else if (position == 24) {
                    i.putExtra("Program", "c25");
                    startActivity(i);
                } else if (position == 25) {
                    i.putExtra("Program", "c26");
                    startActivity(i);
                } else if (position == 26) {
                    i.putExtra("Program", "c27");
                    startActivity(i);
                } else if (position == 27) {
                    i.putExtra("Program", "c28");
                    startActivity(i);
                } else if (position == 28) {
                    i.putExtra("Program", "c29");
                    startActivity(i);
                } else if (position == 29) {
                    i.putExtra("Program", "c30");
                    startActivity(i);
                } else if (position == 30) {
                    i.putExtra("Program", "c31");
                    startActivity(i);
                } else if (position == 31) {
                    i.putExtra("Program", "c32");
                    startActivity(i);
                }
            }
        });
    }
}
