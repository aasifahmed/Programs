package ahmed.aasif.programs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Aasif on 1/27/2018.
 */

public class PhpPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"1. Hello World",
                "2. Variables", "3.If-Else", "4. Switch Case", "5. While loop", "6. Do-While loop", "7. For loop", "8. Foreach loop", "9. Function", "10. Arithmetic operations", "11. Array", "12. Cookies", "13. Sessions", "14. GET method", "15. Opening and closing a file", "16. Create, rename and delete a directory", "17. Swapping of numbers", "18. Factorial", "19. Fibonacci series", "20. Palindrome", "21. Armstrong number", "22. POST method", "23. Error handling"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), PhpCode.class);
                if (position == 0) {
//                    String str = "Hello.txt";
                    i.putExtra("Program", "p1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "p2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "p3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "p4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "p5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "p6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "p7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "p8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "p9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "p10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "p11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "p12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "p13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "p14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "p15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "p16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "p17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "p18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "p19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "p20");
                    startActivity(i);
                } else if (position == 20) {
                    i.putExtra("Program", "p21");
                    startActivity(i);
                } else if (position == 21) {
                    i.putExtra("Program", "p22");
                    startActivity(i);
                } else if (position == 22) {
                    i.putExtra("Program", "p23");
                    startActivity(i);
                }
            }
            });
    }
}
