package com.kingmartinien.king_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CreateNewPasswordActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton backButton;
    private Button resetPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_password);

        resetPasswordButton = findViewById(R.id.button_reset_password);
        backButton = findViewById(R.id.button_back);

        resetPasswordButton.setOnClickListener(this);
        backButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();

        switch (viewId) {
            case R.id.button_reset_password:
                System.out.println("Going to login...");
                Intent loginIntent = new Intent(this, LoginActivity.class);
                startActivity(loginIntent);
                break;

            case R.id.button_back:
                this.finish();
                break;
        }
    }
}