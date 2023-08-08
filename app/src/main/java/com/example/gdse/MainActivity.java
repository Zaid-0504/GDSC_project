package com.example.gdse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView expand_button_1;
    private ImageView expand_button_2;
    private LinearLayout linearLayout_1;
    private LinearLayout linearLayout_2;
    private Boolean is_text_visible=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expand_button_1=findViewById(R.id.expand_view_1);
        expand_button_2=findViewById(R.id.expand_view_2);
        linearLayout_1=findViewById(R.id.linear_layout_1);
        linearLayout_2=findViewById(R.id.linear_layout_2);

        expand_button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_text_visible){
                    linearLayout_1.setVisibility(View.GONE);
                    is_text_visible=false;
                }else {
                    linearLayout_1.setVisibility(View.VISIBLE);
                    is_text_visible=true;
                }
            }
        });
        expand_button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(is_text_visible){
                    linearLayout_2.setVisibility(View.GONE);
                    is_text_visible=false;
                }else {
                    linearLayout_2.setVisibility(View.VISIBLE);
                    is_text_visible=true;
                }
            }
        });
    }
}