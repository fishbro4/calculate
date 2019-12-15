package com.example.newcalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static ArrayList list;
    private String string="";
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int orientation=getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.calculator_land);
            textView=(TextView) findViewById(R.id.textView);
            textView.setText("0");
            b1=(Button) findViewById(R.id.button1);
            b2=(Button) findViewById(R.id.button2);
            b3=(Button) findViewById(R.id.button3);
            b4=(Button) findViewById(R.id.button4);
            b5=(Button) findViewById(R.id.button5);
            b6=(Button) findViewById(R.id.button6);
            b7=(Button) findViewById(R.id.button7);
            b8=(Button) findViewById(R.id.button8);
            b9=(Button) findViewById(R.id.button9);
            b10=(Button) findViewById(R.id.button10);
            b11=(Button) findViewById(R.id.button11);
            b12=(Button) findViewById(R.id.button12);
            b13=(Button) findViewById(R.id.button13);
            b14=(Button) findViewById(R.id.button14);
            b15=(Button) findViewById(R.id.button15);
            b16=(Button) findViewById(R.id.button16);
            b17=(Button) findViewById(R.id.button17);
            b18=(Button) findViewById(R.id.button18);
            b19=(Button) findViewById(R.id.button19);
            b20=(Button) findViewById(R.id.button20);
            b21=(Button) findViewById(R.id.button21);
            b22=(Button) findViewById(R.id.button22);
            b23=(Button) findViewById(R.id.button23);
            b24=(Button) findViewById(R.id.button24);

            b1.setOnClickListener(this);
            b2.setOnClickListener(this);
            b3.setOnClickListener(this);
            b4.setOnClickListener(this);
            b5.setOnClickListener(this);
            b6.setOnClickListener(this);
            b7.setOnClickListener(this);
            b8.setOnClickListener(this);
            b9.setOnClickListener(this);
            b10.setOnClickListener(this);
            b11.setOnClickListener(this);
            b12.setOnClickListener(this);
            b13.setOnClickListener(this);
            b14.setOnClickListener(this);
            b15.setOnClickListener(this);
            b16.setOnClickListener(this);
            b17.setOnClickListener(this);
            b18.setOnClickListener(this);
            b19.setOnClickListener(this);
            b20.setOnClickListener(this);
            b21.setOnClickListener(this);
            b22.setOnClickListener(this);
            b23.setOnClickListener(this);
            b24.setOnClickListener(this);
        }else if(orientation==Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.calculator_port);
            textView=(TextView) findViewById(R.id.textView);
            textView.setText("0");
            b1=(Button) findViewById(R.id.button1);
            b2=(Button) findViewById(R.id.button2);
            b3=(Button) findViewById(R.id.button3);
            b4=(Button) findViewById(R.id.button4);
            b6=(Button) findViewById(R.id.button6);
            b7=(Button) findViewById(R.id.button7);
            b8=(Button) findViewById(R.id.button8);
            b9=(Button) findViewById(R.id.button9);
            b10=(Button) findViewById(R.id.button10);
            b12=(Button) findViewById(R.id.button12);
            b13=(Button) findViewById(R.id.button13);
            b14=(Button) findViewById(R.id.button14);
            b15=(Button) findViewById(R.id.button15);
            b16=(Button) findViewById(R.id.button16);
            b19=(Button) findViewById(R.id.button19);
            b20=(Button) findViewById(R.id.button20);
            b21=(Button) findViewById(R.id.button21);
            b22=(Button) findViewById(R.id.button22);
            b23=(Button) findViewById(R.id.button23);
            b24=(Button) findViewById(R.id.button24);

            b1.setOnClickListener(this);
            b2.setOnClickListener(this);
            b3.setOnClickListener(this);
            b4.setOnClickListener(this);
            b6.setOnClickListener(this);
            b7.setOnClickListener(this);
            b8.setOnClickListener(this);
            b9.setOnClickListener(this);
            b10.setOnClickListener(this);
            b12.setOnClickListener(this);
            b13.setOnClickListener(this);
            b14.setOnClickListener(this);
            b15.setOnClickListener(this);
            b16.setOnClickListener(this);
            b19.setOnClickListener(this);
            b20.setOnClickListener(this);
            b21.setOnClickListener(this);
            b22.setOnClickListener(this);
            b23.setOnClickListener(this);
            b24.setOnClickListener(this);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(MainActivity.this,"暂时没有帮助文档",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ConversionActivity.class);
                startActivity(intent);
                break;
            case R.id.item3:
                break;
            case R.id.item4:
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        int x=0;
        switch (view.getId()){
            case R.id.button1:
                string+="1";
                textView.setText(string);
                break;
            case R.id.button2:
                string+="2";
                textView.setText(string);
                break;
            case R.id.button3:
                string+="3";
                textView.setText(string);
                break;
            case R.id.button7:
                string+="4";
                textView.setText(string);
                break;
            case R.id.button8:
                string+="5";
                textView.setText(string);
                break;
            case R.id.button9:
                string+="6";
                textView.setText(string);
                break;
            case R.id.button13:
                string+="7";
                textView.setText(string);
                break;
            case R.id.button14:
                string+="8";
                textView.setText(string);
                break;
            case R.id.button15:
                string+="9";
                textView.setText(string);
                break;
            case R.id.button20:
                string+="0";
                textView.setText(string);
                break;


             //运算符

            case R.id.button19:
                string+="(";
                textView.setText(string);
                break;
            case R.id.button21:
                string+=")";
                textView.setText(string);
                break;


            case R.id.button4:
                string+="+";
                textView.setText(string);
                break;
            case R.id.button10:
                string+="-";
                textView.setText(string);
                break;
            case R.id.button16:
                string+="*";
                textView.setText(string);
                break;
            case R.id.button22:
                string+="/";
                textView.setText(string);
                break;

            case R.id.button5:
                string+="sin";
                textView.setText(string);
                break;
            case R.id.button11:
                string+="cos";
                textView.setText(string);
                break;
            case R.id.button17:
                string+="tan";
                textView.setText(string);
                break;
            case R.id.button23:
                string+=".";
                textView.setText(string);
                break;

            case R.id.button6://清除
                string="";
                textView.setText("0");
                break;
            case R.id.button12://回退
                if(textView.getText()!="0"){
                    string=string.substring(0,string.length()-1);
                    textView.setText(string);
                }else{
                    textView.setText("0");
                }
                break;
            case R.id.button18://求余
                string+="mod";
                textView.setText(string);
               break;
            case R.id.button24://等于
                textView.setText(result(string));
                break;

        }
    }
    private static String result(String string){
        list=new ArrayList<String>();
        String result=(parse(string.trim()));//trim()去掉两头空格
        String result_string=""+caculate(result);
        return result_string;
    }

    //该方法（）的内容由$在list中进行索引
    public static String parse(String s){
        int fir;
        int end;
        if((fir=s.lastIndexOf("("))!=-1)//存在“（”；fir的值为“（”最后出现的位置
        {
            for(int i=fir;i<s.length();i++)//i为“（”的index
            {
                if(s.charAt(i)==')')//获取到最后一个“（”之后的“）”
                {
                    end=i;
                    String str=s.substring(fir+1,end);//返回子字符串[fri+1,i]
                    String turnstr=s.substring(0, fir)+"$"+list.size()+s.substring(end+1, s.length());
                    list.add(str);
                    return parse(turnstr);
                }
            }
        }
        return s;
    }


    //递归运算法则求解
    public static double caculate(String s) {
            //递归求解,优先级从上往下
            if(s.lastIndexOf("+")!=-1||s.lastIndexOf("-")!=-1)
            {
                return jia_jian(s);
            }
            if(s.lastIndexOf("*")!=-1||s.lastIndexOf("/")!=-1 ||s.lastIndexOf("mod")!=-1)
            {
                return cheng_chu_mod(s);
            }

            if (s.indexOf("sin")==0)
            {
                return sin(s);
            }
            if (s.indexOf("cos")==0)
            {
                return cos(s);
            }
            if (s.indexOf("tan")==0)
            {
                return tan(s);
            }

            //最高优先级，将()看做一个字符串处理，由$索引在List中引用
            if (s.indexOf("$") == 0)
            {
                System.out.println();
                return $(s);
            }

            //运算将表达式拆解到无任何符号则直接返回该值
            return Double.parseDouble(s);

    }


    public static double jia_jian(String s)
    {
        if(s.lastIndexOf("+")-s.lastIndexOf("-")>0)
        {

            int i=s.lastIndexOf("+");
            System.out.println(s.substring(0,i).equals(""));
            return  (caculate(s.substring(0, i)))+caculate(s.substring(i+1, s.length()));
        }
        else
        {

            int i=s.lastIndexOf("-");
            return  (caculate(s.substring(0, i)))-caculate(s.substring(i+1, s.length()));
        }
    }


    public static double jia(String s)
    {
        String[] str = s.split("\\+");
        double d = str[0].equals("")?0:caculate(str[0]);
        for (int i = 1; i < str.length; i++) {
            d += caculate(str[i]);
        }
        return d;
    }
    public static double jian(String s)
    {
        String[] str = s.split("\\-");
        double d = str[0].equals("")?0:caculate(str[0]);
        for (int i = 1; i < str.length; i++) {
            d -= caculate(str[i]);
        }
        return d;
    }


    public static double cheng_chu_mod(String s)
    {
        int i1=s.lastIndexOf("*");
        int i2=s.lastIndexOf("/");
        int i3=s.lastIndexOf("mod");
        if( i1>i2 && i1 >i3 )
        {

            return  caculate(s.substring(0, s.lastIndexOf("*")))*caculate(s.substring(s.lastIndexOf("*")+1, s.length()));
        }
        else if( i2>i1 && i2 >i3 )
        {
            System.out.println("/");
            return  caculate(s.substring(0, s.lastIndexOf("/")))/caculate(s.substring(s.lastIndexOf("/")+1, s.length()));

        }
        else
        {
            System.out.println("%");
            return  caculate(s.substring(0, s.lastIndexOf("mod")))%caculate(s.substring(s.lastIndexOf("mod")+1, s.length()));

        }
    }

    public static double cheng(String s)
    {
        String[] str = s.split("\\*");
        double d =caculate(str[0]);
        for (int i = 1; i < str.length; i++) {
            d*=caculate(str[i]);
        }

        return d;
    }
    public static double chu(String s)
    {
        String[] str = s.split("\\/");
        double d =caculate(str[0]);
        for (int i = 1; i < str.length; i++) {
            d/=caculate(str[i]);
        }
        return d;
    }


    public static double $(String s)
    {
        //将$解析，在ArrayList的索引中取出字符加入到caculate方法中递归
        String[] str=s.split("\\$");
        return caculate((String)list.get(Integer.parseInt(str[1])));
    }

    private static double sin(String s) {
        String[] str=s.split("sin");
        return Math.sin(Math.PI/180*caculate(str[1]));
    }
    private static double cos(String s) {
        String[] str=s.split("cos");
        return Math.cos(Math.PI/180*caculate(str[1]));
    }
    private static double tan(String s) {
        String[] str=s.split("tan");
        return Math.tan(Math.PI/180*caculate(str[1]));
    }

}
