package kz.course.lessonbymari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button7, button8, button9, button4, button5, button6, button1, button2, button3, button0, button36;
    TextView tvSan;
    Button btndel, btnplusiminus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_four);
        button7 = findViewById(R.id.btn7);
        btndel = findViewById(R.id.btndel);
        btnplusiminus = findViewById(R.id.btnplusiminus);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button0 = findViewById(R.id.btn0);
        button36 = findViewById(R.id.btn36);
        tvSan = findViewById(R.id.tv_san);

        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldingiSan = tvSan.getText().toString();
                String basilSan = "";
                switch (view.getId()) {
                    case R.id.btn7:

                        if (aldingiSan.equals("0")){
                            basilSan = "7";
                        }else {
                            basilSan = aldingiSan + "7";
                        }
                        break;

                    case R.id.btn8:

                        if (aldingiSan.equals("0")){
                            basilSan = "8";
                        }else {
                            basilSan = aldingiSan + "8";
                        }
                        break;
                    case R.id.btn9:

                        if (aldingiSan.equals("0")){
                            basilSan = "9";
                        }else {
                            basilSan = aldingiSan + "9";
                        }
                        break;


                    case R.id.btn0:
                        if (aldingiSan.equals("0")){
                            basilSan = "0";
                        }else {
                            basilSan = aldingiSan + "0";
                        }
                        break;

                    case R.id.btn1:

                        if (aldingiSan.equals("0")){
                            basilSan = "1";
                        }else {
                            basilSan = aldingiSan + "1";
                        }
                        break;
                    case R.id.btn2:

                        if (aldingiSan.equals("0")){
                            basilSan = "2";
                        }else {
                            basilSan = aldingiSan + "2";
                        }
                        break;

                    case R.id.btn3:
                        if (aldingiSan.equals("0")){
                            basilSan = "3";
                        }else {
                            basilSan = aldingiSan + "3";
                        }
                        break;

                    case R.id.btn4:

                        if (aldingiSan.equals("0")){
                            basilSan = "4";
                        }else {
                            basilSan = aldingiSan + "4";
                        }
                        break;

                    case R.id.btn5:

                        if (aldingiSan.equals("0")){
                            basilSan = "5";
                        }else {
                            basilSan = aldingiSan + "5";
                        }
                        break;
                    case R.id.btn6:

                        if (aldingiSan.equals("0")){
                            basilSan = "6";
                        }else {
                            basilSan = aldingiSan + "6";
                        }
                        break;

                    case R.id.btn36:

                        if (aldingiSan.equals("0")){
                            basilSan = ".";
                        }else {
                            basilSan = aldingiSan + ".";
                        }
                        break;

                }
                tvSan.setText(basilSan);
            }
        };


        button7.setOnClickListener(buttonSandar);
        button8.setOnClickListener(buttonSandar);
        button9.setOnClickListener(buttonSandar);
        button4.setOnClickListener(buttonSandar);
        button5.setOnClickListener(buttonSandar);
        button6.setOnClickListener(buttonSandar);
        button1.setOnClickListener(buttonSandar);
        button2.setOnClickListener(buttonSandar);
        button3.setOnClickListener(buttonSandar);
        button36.setOnClickListener(buttonSandar);
        button0.setOnClickListener(buttonSandar);

        View.OnClickListener btndelplusiminus = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btndel:
                        tvSan.setText("0");
                        break;
                    case R.id.btnplusiminus:
                        String santext = tvSan.getText().toString();
                        int san = Integer.parseInt(santext);

                        if(san > 0) tvSan.setText("-"+santext);
                        else{
                            san = san * (-1);
                            tvSan.setText(""+san);
                        }


                        break;
                }
            }
        };
        btndel.setOnClickListener(btndelplusiminus);
        btnplusiminus.setOnClickListener(btndelplusiminus);
    }
}