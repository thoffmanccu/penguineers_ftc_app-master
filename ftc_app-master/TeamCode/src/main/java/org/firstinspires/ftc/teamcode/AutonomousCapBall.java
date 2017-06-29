package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.HardwarePushbot;


@Autonomous(name="Pushbot: Autonomous 30 seconds", group="Pushbot")

public class AutonomousCapBall extends LinearOpMode {


    HardwarePushbot robot           = new HardwarePushbot();   // Use a Pushbot's hardware
    // could also use HardwarePushbotMatrix class.


    @Override
    public void runOpMode() throws InterruptedException {


        // Initialize the hardware variables.
        //The init() method of the hardware class does all the work here
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Say", "Hello  Driver");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Moves the bot foreward for 30 seconds to simulate the field test
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(30000);

        // Stops the two wheels
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);


    }
}
