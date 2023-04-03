package com.kingmartinien.king_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodeResetVerificationActivity extends AppCompatActivity implements View.OnClickListener {

    private Button verifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_reset_verification);

        verifyButton = findViewById(R.id.button_verify);
        verifyButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.button_verify:
                Intent createNewPasswordIntent = new Intent(this, CreateNewPasswordActivity.class);
                startActivity(createNewPasswordIntent);
                break;
        }
    }
}