package com.teamupnext.robot.commands;

import com.teamupnext.robot.OI;
import com.teamupnext.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static DriveTrain driveTrain = new DriveTrain();
    public static Climber climber = new Climber();
    public static Feeder feeder = new Feeder();
    public static PickerUpper pickerUpper = new PickerUpper();
    public static Shooter shooter = new Shooter();
    public static Targeter targeter = new Targeter();

    public static void init() {
        
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(climber);
        SmartDashboard.putData(feeder);
        SmartDashboard.putData(pickerUpper);
        SmartDashboard.putData(shooter);
        SmartDashboard.putData(targeter);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
