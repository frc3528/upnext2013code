/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamupnext.robot.commands;

import com.teamupnext.robot.RobotMap;

/**
 *
 * @author Team Up Next
 */
public class PullHolder extends CommandBase {
    
    public PullHolder() {
        requires(feeder);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        setTimeout(RobotMap.HOLDER_PULL_TIMEOUT);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        feeder.pullHolder();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        feeder.reset();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}