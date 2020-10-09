package com.example.graymonkey.statemachinedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;
import com.example.graymonkey.statemachinedemo.states.TestStateMachine;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TestStateMachine mSm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSm = new TestStateMachine("stateMachine");
        setupView();
        //状态机开始
        mSm.start();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //状态机退出
        mSm.quitNow();
    }

    private void setupView() {
        findViewById(R.id.API1).setOnClickListener(this);
        findViewById(R.id.API2).setOnClickListener(this);
        findViewById(R.id.API3).setOnClickListener(this);
        findViewById(R.id.API4).setOnClickListener(this);
        findViewById(R.id.API5).setOnClickListener(this);
        findViewById(R.id.API6).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.API1:
                mSm.action1();
                break;
            case R.id.API2:
                mSm.action2();
                break;
            case R.id.API3:
                mSm.action3();
                break;
            case R.id.API4:
                mSm.action4();
                break;
            case R.id.API5:
                mSm.action5();

                break;
            case R.id.API6:
                mSm.action6();
                break;
            default:
        }
    }
}
