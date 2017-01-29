package com.jz.mchacks;

/**
 * Created by jz on 2017-01-28.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class UI extends Applet {
    Choice temperaturesMin, temperaturesMax, humidityMin, humidityMax;
    int tMin, tMax, hMin, hMax;

    public void init() {

        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == temperaturesMin)
                    tMin = Integer.parseInt(e.getItem().toString());
                else if (e.getSource() == temperaturesMax)
                    tMax = Integer.parseInt(e.getItem().toString());
                else if (e.getSource() == temperaturesMax)
                    hMin = Integer.parseInt(e.getItem().toString());
                else
                    hMax = Integer.parseInt(e.getItem().toString());
                System.out.println(e.getItem().toString());
            }
        };

        temperaturesMin = new Choice();
        temperaturesMin.add("17");
        temperaturesMin.add("18");
        temperaturesMin.addItemListener(listener);
        add(temperaturesMin);

        temperaturesMax = new Choice();
        temperaturesMax.add("22");
        temperaturesMax.add("23");
        temperaturesMax.addItemListener(listener);
        add(temperaturesMax);

        humidityMin = new Choice();
        humidityMin.add("17");
        humidityMin.add("18");
        humidityMin.addItemListener(listener);
        add(humidityMin);

        humidityMax = new Choice();
        humidityMax.add("22");
        humidityMax.add("23");
        humidityMax.addItemListener(listener);
        add(humidityMax);
/*        button1 = new Button("Button 1");
        add(button1);
        button1.addActionListener(this);

        button2 = new Button("Button 2");
        add(button2);
        button2.addActionListener(this);*/
    }

/*   public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1)
            System.out.println("Button 1 was pressed");
        else
            System.out.println("Button 2 was pressed");
    }
*/
    Button button1, button2;
}