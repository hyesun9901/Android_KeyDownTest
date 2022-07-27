package com.hyesun.passwordeditmemorytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    char[] passwordTemp = new char[50];
    int editLength = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.passwordEdit);
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //keyCode = KeyEvent.KEYCODE_B;
                if (KeyEvent.ACTION_DOWN == event.getAction()) {
                    switch (keyCode) {
                        case KeyEvent.KEYCODE_Z: {
                            editLength++;
                            Toast.makeText(getApplicationContext(), "Z눌림", Toast.LENGTH_LONG).show();
                            String passwordStar = "";
                            for (int i = 0; i < editLength; i++) {
                                passwordStar = passwordStar + "*";
                            }
                            passwordTemp[editLength] = 'z';
                            editText.setText(passwordStar);
                            break;
                        }
                        case KeyEvent.KEYCODE_L: {
                            editLength++;
                            String passwordStar = "";
                            for (int i = 0; i < editLength; i++) {
                                passwordStar = passwordStar + "*";
                            }
                            passwordTemp[editLength] = 'l';
                            editText.setText(passwordStar);
                            break;
                        }
                        case KeyEvent.KEYCODE_F: {
                            editLength++;
                            String passwordStar = "";
                            for (int i = 0; i < editLength; i++) {
                                passwordStar = passwordStar + "*";
                            }
                            passwordTemp[editLength] = 'f';
                            editText.setText(passwordStar);
                            break;
                        }
                        case KeyEvent.KEYCODE_D: {
                            editLength++;
                            String passwordStar = "";
                            for (int i = 0; i < editLength; i++) {
                                passwordStar = passwordStar + "*";
                            }
                            passwordTemp[editLength] = 'd';
                            editText.setText(passwordStar);
                            break;
                        }
                        case KeyEvent.KEYCODE_S: {
                            editLength++;
                            String passwordStar = "";
                            for (int i = 0; i < editLength; i++) {
                                passwordStar = passwordStar + "*";
                            }
                            passwordTemp[editLength] = 's';
                            editText.setText(passwordStar);
                            break;
                        }
                        case KeyEvent.KEYCODE_1: {
                            editLength++;
                            String passwordStar = "";
                            for (int i = 0; i < editLength; i++) {
                                passwordStar = passwordStar + "*";
                            }
                            passwordTemp[editLength] = '1';
                            editText.setText(passwordStar);
                            break;
                        }

                    }
                }
                return true;
            }
        });
    }

    public void doLoginTest(View v) {
        //로그인 버튼 누름
        //로그인로직 이것저것 대충 했다치고...
        Arrays.fill(passwordTemp, (char) 0x20);
    }
}

