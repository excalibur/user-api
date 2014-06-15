package org.fightteam.excalibur.core.a;

/**
 * Created by excalibur on 2014/6/15.
 */
public class CountImpl implements Count {
    @Override
    public void queryCount() {
        System.out.println("查看账户方法...");
    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法...");
    }
}
