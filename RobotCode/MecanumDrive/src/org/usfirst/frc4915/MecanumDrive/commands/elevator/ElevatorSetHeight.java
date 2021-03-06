package org.usfirst.frc4915.MecanumDrive.commands.elevator;

import org.usfirst.frc4915.MecanumDrive.Robot;
import org.usfirst.frc4915.MecanumDrive.subsystems.Elevator;
import org.usfirst.frc4915.debuggersystem.CustomDebugger.LoggerNames;

import edu.wpi.first.wpilibj.command.Command;

public class ElevatorSetHeight extends Command {

    private int targetHeight;

    public ElevatorSetHeight(int targetHeight) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        this.targetHeight = targetHeight;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Elevator.setPoint = targetHeight;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.debugger.logError(LoggerNames.ELEVATOR, "Set height to " + targetHeight);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
