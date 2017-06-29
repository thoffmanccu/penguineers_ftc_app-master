/*
Copyright (c) 2016 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.HardwarePushbot;


@Autonomous(name="Pushbot: Autonomous (Turn Right)", group="Pushbot")

public class AutonomousTurnRight extends LinearOpMode {


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

        // Moves the bot foreward about 4 feet
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(2100);

        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Tells the bot to turn towards the corner vortex
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(-1);
        Thread.sleep(1400);

        // Stops the two wheels for stability
        robot.rightMotor.setPower(0);
        robot.leftMotor.setPower(0);
        Thread.sleep(250);

        // Tells the bot to move foreward towards the corner vortex
        robot.leftMotor.setPower(1);
        robot.rightMotor.setPower(1);
        Thread.sleep(2750);

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
        robot.leftMotor.setPower(-1);
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
        robot.rightMotor.setPower(1);
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

