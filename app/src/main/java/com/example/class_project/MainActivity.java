package com.example.class_project;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView textView;
    Button btnHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_test);

        textView = findViewById(R.id.tv_hello);
        btnHello = findViewById(R.id.btn_hello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("hello 南信工");
            }
        });
    }
}