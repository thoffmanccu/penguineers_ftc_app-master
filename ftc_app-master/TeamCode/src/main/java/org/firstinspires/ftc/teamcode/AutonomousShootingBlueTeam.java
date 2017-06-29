package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.HardwarePushbot;


@Autonomous(name="Pushbot: Autonomous Shooting (Blue Team)", group="Pushbot")

public class AutonomousShootingBlueTeam extends LinearOpMode {


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

        Thread.sleep(5000);

        //Starts the two shooters to gain momentum
        robot.GenericMotor2.setPower(1);
        robot.GenericMotor1.setPower(-1);
        Thread.sleep(1000);

        //Drives the robot forward off the wall to aim
        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(500);

        //Turns the robot towards the center vortex
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(500);

        //Stops the two drive wheels
        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);

        //Pushes the top particle into the shooter
        robot.PullUp1.setPower(1);
        Thread.sleep(1500);

        //Takes the top flap out of the way of the bottom one
        robot.PullUp1.setPower(-1);
        Thread.sleep(1000);

        //Stops the top flap
        robot.PullUp1.setPower(0);

        //Uses the bottom flap to launch the other ball
        robot.PullUp2.setPower(-1);
        Thread.sleep(1000);

        //Stops the bottom flap
        robot.PullUp2.setPower(0);
        Thread.sleep(1000);

        //Stops the shooting wheels
        robot.GenericMotor2.setPower(0);
        robot.GenericMotor1.setPower(0);
        robot.PullUp1.setPower(0);

        //Moves the robot forward to push off the cap ball
        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(3000);

        //Gets the robot off the cap ball by backing up
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(1000);

        //Gets the robot back onto the center vortex
        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(1500);

        //Stops the drive wheels
        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);







    }
}
