package com.company.airport.ui;

import com.company.airport.ui.forms.AirportForm;
import com.company.airport.ui.forms.RouteForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@Component
public class MainFrame extends JFrame {

    @Autowired
    public MainFrame(AirportForm airportForm) throws HeadlessException {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400, 400));

        setContentPane(airportForm.$$$getRootComponent$$$());
        airportForm.updateData();

        pack();
    }
}
