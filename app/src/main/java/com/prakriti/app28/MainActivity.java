package com.prakriti.app28;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TextView txtDesktopComputer, txtLaptopComputer, txtSmartphoneComputer, txtTabletComputer,
            txtDCPerformance, txtLCPerformance, txtSCPerformance, txtTCPerformance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDesktopComputer = findViewById(R.id.txtDesktopComputer);
        txtLaptopComputer = findViewById(R.id.txtLaptopComputer);
        txtSmartphoneComputer = findViewById(R.id.txtSmartphoneComputer);
        txtTabletComputer = findViewById(R.id.txtTabletComputer);

        txtDCPerformance = findViewById(R.id.txtDCPerformance);
        txtLCPerformance = findViewById(R.id.txtLCPerformance);
        txtSCPerformance = findViewById(R.id.txtSCPerformance);
        txtTCPerformance = findViewById(R.id.txtTCPerformance);


        DesktopComputer desktopComputer = new DesktopComputer("Windows 7", "High Quality Screen", "Physical",
                "Physical", 2000, 8);

        LaptopComputer laptopComputer = new LaptopComputer("Windows 10", "High Quality Screen", "Physical",
                "High Quality TouchPad", 3500, 16);

        SmartphoneComputer smartphoneComputer = new SmartphoneComputer("RedMI 5", "Retina Screen", "Virtual",
                "AndroidOS", 1300, 4);

        TabletComputer tabletComputer = new TabletComputer("iPad", "Retina Screen", "Virtual",
                "iOS", 1300, 4, 8);


        txtDCPerformance.setText("Performance: " + desktopComputer.evaluatePerformance() +"\n");
        txtLCPerformance.setText("Performance: " + laptopComputer.evaluatePerformance() +"\n");
        txtSCPerformance.setText("Performance: " + smartphoneComputer.evaluatePerformance() +"\n");
        txtTCPerformance.setText("Performance: " + tabletComputer.evaluatePerformance() +"\n");

            // array of computer objects
        Computer[] computers = new Computer[] {desktopComputer, laptopComputer, smartphoneComputer, tabletComputer};

        for(Computer computer : computers) {

            if(computer instanceof DesktopComputer) {
                    // downcasting -> casting subclass object to superclass type
            //    DesktopComputer currentDC = (DesktopComputer) computer; -> this line is not necessary (makes no diff to o/p)
                txtDesktopComputer.setText(computer.toString()); // prints overridden toString() method
            }
            if(computer instanceof LaptopComputer) {
            //    LaptopComputer currentLC = (LaptopComputer) computer;
                txtLaptopComputer.setText(computer.toString());
            }
            if(computer instanceof SmartphoneComputer) {
                    // TabletComputer is also an instance of SmartphoneComputer
                // so tabletComputer obj evaluates to true for this condition and prints its info in smartphone computer textview
                if(!(computer instanceof TabletComputer))
            //    SmartphoneComputer currentSC = (SmartphoneComputer) computer;
                    txtSmartphoneComputer.setText(computer.toString());
            }
            if(computer instanceof TabletComputer) {
            //    TabletComputer currentTC = (TabletComputer) computer;
                txtTabletComputer.setText(computer.toString());
            }
        }
    }
}