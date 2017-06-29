package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

//This Has Been Modified from HardwarePushbot
public class HardwarePushbot
{
    /* Public OpMode members. */
    public DcMotor  leftMotor   = null;
    public DcMotor  rightMotor  = null;
    public DcMotor  GenericMotor1 = null;
    public DcMotor  GenericMotor2 = null;
    public DcMotor  PullUp1 = null;
    public DcMotor  PullUp2 = null;

    /* local OpMode members. */
    HardwareMap hwMap           =  null;
    private ElapsedTime period  = new ElapsedTime();

    /* Constructor */
    public HardwarePushbot(){

    }

    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftMotor   = hwMap.dcMotor.get("left_drive");
        rightMotor  = hwMap.dcMotor.get("right_drive");
        GenericMotor1 = hwMap.dcMotor.get("GenericMotor1");
        GenericMotor2 = hwMap.dcMotor.get("GenericMotor2");
        PullUp1 = hwMap.dcMotor.get("PullUp1");
        PullUp2 = hwMap.dcMotor.get("PullUp2");
        leftMotor.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightMotor.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors

        // Set all motors to zero power
        leftMotor.setPower(0);
        rightMotor.setPower(0);
        GenericMotor1.setPower(0);
        GenericMotor2.setPower(0);
        PullUp1.setPower(0);
        PullUp2.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        GenericMotor1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        GenericMotor2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        PullUp1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        PullUp2.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);



    }

    public void waitForTick(long periodMs) {

        long  remaining = periodMs - (long)period.milliseconds();

        // sleep for the remaining portion of the regular cycle period.
        if (remaining > 0) {
            try {
                Thread.sleep(remaining);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Reset the cycle clock for the next pass.
        period.reset();
    }
}

