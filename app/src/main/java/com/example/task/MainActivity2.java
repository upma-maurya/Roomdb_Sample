package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    EditText et_tast,et_desc;
    Button save_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_tast=findViewById(R.id.edit1);
        et_desc=findViewById(R.id.edit2);
        save_btn=findViewById(R.id.btnsave);

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Data data= new Data();
                data.setData(et_tast.getText().toString());
                data.setDesc(et_desc.getText().toString());

                AppDatabase.getInstance(getApplicationContext()).taskDao().insert(data);



            }
        });


    }


}