package co.devfoundry.backup;

public class OperatingSystemCaretaker {
    private OperatingSystemMemento operatingSystemMemento;

    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Saved backup nr: " + operatingSystemMemento.getBackupNumber() + " with date: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;
    }

    public OperatingSystemMemento getMemento() {
        System.out.println("Loaded backup nr: " + operatingSystemMemento.getBackupNumber() + " with date: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}
