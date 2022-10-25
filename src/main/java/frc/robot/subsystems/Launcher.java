// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Launcher extends SubsystemBase {

  private CANSparkMax m_spinmotor;

  /** Creates a new launcher. */
  public Launcher() {
    m_spinmotor = new CANSparkMax(LauncherConstants.SpinSparkMaxCANID, MotorType.kBrushless);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
