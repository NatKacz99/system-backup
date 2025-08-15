package co.devfoundry.backup;

import java.util.Date;

public class OperatingSystem {
    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Created backup nr: " + this.backupNumber + " with date: " + backupDate);
    }

    public OperatingSystemMemento save(){
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load (OperatingSystemMemento operatingSystemMemento){
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}
