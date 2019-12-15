package com.example.newcalculator;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ConversionActivity extends AppCompatActivity implements View.OnClickListener{

    //绑定竖屏使用

    private EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10,editText11;
    private Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int orientation=getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.conversion_land);
        }else if(orientation==Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.conversion);
            button1=findViewById(R.id.button1);
            button2=findViewById(R.id.button2);
            button3=findViewById(R.id.button3);
            button4=findViewById(R.id.button4);
            button5=findViewById(R.id.button5);
            button6=findViewById(R.id.button6);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        editText1=findViewById(R.id.editText7);
        editText2=findViewById(R.id.editText5);
        editText3=findViewById(R.id.editText4);
        editText4=findViewById(R.id.editText3);

        editText5=findViewById(R.id.editText10);
        editText6=findViewById(R.id.editText8);
        editText7=findViewById(R.id.editText9);

        editText8=findViewById(R.id.editText12);
        editText9=findViewById(R.id.editText13);
        editText10=findViewById(R.id.editText14);
        editText11=findViewById(R.id.editText15);
        switch (view.getId()){
            case R.id.button1:
                if(TextUtils.isEmpty(editText2.getText())&&TextUtils.isEmpty(editText3.getText())&&TextUtils.isEmpty(editText4.getText())){
                    double num_mm=Double.valueOf(editText1.getText().toString());
                    editText2.setText(String.valueOf(num_mm*0.1));
                    editText3.setText(String.valueOf(num_mm*0.01));
                    editText4.setText(String.valueOf(num_mm*0.001));
                }
                else if(TextUtils.isEmpty(editText1.getText())&&TextUtils.isEmpty(editText3.getText())&&TextUtils.isEmpty(editText4.getText())){
                    double num_cm=Double.valueOf(editText2.getText().toString());
                    editText1.setText(String.valueOf(num_cm*10));
                    editText3.setText(String.valueOf(num_cm*0.1));
                    editText4.setText(String.valueOf(num_cm*0.01));
                }
                else if(TextUtils.isEmpty(editText1.getText())&&TextUtils.isEmpty(editText2.getText())&&TextUtils.isEmpty(editText4.getText())){
                    double num_dm=Double.valueOf(editText3.getText().toString());
                    editText1.setText(String.valueOf(num_dm*100));
                    editText2.setText(String.valueOf(num_dm*10));
                    editText4.setText(String.valueOf(num_dm*0.1));
                }
                else if(TextUtils.isEmpty(editText2.getText())&&TextUtils.isEmpty(editText3.getText())&&TextUtils.isEmpty(editText1.getText())){
                    double num_m=Double.valueOf(editText4.getText().toString());
                    editText1.setText(String.valueOf(num_m*1000));
                    editText2.setText(String.valueOf(num_m*100));
                    editText3.setText(String.valueOf(num_m*10));
                }else{
                    Toast.makeText(ConversionActivity.this,"长度单位转换出现错误，请先清空",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button2:
                editText1.setText("");
                editText2.setText("");
                editText3.setText("");
                editText4.setText("");
                break;
            case R.id.button3:
                if(TextUtils.isEmpty(editText6.getText())&&TextUtils.isEmpty(editText7.getText())){
                    double v_cm=Double.valueOf(editText5.getText().toString());
                    editText6.setText(String.valueOf(v_cm*0.001));
                    editText7.setText(String.valueOf(v_cm*0.000001));
                }
                else if(TextUtils.isEmpty(editText5.getText())&&TextUtils.isEmpty(editText7.getText())){
                    double v_dm=Double.valueOf(editText6.getText().toString());
                    editText5.setText(String.valueOf(v_dm*1000));
                    editText7.setText(String.valueOf(v_dm*0.001));
                }
                else if(TextUtils.isEmpty(editText6.getText())&&TextUtils.isEmpty(editText5.getText())){
                    double v_m=Double.valueOf(editText7.getText().toString());
                    editText5.setText(String.valueOf(v_m*1000));
                    editText6.setText(String.valueOf(v_m*1000000));
                }else{
                    Toast.makeText(ConversionActivity.this,"体积单位转换出现错误，请先清空",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button4:
                editText5.setText("");
                editText6.setText("");
                editText7.setText("");
                break;
            case R.id.button5:
                if(TextUtils.isEmpty(editText9.getText())&&TextUtils.isEmpty(editText10.getText())&&TextUtils.isEmpty(editText11.getText())){//输入的数为二进制（添加输入约束）
                    String binary=editText8.getText().toString();
                    System.out.println("测试！！！！！！！！！！！"+binary+"转十进制"+Integer.valueOf(binary,2).toString());
                    editText9.setText(Integer.toOctalString(Integer.parseInt(binary,2)).toString());
                    editText10.setText(Integer.valueOf(binary,2).toString());
                    editText11.setText(Integer.toHexString(Integer.parseInt(binary,2)).toString());
                }
                else if(TextUtils.isEmpty(editText8.getText())&&TextUtils.isEmpty(editText10.getText())&&TextUtils.isEmpty(editText11.getText())){//八进制
                    String octonary=editText9.getText().toString();
                    editText8.setText(Integer.toBinaryString(Integer.parseInt(octonary,8)).toString());
                    editText10.setText(Integer.valueOf(octonary,8).toString());
                    editText11.setText(Integer.toHexString(Integer.parseInt(octonary,8)).toString());
                }
                else if(TextUtils.isEmpty(editText8.getText())&&TextUtils.isEmpty(editText9.getText())&&TextUtils.isEmpty(editText11.getText())){//十进制
                    int decimalism=Integer.valueOf(editText10.getText().toString());
                    editText8.setText(Integer.toBinaryString(decimalism).toString());
                    editText9.setText(Integer.toOctalString(decimalism).toString());
                    editText11.setText(Integer.toHexString(decimalism).toString());
                }
                else if(TextUtils.isEmpty(editText8.getText())&&TextUtils.isEmpty(editText9.getText())&&TextUtils.isEmpty(editText10.getText())){//十六进制
                    String hexadecimal=editText11.getText().toString();
                    editText8.setText(Integer.toBinaryString(Integer.parseInt(hexadecimal,16)).toString());
                    editText9.setText(Integer.toOctalString(Integer.valueOf(hexadecimal,16)).toString());
                    editText10.setText(Integer.valueOf(Integer.parseInt(hexadecimal,16)).toString());
                }else {
                    Toast.makeText(ConversionActivity.this, "进制转换出现错误，请先清空", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button6:
                editText8.setText("");
                editText9.setText("");
                editText10.setText("");
                editText11.setText("");
                break;
        }
    }
}
