package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp(name= "Hello World", group= "Test")
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("sixtyseven", "dihhhh");
    }

    @Override
    public void loop() {

    }
}
