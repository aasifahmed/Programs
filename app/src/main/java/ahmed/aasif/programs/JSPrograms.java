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

public class JSPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"1. Hello World",
                "2. Factorial", "3. If Else", "4. Switch Case", "5. Function", "6. Arithmetic", "7. To Uppercase", "8. Alert box", "9. Confirm box", "10. Prompt box", "11. Date", "12. Array", "13. Display URL", "14. Print display", "15. Find leap year", "16. Area of square", "17. Display Time", "18. Quick Sort", "19. Selection Sort", "20. Insertion Sort", "21. Bubble Sort", "22. Identity Matrix", "23. Verify Age", "24. Event Handler", "25. Errors & Debugging"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), JSCode.class);
                if (position == 0) {
//                    String str = "Hello.txt";
                    i.putExtra("Program", "js1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "js2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "js3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "js4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "js5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "js6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "js7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "js8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "js9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "js10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "js11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "js12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "js13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "js14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "js15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "js16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "js17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "js18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "js19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "js20");
                    startActivity(i);
                } else if (position == 20) {
                    i.putExtra("Program", "js21");
                    startActivity(i);
                } else if (position == 21) {
                    i.putExtra("Program", "js22");
                    startActivity(i);
                } else if (position == 22) {
                    i.putExtra("Program", "js23");
                    startActivity(i);
                } else if (position == 23) {
                    i.putExtra("Program", "js24");
                    startActivity(i);
                } else if (position == 24) {
                    i.putExtra("Program", "js25");
                    startActivity(i);
                }
            }
        });
    }
}
