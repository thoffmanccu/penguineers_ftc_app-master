package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwarePushbot;


@Autonomous(name="Pushbot: Autonomous (Turn Left)", group="Pushbot")

public class AutonomousTurnLeft extends LinearOpMode {


    HardwarePushbot robot           = new HardwarePushbot();   // Use a Pushbot's hardware


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

        // Moves the bot foreward about 4 feet
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(2100);

        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Tells the bot to turn towards the corner vortex
        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(1);
        Thread.sleep(1400);

        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Tells the bot to move forward towards the corner vortex
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(3500);

        // Stops the two wheels
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Turns the bottom sweeper and launches the balls into the corner vortex
        robot.PullUp2.setPower(1);
        Thread.sleep(1500);

        // Stops the bottom sweeper
        robot.PullUp2.setPower(0);

        // Moves backwards out of the corner vortex
        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(1500);


        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Turns parrallel to the wall
        robot.rightMotor.setPower(-1);
        Thread.sleep(1500);

        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Tells the bot to move backwards
        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(3000);

        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Turns towards the cap ball
        robot.rightMotor.setPower(-1);
        Thread.sleep(750);

        // Pushes the cap ball off
        robot.rightMotor.setPower(1);
        robot.leftMotor.setPower(1);
        Thread.sleep(3000);

        // Stops the two wheels
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);




    }
}

