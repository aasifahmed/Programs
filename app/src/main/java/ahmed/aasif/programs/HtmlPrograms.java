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

public class HtmlPrograms extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_programs);
        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] { "1. Hello World",
                "2. Basic Html Tags", "3. Lists", "4. Links & Images", "5. Table", "6. Form", "7. CSS Font Properties", "8. CSS Border Properties", "9. CSS Text Properties", "10. Frames", "11. iFrame", "12. Footer tag", "13. Html Audio", "14. Html Video", "15. Canvas", "16. Html Comments", "17. Html meta tags", "18. Marquee tag", "19. External file links", "20. SVG Images", "21. Progress Tag", "22. Section Tags", "23. Text format", "24. Input types", "25. File upload"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(getApplicationContext(), HtmlCode.class);
                if (position == 0) {
//                    String str = "Hello.txt";
                    i.putExtra("Program", "h1");
                    startActivity(i);
                } else if (position == 1) {
                    i.putExtra("Program", "h2");
                    startActivity(i);
                } else if (position == 2) {
                    i.putExtra("Program", "h3");
                    startActivity(i);
                } else if (position == 3) {
                    i.putExtra("Program", "h4");
                    startActivity(i);
                } else if (position == 4) {
                    i.putExtra("Program", "h5");
                    startActivity(i);
                } else if (position == 5) {
                    i.putExtra("Program", "h6");
                    startActivity(i);
                } else if (position == 6) {
                    i.putExtra("Program", "h7");
                    startActivity(i);
                } else if (position == 7) {
                    i.putExtra("Program", "h8");
                    startActivity(i);
                } else if (position == 8) {
                    i.putExtra("Program", "h9");
                    startActivity(i);
                } else if (position == 9) {
                    i.putExtra("Program", "h10");
                    startActivity(i);
                } else if (position == 10) {
                    i.putExtra("Program", "h11");
                    startActivity(i);
                } else if (position == 11) {
                    i.putExtra("Program", "h12");
                    startActivity(i);
                } else if (position == 12) {
                    i.putExtra("Program", "h13");
                    startActivity(i);
                } else if (position == 13) {
                    i.putExtra("Program", "h14");
                    startActivity(i);
                } else if (position == 14) {
                    i.putExtra("Program", "h15");
                    startActivity(i);
                } else if (position == 15) {
                    i.putExtra("Program", "h16");
                    startActivity(i);
                } else if (position == 16) {
                    i.putExtra("Program", "h17");
                    startActivity(i);
                } else if (position == 17) {
                    i.putExtra("Program", "h18");
                    startActivity(i);
                } else if (position == 18) {
                    i.putExtra("Program", "h19");
                    startActivity(i);
                } else if (position == 19) {
                    i.putExtra("Program", "h20");
                    startActivity(i);
                } else if (position == 20) {
                    i.putExtra("Program", "h21");
                    startActivity(i);
                } else if (position == 21) {
                    i.putExtra("Program", "h22");
                    startActivity(i);
                } else if (position == 22) {
                    i.putExtra("Program", "h23");
                    startActivity(i);
                } else if (position == 23) {
                    i.putExtra("Program", "h24");
                    startActivity(i);
                } else if (position == 24) {
                    i.putExtra("Program", "h25");
                    startActivity(i);
                }
            }
        });
    }
}
