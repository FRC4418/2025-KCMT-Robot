// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  // private final WPI_TalonSRX leftLeader;
  // private final WPI_TalonSRX leftFollower;
  // private final WPI_TalonSRX rightLeader;
  // private final WPI_TalonSRX rightFollower;
  
  // private final DifferentialDrive drive;

  // public Drivetrain() {
  //   leftLeader = new WPI_TalonSRX(0, MotorType.kBrushed);
  //   leftFollower = new WPI_TalonSRX(1, MotorType.kBrushed);
  //   rightLeader = new WPI_TalonSRX(2, MotorType.kBrushed);
  //   rightFollower = new WPI_TalonSRX(3, MotorType.kBrushed);

  //   drive = new DifferentialDrive(leftLeader, rightLeader);

  //   leftLeader.setCANTimeout(250);
  //   rightLeader.setCANTimeout(250);
  //   leftFollower.setCANTimeout(250);
  //   rightFollower.setCANTimeout(250);

  //   SparkMaxConfig config = new SparkMaxConfig();
  //   config.voltageCompensation(12);
  //   config.smartCurrentLimit(40);

  //   config.follow(leftLeader);
  //   leftFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  //   config.follow(rightLeader);
  //   rightFollower.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

  //   config.disableFollowerMode();
  //   rightLeader.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

  //   config.inverted(true);
  //   leftLeader.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
  // }

  // public void arcadeDrive(double xSpeed, double zRotation) {
  //   drive.arcadeDrive(xSpeed, zRotation);
  // }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
