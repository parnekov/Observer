package com.parnekov.sasha.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserActivity extends AppCompatActivity implements Observer {
    @BindView(R.id.tv_name)
    TextView mTextViewName;

    @BindView(R.id.tv_age)
    TextView mTextViewAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void update(Observable observable, Object o) {

    }
}
