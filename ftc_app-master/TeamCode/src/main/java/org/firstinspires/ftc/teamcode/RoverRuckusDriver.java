package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;


@TeleOp
public class RoverRuckusDriver extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException{
        DcMotor left = hardwareMap.get(DcMotor.class, "left");
        DcMotor right = hardwareMap.get(DcMotor.class, "right");
        waitForStart();
        while(opModeIsActive())
        {
            if(this.gamepad1.right_stick_y != 0) right.setPower(-this.gamepad1.right_stick_y);
            else right.setPower(0);
            if(this.gamepad1.left_stick_y !=0) left.setPower(this.gamepad1.left_stick_y);
            else left.setPower(0);
        }
    }
}
