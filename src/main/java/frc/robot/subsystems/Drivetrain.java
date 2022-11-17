// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  CANSparkMax front_right_Motor_controller;
  CANSparkMax front_left_Motor_controller;
  CANSparkMax back_right_Motor_controller;
  CANSparkMax back_left_Motor_controller;
  public Drivetrain() {

    front_right_Motor_controller = new CANSparkMax(1, MotorType.kBrushless);
    front_left_Motor_controller = new CANSparkMax(2, MotorType.kBrushless);
    back_right_Motor_controller = new CANSparkMax(3, MotorType.kBrushless);
    back_left_Motor_controller = new CANSparkMax(4, MotorType.kBrushless);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
