
public class Server {
    private int hardDriveSpace; // in Gigabytes
    private int pipeSize; //in megabits per sec
    private int clockSpeed; //in mhz
    private int ramAmount; //in megabytes
    private int bandwidthCap; //in gigabytes
    private String serverName;
    private String serverDesc;


    public int getHardDriveSpace() {
        return hardDriveSpace;
    }
    public void setHardDriveSpace(int hardDriveSpace) {
        this.hardDriveSpace = hardDriveSpace;
    }
    public int getPipeSize() {
        return pipeSize;
    }
    public void setPipeSize(int pipeSize) {
        this.pipeSize = pipeSize;
    }
    public int getClockSpeed() {
        return clockSpeed;
    }
    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
    public int getRamAmount() {
        return ramAmount;
    }
    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }
    public int getBandwidthCap() {
        return bandwidthCap;
    }
    public void setBandwidthCap(int bandwidthCap) {
        this.bandwidthCap = bandwidthCap;
    }
    public String getServerName() {
        return serverName;
    }
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }
    public String getServerDesc() {
        return serverDesc;
    }
    public void setServerDesc(String serverDesc) {
        this.serverDesc = serverDesc;
    }


    public String toString() {
        return "Server Name: " + this.serverName + " |Server Description: " + this.serverDesc +  " |HDD Space: " + this.hardDriveSpace + " |Pipe Size: " + this.pipeSize + " |Clock Speed: " + this.clockSpeed + " |Ram: " + this.ramAmount + " |Bandwidth Cap: " + this.bandwidthCap;
    }

    public Server(int serverNumber) {
        switch(serverNumber) {
            case 1:
                this.hardDriveSpace = 15;
                this.pipeSize = 1;
                this.clockSpeed = 200;
                this.ramAmount = 128;
                this.bandwidthCap = 250;
                this.serverName = "Starter's Server";
                this.serverDesc = "Hosted in the basement of your house.";
                break;
            case 2:
                this.hardDriveSpace = 40;
                this.pipeSize = 5;
                this.clockSpeed = 800;
                this.ramAmount = 512;
                this.bandwidthCap = 600;
                this.serverName = "Baby's First VPS";
                this.serverDesc = "Your friend who works at a datacenter got you a good deal";
                break;

        }
    }

}
