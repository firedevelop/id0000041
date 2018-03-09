package com.gmail.rishabh23jain.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import java.sql.Types.*;

public class MainActivity extends AppCompatActivity {

     Button bOne,bTwo,bThree,bFour,bFive,bSix,bSeven,bEight,bNine,bAdd,bSub,bMul,bDiv,bCe,bClear,bEqual,bZero;
    TextView txtViewInput,txtViewResult;
    String s="",s1="",s2="",resultString="";
    int i=0,i1=0,c=-1;
    int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bOne=(Button) findViewById(R.id.one);
        bTwo=(Button)findViewById(R.id.two);
        bThree=(Button)findViewById(R.id.three);
        bFour=(Button)findViewById(R.id.four);
        bFive=(Button)findViewById(R.id.five);
        bSix=(Button)findViewById(R.id.six);
        bSeven=(Button)findViewById(R.id.seven);
        bEight=(Button)findViewById(R.id.eight);
        bNine=(Button)findViewById(R.id.nine);
        bAdd=(Button)findViewById(R.id.add);
        bSub=(Button)findViewById(R.id.subtract);
        bMul=(Button)findViewById(R.id.multiply);
        bDiv=(Button)findViewById(R.id.divide);
        bCe=(Button)findViewById(R.id.reset);
        bClear=(Button)findViewById(R.id.Clear);
        bEqual=(Button)findViewById(R.id.equal);
        bZero=(Button)findViewById(R.id.zero);
        txtViewInput=(TextView)findViewById(R.id.textViewInput);
        txtViewResult=(TextView)findViewById(R.id.textViewResult);

        bOne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"1");
                s="";
            }
        });
        bTwo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"2");
                s="";
            }
        });
        bThree.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"3");
                s="";
            }
        });
        bFour.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"4");
                s="";
            }
        });
        bFive.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"5");
                s="";
            }
        });
        bSix.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"6");
                s="";
            }
        });
        bSeven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"7");
                s="";
            }
        });
        bEight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"8");
                s="";
            }
        });
        bNine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"9");
                s="";
            }
        });
        bZero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
                {
                    txtViewResult.setText("");
                    s="";
                }
                txtViewResult.setText(s+"0");
                s="";
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String temp=(String)txtViewResult.getText();
                if(temp.isEmpty())
                {
                    s1="0";
                }
                else if(!temp.equals("+") && !temp.equals("-") && !temp.equals("/") && !temp.equals("*"))
                {
                    s1=temp;
                }
                c=0;
                resultString="";
                txtViewResult.setText("+");
                txtViewInput.setText(s1 + "+");
            }
        });
        bSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String temp=(String)txtViewResult.getText();
                if(temp.isEmpty())
                {
                    s1="0";
                }
                else if(!temp.equals("+") && !temp.equals("-") && !temp.equals("/") && !temp.equals("*"))
                {
                    s1=temp;
                }
                c=1;
                resultString="";
                txtViewResult.setText("-");
                txtViewInput.setText(s1 + "-");
            }
        });
        bMul.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String temp=(String)txtViewResult.getText();
                if(temp.isEmpty())
                {
                    s1="0";
                }
                else if(!temp.equals("+") && !temp.equals("-") && !temp.equals("/") && !temp.equals("*"))
                {
                    s1=temp;
                }
                c=3;
                resultString="";
                txtViewResult.setText("*");
                txtViewInput.setText(s1 + "*");
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String temp=(String)txtViewResult.getText();
                if(temp.isEmpty())
                {
                    s1="0";
                }
                else if(!temp.equals("+") && !temp.equals("-") && !temp.equals("/") && !temp.equals("*"))
                {
                    s1=temp;
                }
                c=2;
                resultString="";
                txtViewResult.setText("/");
                txtViewInput.setText(s1 + "/");
            }
        });

        bEqual.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String operator="";
                if(s1.equalsIgnoreCase("+") || s1.equalsIgnoreCase("-") || s1.equalsIgnoreCase("/") || s1.equalsIgnoreCase("*"))
                {
                    i=0;
                }else if(s1==null || s1.isEmpty())
                {
                    i=0;
                }else
                {
                    i=Integer.parseInt(s1);
                }

                if(resultString.isEmpty())
                {
                    s2=(String)txtViewResult.getText();
                    if(s2.equalsIgnoreCase("+") || s2.equalsIgnoreCase("-") || s2.equalsIgnoreCase("/") || s2.equalsIgnoreCase("*"))
                    {
                        i1=0;
                    }else if(s2==null || s2.isEmpty())
                    {
                        i1=0;
                    }else
                    {
                        i1=Integer.parseInt(s2);
                    }
                }
                else
                {
                    i=result;
                }

                if(c==0)
                {
                    operator="+";
                    result=i+i1;
                }else if(c==1)
                {
                    operator="-";
                    result=i-i1;
                }else if(c==2)
                {
                    operator="/";
                            if(i1==0)
                            {
                                Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                                result=0;
                            }
                            else
                            {
                                result=i/i1;
                            }
                }else if(c==3)
                {
                    operator="*";
                    result=i*i1;
                }else
                {
                    operator="";
                    result=0;
                }
                if(!operator.isEmpty())
                {
                    txtViewInput.setText(i + " " + operator + " " + i1);

                }else{
                    txtViewInput.setText("");
                }

                resultString=String.valueOf(result);
                txtViewResult.setText(resultString);
            }
        });

        bClear.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                s=(String)txtViewResult.getText();
                if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("")){
                    i=0;
                }else
                {
                    i=Integer.parseInt(s);
                    i=i/10;
                }
                if(i==0)
                {
                    txtViewResult.setText("");
                }
                else
                {
                    txtViewResult.setText(i + "");
                }
                s=null;
            }

        });

        bCe.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                txtViewResult.setText("");
                txtViewInput.setText("");
                i=0;
                i1=0;
                s1="";
                s2="";
                resultString="";
                c=-1;
                result=0;
            }
        });



    }
}
