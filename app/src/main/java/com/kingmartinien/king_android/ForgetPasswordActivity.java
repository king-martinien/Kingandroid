package com.kingmartinien.king_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ForgetPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton backButton;
    private Button sendCodeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        backButton = findViewById(R.id.button_back);
        sendCodeButton = findViewById(R.id.send_code_button);

        backButton.setOnClickListener(this);
        sendCodeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch (viewId) {
            case R.id.button_back:
                System.out.println("Navigating back...");
                this.finish();
                break;

            case R.id.send_code_button:
                System.out.println("Getting The code Validation...");
                Intent codeResetVerificationIntent = new Intent(this, CodeResetVerificationActivity.class);
                startActivity(codeResetVerificationIntent);
                break;
        }
    }
}