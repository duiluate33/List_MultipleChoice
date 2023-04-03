package kr.ac.yeonsung.seoj.mobile1project_1107_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CheckListViewActivity extends AppCompatActivity {
    String[] animals = {"개", "고냥이", "개코원숭이", "침팬지", "치타", "고라니", "기린", "코끼리", "타조"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list_view);
        ListView list2 = findViewById(R.id.list2);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, animals); //체크박스버튼
        list2.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);//다중선택이 가능하므로
        list2.setAdapter(adapter);
    }
}