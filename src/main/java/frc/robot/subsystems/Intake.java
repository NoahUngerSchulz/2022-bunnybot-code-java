package frc.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.util.sendable.SendableBuilder;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class IntakeSubSystem extends SubsystemBase {
    
    private boolean
            pivotPos = false;

    private final Solenoid pivot =
        new Solenoid(Ports.PCM_1, PneumaticsModuleType.REVPH, Ports.PIVOT_CLIMB_SOLENOID);

    public IntakeSubSystem(){
        pivotPos = false;
        pivot.set(false);
    }
   
    public void setPivotPos(boolean pos) {
        pivotPos = pos;
        pivot.set(pos);
    }

    @Override
    public void periodic() {}
  
    public boolean getPivotPos() {
        return pivotPos;
    }
    public void togglePivotPos() {
        setPivotPos(!pivotPos);
    }
}

