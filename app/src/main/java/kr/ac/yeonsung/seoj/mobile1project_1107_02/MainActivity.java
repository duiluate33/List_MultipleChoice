package kr.ac.yeonsung.seoj.mobile1project_1107_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] animals = {"개", "고냥이", "개코원숭이", "침팬지", "치타", "고라니", "기린", "코끼리", "타조"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1 = findViewById(R.id.list1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animals);
        list1.setAdapter(adapter);
        list1.setOnItemClickListener(listL);
    }
    AdapterView.OnItemClickListener listL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int itemIndex, long l) {
            Toast.makeText(getApplicationContext(),
                    animals[itemIndex]+ "을/를 선택하였습니다.", Toast.LENGTH_SHORT).show();
        }
    };
}