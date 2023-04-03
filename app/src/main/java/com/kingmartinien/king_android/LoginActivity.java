package com.kingmartinien.king_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton backButton;
    private TextView registerTextView;
    private TextView forgotPasswordTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        backButton = findViewById(R.id.button_back);
        registerTextView = findViewById(R.id.textview_register);
        forgotPasswordTextView = findViewById(R.id.forgot_password_textview);

        backButton.setOnClickListener(this);
        registerTextView.setOnClickListener(this);
        forgotPasswordTextView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch (viewId) {
            case R.id.button_back:
                System.out.println("Button back was clicked!");
                this.finish();
                break;
            case R.id.textview_register:
                System.out.println("going to register activity... ");
                Intent registerActivityIntent = new Intent(this, RegisterActivity.class);
                startActivity(registerActivityIntent);
                break;
            case R.id.forgot_password_textview:
                System.out.println("Navigating to forget password...");
                Intent forgetPasswordIntent = new Intent(this, ForgetPasswordActivity.class);
                startActivity(forgetPasswordIntent);
                break;
        }
    }
}