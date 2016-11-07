package cn.edu.bistu.cs.se.caculators;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn_change2=(Button)findViewById(R.id.btn_change2);
        Button btn_change8=(Button)findViewById(R.id.btn_change8);
        Button btn_change16=(Button)findViewById(R.id.btn_change16);
        Button btn_return=(Button)findViewById(R.id.btn_return);
        final EditText input=(EditText)findViewById(R.id.editText4);
        final EditText result=(EditText)findViewById(R.id.editText5);
        btn_change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String string=input.getText().toString();
                    result.setText(Integer.toBinaryString(Integer.valueOf(string)));
                }catch (Exception e){
                    e.printStackTrace();
                    result.setText("输入有误，请重新输入");
                }


            }
        });
        btn_change8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String string=input.getText().toString();
                    result.setText(Integer.toOctalString(Integer.valueOf(string)));
                }catch (Exception e){
                    e.printStackTrace();
                    result.setText("输入有误，请重新输入");
                }

            }
        });
        btn_change16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String string=input.getText().toString();
                    result.setText(Integer.toHexString(Integer.valueOf(string)));
                }catch (Exception e){
                    e.printStackTrace();
                    result.setText("输入有误，请重新输入");
                }
            }
        });
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
