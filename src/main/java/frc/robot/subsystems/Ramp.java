/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.components.TwoWaySolenoid;
import frc.robot.enums.Somatotype;
/**
 * Add your docs here.
 */
public class Ramp extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
    private final int EXPAND = 3; //3
    private final int CONTRACT = 2;  //2

    private final TwoWaySolenoid solenoid; 
    
    public Ramp() {
      solenoid = new TwoWaySolenoid(CONTRACT, EXPAND);
    }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void set(Somatotype state) {
    solenoid.set(state);
  }
}
