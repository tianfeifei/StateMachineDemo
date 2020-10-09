package com.example.graymonkey.statemachinedemo.states;

import com.example.graymonkey.statemachinedemo.stateMachineLib.State;
import com.example.graymonkey.statemachinedemo.stateMachineLib.StateMachine;


/**
 * Created by graymonkey on 18-1-6.
 * StateMachine类的构造函数是Protect访问权限，所以只能通过继承实现实例化
 */

public class TestStateMachine extends StateMachine implements IAction {

    public State<TestStateMachine> s1,s2,p1,p2;

    /*** 事件*/
    public static final int MSG_1 = 1;
    public static final int MSG_2 = 2;
    public static final int MSG_3 = 3;
    public static final int MSG_4 = 4;
    public static final int MSG_5 = 5;
    public static final int MSG_6 = 6;
    public static final int MSG_RESET_TO_DEFAULT = 0;


    public TestStateMachine(String name) {
        super(name);
        constructStatesHierarchy();
    }
    /**
     * 构造状态层次结构（树形结构，可多棵）
     */
    private void constructStatesHierarchy(){
     
        s1 = new S1(this);
        s2 = new S2(this);
        p1 = new P1(this);
        p2 = new P2(this);

        //按状态顺序添加专题，没有构建树结构
        addState(p1);
        addState(s1);
        addState(s2);
        addState(p2);

        setInitialState(p1);
    }

    @Override
    public void action1() {
        sendMessage(MSG_1);
    }

    @Override
    public void action2() {
        sendMessage(MSG_2);
    }

    @Override
    public void action3() {
        sendMessage(MSG_3);

    }

    @Override
    public void action4() {
        sendMessage(MSG_4);
    }

    @Override
    public void action5() {
        sendMessage(MSG_5);
    }

    @Override
    public void action6() {
        sendMessage(MSG_6);

    }
}
