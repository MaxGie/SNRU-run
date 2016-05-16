package snru.srisuk.wasan.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, UserEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1radioButton, choice2radioButton, choice3radioButton,
            choice4radioButton, choice5radioButton;
    private String nameString, userString, passwordString, avataString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Bind Widget
        bindWidget();


    }//Main Method

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        UserEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvata);
        choice1radioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2radioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3radioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4radioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5radioButton = (RadioButton) findViewById(R.id.radioButton5);

    }

    public void clickSignUpSign(View view) {

        //Get Value From EditText
        nameString = nameEditText.getText().toString().trim();
        userString = UserEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") ||userString.equals("") ||passwordString.equals("") ) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง", "กรุณากรอกทุกช่องด้วยนะครับ");

        } else {

        }

    }

}//Main Class
