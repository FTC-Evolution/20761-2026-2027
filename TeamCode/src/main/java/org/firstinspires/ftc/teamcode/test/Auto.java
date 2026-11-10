package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Auto (ai)", group="Test")
public class Auto extends LinearOpMode {

    // Timer to track autonomous duration
    private final ElapsedTime runtime = new ElapsedTime();

    @Override
    public void runOpMode() {
        // ==========================================
        // 2. INITIALIZATION AND CONFIGURATION
        // ==========================================
        telemetry.addData("Status", "Initializing Auto 4 motors...");
        telemetry.update();

        // Link code variables to the hardware configuration
        // ==========================================
        // 1. HARDWARE COMPONENT DECLARATION
        // ==========================================
        DcMotor leftFront = hardwareMap.get(DcMotor.class, "FrontLeftMotor");
        DcMotor rightFront = hardwareMap.get(DcMotor.class, "FrontRightMotor");
        DcMotor leftBack = hardwareMap.get(DcMotor.class, "BackLeftMotor");
        DcMotor rightBack = hardwareMap.get(DcMotor.class, "BackRightMotor");

        // Reverse left side motors so the robot moves forward straight
        leftFront.setDirection(DcMotor.Direction.FORWARD);
        leftBack.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.REVERSE);

        telemetry.addData("Status", "Ready! Waiting for autonomous start...");
        telemetry.update();

        // ==========================================
        // 3. WAIT FOR START (PLAY BUTTON)
        // ==========================================
        waitForStart();
        runtime.reset();

        // ==========================================
        // 4. AUTONOMOUS ACTIONS (Step-by-Step)
        // ==========================================

        // STEP 1: Move forward at 40% power for 2.0 seconds
        if (opModeIsActive()) {
            telemetry.addData("Status", "Step 1: Moving Forward");
            telemetry.update();

            leftFront.setPower(0.4);
            rightFront.setPower(0.4);
            leftBack.setPower(0.4);
            rightBack.setPower(0.4);

            sleep(2000); // Wait for 2000 milliseconds (2 seconds)
        }

        // STEP 2: Stop all motors safely
        leftFront.setPower(0.0);
        rightFront.setPower(0.0);
        leftBack.setPower(0.0);
        rightBack.setPower(0.0);

        telemetry.addData("Status", "Autonomous Complete");
        telemetry.update();
    }
}
