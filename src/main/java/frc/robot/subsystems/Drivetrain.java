// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private final WPI_TalonSRX leftLeader;
  private final WPI_TalonSRX leftFollower;
  private final WPI_TalonSRX rightLeader;
  private final WPI_TalonSRX rightFollower;
  
  private final DifferentialDrive drive;

  public Drivetrain() {
    leftLeader = new WPI_TalonSRX(0);
    leftFollower = new WPI_TalonSRX(1);
    rightLeader = new WPI_TalonSRX(2);
    rightFollower = new WPI_TalonSRX(3);

    drive = new DifferentialDrive(leftLeader, rightLeader);

    leftFollower.follow(leftLeader);
    rightFollower.follow(rightLeader);

    leftLeader.setInverted(false);
    rightLeader.setInverted(false);
  }

  public void arcadeDrive(double xSpeed, double zRotation) {
    drive.arcadeDrive(xSpeed, zRotation);
  }

  public void drive(double speed){
    leftLeader.set(speed);
    rightLeader.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
