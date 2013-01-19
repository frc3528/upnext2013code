/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.subsystems;

import com.teamupnext.robot.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author jousley
 */
public class Feeder extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    //1 dual sulenoid
    private DoubleSolenoid solenoid;
    
    public Feeder()
    {
        solenoid = new DoubleSolenoid(RobotMap.FEEDER_FORWARD_SOLENOID_CHANNEL, RobotMap.FEEDER_REVERSE_SOLENOID_CHANNEL);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
