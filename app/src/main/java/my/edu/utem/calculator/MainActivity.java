package my.edu.utem.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstText;
    EditText secondText;
    TextView answerText;
    double answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstText=findViewById(R.id.first_editText);
        secondText=findViewById(R.id.second_editText);
        answerText=findViewById(R.id.answer_textView);
    }

    public void add(View view) {
        answer = Double.parseDouble(firstText.getText().toString())+Double.parseDouble(secondText.getText().toString());
        answerText.setText(answer+"");

    }

    public void sub(View view) {
        answer = Double.parseDouble(firstText.getText().toString())-Double.parseDouble(secondText.getText().toString());
        answerText.setText(answer+"");
    }

    public void mul(View view) {
        answer = Double.parseDouble(firstText.getText().toString())*Double.parseDouble(secondText.getText().toString());
        answerText.setText(answer+"");
    }

    public void div(View view) {
        if(Double.parseDouble(secondText.getText().toString()) == 0) {
            Toast.makeText(MainActivity.this, "Second Number Could Not Be 0", Toast.LENGTH_LONG).show();
        }
        else{
            answer = Double.parseDouble(firstText.getText().toString())/Double.parseDouble(secondText.getText().toString());
            answerText.setText(answer+"");
        }
    }
}
