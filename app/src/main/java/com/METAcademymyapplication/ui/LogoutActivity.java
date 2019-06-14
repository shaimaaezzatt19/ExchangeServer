package com.METAcademymyapplication.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.METAcademymyapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LogoutActivity extends AppCompatActivity {

    @BindView(R.id.LogoutActivity_Logo)
    ImageView LogoutActivityLogo;
    @BindView(R.id.logoutbutton)
    Button logoutbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.LogoutActivity_Logo, R.id.logoutbutton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.LogoutActivity_Logo:
                break;
            case R.id.logoutbutton:
                Intent i =new Intent(LogoutActivity.this,MainActivity.class );
                startActivity(i);
                break;
        }
    }
}
