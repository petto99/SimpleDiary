package kr.hs.emirim.petto99.simplediary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker datePic;
    EditText editDiary;
    Button butSave;
    String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePic = (DatePicker)findViewById(R.id.date_picker);
        editDiary=(EditText)findViewById(R.id.edit_content);
        butSave=(Button)findViewById(R.id.but_save);

        // 현재 날짜 구하기
        Calendar calendar=Calendar.getInstance();
        int nowYear=calendar.get(Calendar.YEAR);
        int nowMonth=calendar.get(Calendar.MONTH)+1;
        int nowDate=calendar.get(Calendar.DATE);

        //DatePicker에 현재 날짜 설정
        datePic.init(nowYear, nowMonth, nowDate, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                fileName=year+"_"+(monthOfYear+1)+"_"+dayOfMonth+".txt";
                String content=readDiary(fileName);
                editDiary.setText(content);
                butSave.setEnabled(true);
            }
        });
    }
    String readDiary(String fileName){
        return null;
    }
}
