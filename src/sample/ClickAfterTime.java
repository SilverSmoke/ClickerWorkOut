package sample;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;

public class ClickAfterTime extends Thread{

    private final Integer time;
    private final boolean shootdown;

    public ClickAfterTime(Integer timeOut, boolean selected) {

        this.time = timeOut;
        this.shootdown = selected;
        System.out.println(timeOut);
        System.out.println(selected);
    }

    public void run() {

        try {
            Thread.sleep(this.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        if(shootdown) {
            try {
                ShootDown.shutdown();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
