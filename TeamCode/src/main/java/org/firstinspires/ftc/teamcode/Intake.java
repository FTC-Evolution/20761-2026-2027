package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


public class Intake {
    OpMode opMode;
    DcMotor IntakeMotor;

    void init(OpMode opMode){
        this.opMode = opMode;
        IntakeMotor = opMode.hardwareMap.get(DcMotor.class, "IntakeMotor");
        IntakeMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    void eat(){
        // when gamepad2 a pressed, take balls. (hold)
        if(opMode.gamepad2.a) {
            IntakeMotor.setPower(1);
            opMode.telemetry.addData("A held", "eating balls.");
        } 
        // when gamepad2 b pressed, remove balls. (hold)
        else if(opMode.gamepad2.b) {
            IntakeMotor.setPower(-1);
            opMode.telemetry.addData("B held", "removing balls.");
        } else {
            IntakeMotor.setPower(0);
        }
    }
}
