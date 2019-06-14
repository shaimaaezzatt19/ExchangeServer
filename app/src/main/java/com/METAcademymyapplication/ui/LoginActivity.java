package com.METAcademymyapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.METAcademymyapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.Login_Email)
    TextView LoginEmail;
    @BindView(R.id.Login_Pass)
    TextView LoginPass;
    @BindView(R.id.Login_button)
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
 }

    public void OpenServer(View view) {
        String Email = LoginEmail.getText().toString().trim();
        String password = LoginPass.getText().toString().trim();


        if (Email.trim().equals("A.Waheed@misr.academy") && password.trim().equals("P@ss0rd")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);


        } else if (Email.trim().equals("S.ezzat@misr.academy") && password.equals("P@ss0rd")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        } else if (Email.trim().equals("S.gamal@misr.academy") && password.equals("P@ss0rd")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        } else if (Email.trim().equals("M.saleh@misr.academy") && password.equals("P@ss0rd")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        } else if (Email.trim().equals("M.bade3@misr.academy") && password.equals("P@ss0rd")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);

        } else if (Email.trim().equals("A.eldemoksy@misr.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("A.elnamory.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("S.khaled@misr.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("A.essa@misr.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("M.sayed@misr.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("M.ftouh@misr.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("M.mohsen@misr.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else if (Email.trim().equals("M.attia.academy") && password.equals("123456")) {
            Toast.makeText(view.getContext(), "WElcome", Toast.LENGTH_LONG).show();
            Intent i = new Intent(LoginActivity.this, GOActivity.class);
            startActivity(i);
        }
        else
        {
            Toast.makeText(view.getContext(), "wrong", Toast.LENGTH_LONG).show();
            Intent b = new Intent(LoginActivity.this, WrongActivity.class);
            startActivity(b);
        }
        LoginEmail.setText("");
        LoginPass.setText("");

}


    @OnClick({R.id.Login_Email, R.id.Login_Pass, R.id.Login_button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Login_Email:
                break;
            case R.id.Login_Pass:
                break;
            case R.id.Login_button:
                break;
        }
    }
}
