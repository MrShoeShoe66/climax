package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shooter;

public class ShootAmp extends Command {
    // Called once the command ends or is interrupted.
    Shooter shooter;
    public ShootAmp(Shooter s){
        shooter = s;
    }
    @Override
    public void initialize(){
        
    }
    @Override
    public void execute(){
        shooter.AutoShootAmp();
    }
    @Override
    public void end(boolean interrupted)
    {
    }

    // Returns true when the command should end.
  @Override
    public boolean isFinished()
    {
     return false;
     } 
}   
