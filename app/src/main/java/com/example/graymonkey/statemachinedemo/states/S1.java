package com.example.graymonkey.statemachinedemo.states;

import android.os.Message;
import android.util.Log;

import com.example.graymonkey.statemachinedemo.stateMachineLib.State;
import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;

/**
 * Created by graymonkey on 18-1-6.
 */

public class S1 extends BaseState {


    protected S1(TestStateMachine sm) {
        super(sm);
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public void exit() {
        super.exit();
    }

    @Override
    public boolean processMessage(Message msg) {
        super.processMessage(msg);
        boolean result;
        switch (msg.what) {
            case TestStateMachine.MSG_1:
                //第一步：做此状态收到事件1时应该做的事；
                action1();
                //第二步：扭转此状态的下一个状态；
                mSm.transitionTo(mSm.s2);
                result = HANDLED;
                break;
            default:
                //其他事件不处理
                result = NOT_HANDLED;
                break;
        }
        return result;
    }

}
