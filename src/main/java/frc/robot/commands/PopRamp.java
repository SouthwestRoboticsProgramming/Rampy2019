/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.enums.Somatotype;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Solenoid;

public class PopRamp extends Command {
  private Ramp m_sub;
  private Timer timer = new Timer();
  public PopRamp(Ramp ramp) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    m_sub = ramp;

  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    m_sub.set(Somatotype.kExpand);
    timer.start();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return timer.get() > 1d;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    m_sub.set(Somatotype.kContract);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
