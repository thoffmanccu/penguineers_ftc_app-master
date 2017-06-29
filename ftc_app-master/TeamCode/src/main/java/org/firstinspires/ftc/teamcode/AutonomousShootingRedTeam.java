package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.HardwarePushbot;


@Autonomous(name="Pushbot: Autonomous Shooting (Red Team)", group="Pushbot")

public class AutonomousShootingRedTeam extends LinearOpMode {


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

        Thread.sleep(10500);

        robot.GenericMotor2.setPower(1);
        robot.GenericMotor1.setPower(-1);
        Thread.sleep(1000);

        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(500);

        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(1);
        Thread.sleep(500);

        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);


        robot.PullUp1.setPower(1);
        Thread.sleep(1500);

        robot.PullUp1.setPower(-1);
        Thread.sleep(1000);

        robot.PullUp1.setPower(0);

        robot.PullUp2.setPower(-1);
        Thread.sleep(1000);

        robot.PullUp2.setPower(0);
        Thread.sleep(1000);

        robot.GenericMotor2.setPower(0);
        robot.GenericMotor1.setPower(0);
        robot.PullUp1.setPower(0);

        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(3000);

        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(1000);

        robot.leftMotor.setPower(-1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(1000);

        robot.leftMotor.setPower(0);
        robot.rightMotor.setPower(0);






    }
}
