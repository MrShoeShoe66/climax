package frc.robot.commands;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.BTS;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.SwerveSubsystem;

public class ZeroGyro extends Command {
    // Called once the command ends or is interrupted.
    SwerveSubsystem swerve;
    public ZeroGyro(SwerveSubsystem b){
        swerve = b;
    }
    @Override
    public void initialize(){
        System.out.println("Zeroing gyro");
    }
    @Override
    public void execute(){
        
    }
    @Override
    public void end(boolean interrupted)
    {
        swerve.zeroGyro();
    }

    // Returns true when the command should end.
  @Override
    public boolean isFinished()
    {
     return true;
     } 
}   
