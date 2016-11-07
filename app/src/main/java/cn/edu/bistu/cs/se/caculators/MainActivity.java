package cn.edu.bistu.cs.se.caculators;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity  implements Happy.OnFragmentInteractionListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout simple = (RelativeLayout) findViewById(R.id.layout_one);
        final RelativeLayout change=(RelativeLayout)findViewById(R.id.layout_two);
        Button btn_sim=(Button)findViewById(R.id.simple);
        Button btn_ano=(Button)findViewById(R.id.btn_ch);
        Button btn_change=(Button)findViewById(R.id.btn_change);
        final EditText input=(EditText)findViewById(R.id.editText2);
        final EditText result=(EditText)findViewById(R.id.editText3);
        final int[] num = {0};
        final int[]nums={0};
        //单位换算
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        Spinner spinner1=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(
                this,R.array.items,android.R.layout.simple_spinner_dropdown_item
        );
        spinner.setAdapter(adapter);
        spinner1.setAdapter(adapter);
        Button btn_cha=(Button)findViewById(R.id.btn_cha);
        btn_cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        //String spinnerTest= MainActivity.this.getResources().getStringArray(R.array.items)[position];
                        num[0] =0;
                        break;
                    case 1:
                        num[0] =1;
                        break;
                    case 2:
                        num[0]=2;
                        break;
                    case 3:
                        num[0]=3;
                        break;
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        nums[0]=0;
                        break;
                    case 1:
                        nums[0]=1;
                        break;
                    case 2:
                        nums[0]=2;
                        break;
                    case 3:
                        nums[0]=3;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                try {
                    switch (num[0]) {
                        case 0:
                            switch (nums[0]) {
                                case 0:
                                    text = input.getText().toString();
                                    double num = Double.valueOf(text);
                                    result.setText(String.valueOf(num));
                                    break;
                                case 1:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)/60));
                                    break;
                                case 2:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) / 3600));
                                    break;
                                case 3:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)/86400));
                                    break;
                            }
                            break;
                        case 1:
                            switch (nums[0]) {
                                case 0:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) * 60));
                                    break;
                                case 1:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)));
                                    break;
                                case 2:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)/60));
                                    break;
                                case 3:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)/1440));
                                    break;
                            }
                            break;
                        case 2:
                            switch (nums[0]) {
                                case 0:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) * 3600));
                                    break;
                                case 1:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) * 60));
                                    break;
                                case 2:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)));
                                    break;
                                case 3:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)/24));
                                    break;
                            }
                            break;
                        case 3:
                            switch (nums[0]) {
                                case 0:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) * 24*3600));
                                    break;
                                case 1:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) * 24*60));
                                    break;
                                case 2:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text) * 24));
                                    break;
                                case 3:
                                    text = input.getText().toString();
                                    result.setText(String.valueOf(Double.valueOf(text)));
                                    break;
                            }
                            break;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    result.setText("输入有错，请重新输入");
                }

            }
        });
        btn_sim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simple.setVisibility(View.VISIBLE);
                change.setVisibility(View.INVISIBLE);
            }
        });

        btn_ano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simple.setVisibility(View.INVISIBLE);
                change.setVisibility(View.VISIBLE);
            }
        });

    }
    public double getNum(String num,double bnum){
        BigDecimal a=new BigDecimal(bnum);
        BigDecimal b=new BigDecimal(num);
        return b.multiply(a).doubleValue() ;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
