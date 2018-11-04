package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 1/24/2018.
 */

public class JavaPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);

        // Defined Array values to show in ListView
        String[] values = new String[] { "1. Hello World",
                "2. Alphabet", "3. Even Numbers", "4. Factorial", "5. Febonacci Number", "6. Area and Perimeter of circle", "7. Concatenate", "8. Nesting", "9. Swapping", "10. Armstrong", "11. Calculator", "12. Odd Numbers", "13. Matching", "14. Prime Numbers", "15. Palindrome", "16. Bank Program", "17. Smallest in array", "18. Constructor", "19. Inheritance", "20. Bubble sort", "21. Insertion sort", "22. Selection sort", "23. Students Marks", "24. Print Random numbers", "25. Convert number to month and days", "26. Encapsulation", "27. Polymorphism", "28. Abstraction"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), JavaCode.class);
                if(position == 0) {
//                    String str = "Hello.txt";
                    i.putExtra("Program", "1");
                    startActivity(i);
                } else if(position == 1) {
                    i.putExtra("Program", "2");
                    startActivity(i);
                } else if(position == 2) {
                    i.putExtra("Program", "3");
                    startActivity(i);
                } else if(position == 3) {
                    i.putExtra("Program", "4");
                    startActivity(i);
                } else if(position == 4) {
                    i.putExtra("Program", "5");
                    startActivity(i);
                } else if(position == 5) {
                    i.putExtra("Program", "6");
                    startActivity(i);
                } else if(position == 6) {
                    i.putExtra("Program", "7");
                    startActivity(i);
                } else if(position == 7) {
                    i.putExtra("Program", "8");
                    startActivity(i);
                } else if(position == 8) {
                    i.putExtra("Program", "9");
                    startActivity(i);
                } else if(position == 9) {
                    i.putExtra("Program", "10");
                    startActivity(i);
                } else if(position == 10) {
                    i.putExtra("Program", "11");
                    startActivity(i);
                } else if(position == 11) {
                    i.putExtra("Program", "12");
                    startActivity(i);
                } else if(position == 12) {
                    i.putExtra("Program", "13");
                    startActivity(i);
                } else if(position == 13) {
                    i.putExtra("Program", "14");
                    startActivity(i);
                } else if(position == 14) {
                    i.putExtra("Program", "15");
                    startActivity(i);
                } else if(position == 15) {
                    i.putExtra("Program", "16");
                    startActivity(i);
                } else if(position == 16) {
                    i.putExtra("Program", "17");
                    startActivity(i);
                } else if(position == 17) {
                    i.putExtra("Program", "18");
                    startActivity(i);
                } else if(position == 18) {
                    i.putExtra("Program", "19");
                    startActivity(i);
                } else if(position == 19) {
                    i.putExtra("Program", "20");
                    startActivity(i);
                } else if(position == 20) {
                    i.putExtra("Program", "21");
                    startActivity(i);
                } else if(position == 21) {
                    i.putExtra("Program", "22");
                    startActivity(i);
                } else if(position == 22) {
                    i.putExtra("Program", "23");
                    startActivity(i);
                } else if(position == 23) {
                    i.putExtra("Program", "24");
                    startActivity(i);
                } else if(position == 24) {
                    i.putExtra("Program", "25");
                    startActivity(i);
                } else if(position == 25) {
                    i.putExtra("Program", "26");
                    startActivity(i);
                } else if(position == 26) {
                    i.putExtra("Program", "27");
                    startActivity(i);
                } else if(position == 27) {
                    i.putExtra("Program", "28");
                    startActivity(i);
                }
            }

        });
    }
}
