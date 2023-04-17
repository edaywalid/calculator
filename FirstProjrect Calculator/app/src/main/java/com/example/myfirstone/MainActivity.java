package com.example.myfirstone;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;

import android.view.View;

import android.widget.EditText;

import android.widget.Toast;

import org.mariuszgromada.math.mxparser.*;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    private EditText display;
    private boolean pointentered = false;
    private boolean checkedanswer;
    private boolean memorizeANS = false;
    private boolean usingANS = false;
    private boolean maxnumber = false;
    private int countnumber=1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.input);
        display.setShowSoftInputOnFocus(false);


        display.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (countnumber == 11) {
                    maxnumber=true;
                }

//
            }

            @Override
            public void afterTextChanged(Editable s) {

            }

        });

    }

    Stack <String> memoire = new Stack<>();
    Stack <Boolean> pointstatus = new Stack<>();
    Stack <Boolean> maxnumberstatus = new Stack<>();
    Stack <Integer> numbercounter = new Stack<>();

    private void updtaeTXT(String newTXT) {
        String oldTXT = display.getText().toString();
        int curposition = display.getSelectionStart();
        String lefttxt = oldTXT.substring(0, curposition);
        String righttxt = oldTXT.substring(curposition);
        if (getString(R.string.displaytext).equals(display.getText().toString())) {
            display.setText(newTXT);
            display.setSelection(curposition + 1);
        }
        else {
            display.setText(String.format("%s%s%s", lefttxt, newTXT, righttxt));
            display.setSelection(curposition + 1);
        }
        try {
            int num = Integer.parseInt(newTXT);
            countnumber++;
        }catch (NumberFormatException e){

        }

    }



    public void zerobtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer) {
            display.setText("0");
            countnumber=1;
            pointstatus.add(pointentered);
            display.setSelection(display.getSelectionStart() + 1);
        }
        else if (!maxnumber && !display.getText().toString().equals(getString(R.string.displaytext))){
            updtaeTXT("0");

        }
    }

    public void ontbtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            display.setText("1");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("1");

        }
    }

    public void twobtn(View Button) {

        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            display.setText("2");
            display.setSelection(display.getSelectionStart() + 1);
            countnumber=1;
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("2");
            numbercounter.add(countnumber);

        }
    }

    public void threebtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            display.setText("3");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("3");

        }
    }

    public void fourbtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            display.setText("4");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("4");

        }
    }

    public void fivebtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            display.setText("5");
            countnumber=1;
            checkedanswer = false;
            display.setSelection(display.getSelectionStart() + 1);

        } else if (!maxnumber) {
            updtaeTXT("5");

        }
    }

    public void sexbtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            display.setText("6");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("6");

        }
    }

    public void sevenbtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            display.setText("7");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("7");


        }
    }

    public void eightbtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            display.setText("8");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("8");

        }
    }

    public void ninebtn(View Button) {
        maxnumberstatus.add(maxnumber);
        numbercounter.add(countnumber);
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            display.setText("9");
            countnumber=1;
            display.setSelection(display.getSelectionStart() + 1);
            checkedanswer = false;
        } else if (!maxnumber) {
            updtaeTXT("9");

        }
    }

    @SuppressLint("SetTextI18n")
    public void plusbtn(View Button) {
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            checkedanswer = false;
            display.setText("+");
            display.setSelection(display.getSelectionStart() + 1);

        }else {
            updtaeTXT("+");
        }
        if (memorizeANS) {
            display.setText("Ans+");
            display.setSelection(4);
            memorizeANS = false;
            usingANS = true;
        }
        pointstatus.add(pointentered);
        pointentered = false;
        numbercounter.add(countnumber);
        maxnumberstatus.add(maxnumber);
        countnumber=0;
        maxnumber=false;


    }

    @SuppressLint("SetTextI18n")
    public void minusbtn(View Button) {
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext))) {
            checkedanswer = false;
            display.setText("-");
            display.setSelection(display.getSelectionStart() + 1);
        }else  {
            updtaeTXT("-");
        }
        if (memorizeANS) {
            display.setText("Ans-");
            display.setSelection(4);
            memorizeANS = false;
            usingANS = true;
        }
        pointstatus.add(pointentered);
        pointentered = false;
        maxnumberstatus.add(maxnumber);
        maxnumber=false;
        numbercounter.add(countnumber);
        countnumber=0;


    }

    @SuppressLint("SetTextI18n")
    public void multbtn(View Button) {
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            checkedanswer = false;
            display.setText("0*");
            display.setSelection(display.getSelectionStart() + 2);
        }else  {
            updtaeTXT("*");
        }
        if (memorizeANS) {
            display.setText("Ans*");
            display.setSelection(4);
            memorizeANS = false;
            usingANS = true;
        }
        pointstatus.add(pointentered);
        pointentered = false;
        maxnumberstatus.add(maxnumber);
        maxnumber=false;
        numbercounter.add(countnumber);
        countnumber=0;

    }

    @SuppressLint("SetTextI18n")
    public void divisionbtn(View Button) {
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            checkedanswer = false;
            display.setText("0/");
            display.setSelection(display.getSelectionStart() + 2);
        }else  {
            updtaeTXT("/");
        }
        if (memorizeANS) {
            display.setText("Ans/");
            display.setSelection(4);
            memorizeANS = false;
            usingANS = true;
        }
        pointstatus.add(pointentered);
        pointentered = false;
        maxnumberstatus.add(maxnumber);
        maxnumber=false;
        numbercounter.add(countnumber);
        countnumber=0;

    }

    public void clearbutton(View Button) {
        display.setText("0");
        memorizeANS = false;
        pointentered = false;
        usingANS = false;
        if (!memoire.empty()){
            memoire.clear();
        }
        maxnumber=false;
        countnumber=0;
    }

    @SuppressLint("SetTextI18n")
    public void percentage(View Button) {
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            checkedanswer = false;
            display.setText("0%");
            display.setSelection(display.getSelectionStart() + 2);
        }else if (!maxnumber) {
            updtaeTXT("%");
        }
        if (memorizeANS) {
            display.setText("Ans%");
            display.setSelection(4);
            memorizeANS = false;
            usingANS = true;
        }
    }

    public void backspacebutton(View Button) {
        int cursP = display.getSelectionStart();
        int length = display.getText().length();
        if (length != 0 && cursP != 0) {
            if (display.getText().toString().charAt(length - 1) == '.'||display.getText().toString().charAt(length - 1) == '+'||display.getText().toString().charAt(length - 1) == '-'||display.getText().toString().charAt(length - 1) == '*'||display.getText().toString().charAt(length - 1) == '/'||display.getText().toString().charAt(length - 1) == '('||display.getText().toString().charAt(length - 1) == ')') {
                pointentered = pointstatus.pop();

            }if (display.getText().toString().charAt(length - 1) == '+'||display.getText().toString().charAt(length - 1) == '-'||display.getText().toString().charAt(length - 1) == '*'||display.getText().toString().charAt(length - 1) == '/'||display.getText().toString().charAt(length - 1) == '('||display.getText().toString().charAt(length - 1) == ')') {
                countnumber=numbercounter.pop();
                maxnumber=maxnumberstatus.pop();

            }else{
                if (countnumber>11){
                    countnumber=11;
                }
                countnumber-=1 ;
                maxnumber=false;
            }

            SpannableStringBuilder mine = (SpannableStringBuilder) display.getText();
            mine.replace(cursP - 1, cursP, "");
            display.setText(mine);
            display.setSelection(cursP - 1);
            if (length == 1){
                pointentered=false;
            }
        }



    }

    @SuppressLint("SetTextI18n")
    public void equalbtn(View Button) {
        String userinputs;
        String exposentvalue;
        if (display.getText().length()!=0){
            if (!usingANS) {
                userinputs = display.getText().toString();
            } else {

                userinputs = memoire.peek() + display.getText().toString().substring(3);
            }
            if ("0^0".equals(userinputs)) {
                memoire.add("NaN");
                display.setText("NaN");
                display.setSelection(3);
            }else {
                Expression calculating = new Expression(userinputs);
                String result = String.valueOf(calculating.calculate());

                if (result.length() > 12 ) {
                    if(result.indexOf("E") >= 10){
                        int Eposition = result.indexOf("E");
                        exposentvalue = result.substring(Eposition + 1);
                        result = result.substring(0, 12 - exposentvalue.length() - 1);
                        result = result + "E" + exposentvalue;
                    }else {

                        result = result.substring(0,12);
                    }
                }
                memoire.add(result);
                display.setText(result);
                display.setSelection(result.length());
            }
            memorizeANS = true;
            checkedanswer = true;
            pointentered = false;
        }else{
            display.setText("0");
        }
    }



    public void bracket(View Button) {

        int closeBra =0;
        int openBra =0;
        int textlen = display.getText().length();
        int CursorPos = display.getSelectionStart();
        pointstatus.add(pointentered);
        for (int i = 0; i <CursorPos ; i++) {
            if (display.getText().toString().charAt(i) == '('){
                openBra++;

            }
            if (display.getText().toString().charAt(i) == ')'){
                closeBra++;
            }
        }
        if (checkedanswer){
            checkedanswer=false;
        }
        if (!maxnumber){
            if (display.getText().toString().equals(getString(R.string.displaytext))) {
                display.setText("(");
                display.setSelection(display.getSelectionStart() + 1);
            } else if (openBra == closeBra || display.getText().toString().charAt(textlen - 1) == '(') {
                updtaeTXT("(");
            } else if (closeBra < openBra && display.getText().toString().charAt(textlen - 1) != '(') {
                updtaeTXT(")");
            }
                pointentered=false;
        }

    }

    @SuppressLint("SetTextI18n")
    public void powbtn (View Button) {
        if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) ) {
            checkedanswer = false;
            display.setText("0^");
            display.setSelection(display.getSelectionStart() + 2);
        }else if (!maxnumber) {
            updtaeTXT("^");
        }
        if (memorizeANS) {
            display.setText("Ans^");
            display.setSelection(4);
            memorizeANS = false;
            usingANS = true;
        }
    }
    public void pointbtn (View Button ){
        int length = display.getText().length();
        if (!pointentered){
             if (checkedanswer ||display.getText().toString().equals(getString(R.string.displaytext)) || display.getText().toString().length()==0 ) {
                 checkedanswer = false;
                 display.setText("0.");
                 display.setSelection(display.getSelectionStart() + 2);
                 pointstatus.add(pointentered);
                 pointentered=true;
             }else if (!maxnumber && display.getText().toString().charAt(length-1) == '(') {
                 checkedanswer = false;
                 updtaeTXT("0.");
                 display.setSelection(display.getSelectionStart() + 1);
                 pointstatus.add(pointentered);
                 pointentered=true;
             }else if (!maxnumber  && display.getText().toString().charAt(length-1) == ')') {
                 checkedanswer = false;
                 updtaeTXT("*0.");
                 display.setSelection(display.getSelectionStart() + 2);
                 pointstatus.add(pointentered);
                 pointentered=true;
             }else if (!maxnumber ) {
                 updtaeTXT(".");
            pointstatus.add(pointentered);
             pointentered=true;
             }


        }


    }

}