package com.example.graymonkey.statemachinedemo.states;

import android.os.Message;
import android.util.Log;

import com.example.graymonkey.statemachinedemo.stateMachineLib.State;
import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;

/**
 * Created by graymonkey on 18-1-7.
 */

public class BaseState extends State<TestStateMachine> implements IAction {

    protected BaseState(TestStateMachine sm) {
        super(sm);
    }

    @Override
    public void enter() {
        super.enter();
        Log.d("StateMachineTest", getName() + ":" + "enter");
    }

    @Override
    public void exit() {
        super.exit();
        Log.d("StateMachineTest", getName() + ":" + "exit");
    }

    @Override
    public boolean processMessage(Message msg) {
        Log.d("StateMachineTest", getName() + ":" + "processMsg--->what=" + msg.what);

        return NOT_HANDLED;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public void action1() {
        Log.d("StateMachineTest", getName() + ":" + "action1");
    }

    @Override
    public void action2() {
        Log.d("StateMachineTest", getName() + ":" + "action2");

    }

    @Override
    public void action3() {
        Log.d("StateMachineTest", getName() + ":" + "action3");


    }

    @Override
    public void action4() {
        Log.d("StateMachineTest", getName() + ":" + "action4");


    }

    @Override
    public void action5() {
        Log.d("StateMachineTest", getName() + ":" + "action5");

    }

    @Override
    public void action6() {
        Log.d("StateMachineTest", getName() + ":" + "action6");

    }
}
