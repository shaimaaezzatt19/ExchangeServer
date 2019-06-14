package com.METAcademymyapplication.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.METAcademymyapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class GOActivity extends AppCompatActivity {

    @BindView(R.id.Main_Send)
    Button MainSend;
    @BindView(R.id.Main_Recive)
    Button MainRecive;
    @BindView(R.id.Main_Mail)
    Button MainMail;
    @BindView(R.id.LogOut)
    Button LogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.Main_Send, R.id.Main_Recive, R.id.Main_Mail, R.id.LogOut})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.Main_Send:
                Intent i = new Intent(GOActivity.this, SendActivity.class);
                startActivity(i);
                break;
            case R.id.Main_Recive:
                Intent i2 = new Intent(GOActivity.this, ReciveActivity.class);
                startActivity(i2);
                break;
            case R.id.Main_Mail:
                Intent b =new Intent(Intent.ACTION_VIEW);
                b.setData((Uri.parse("https://mm.misr.academy")));
                startActivity(b);
                Intent i5 =new Intent(Intent.ACTION_VIEW);
                i5.setData((Uri.parse("https://mm.misr.academy")));
                startActivity(i5);
                break;
            case R.id.LogOut:
                Intent i4 = new Intent(GOActivity.this, LogoutActivity.class);
                startActivity(i4);
                break;
        }
    }
}