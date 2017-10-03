package en03;

/**
 * Created by C0116289 on 2017/04/24.
 */
public class Computer {
    public String os;
    public int ram;
    public int disk;

    public Computer(){
        this.disk=512;
        this.ram=8;
        this.os="UNKNOWN";
    }

    public Computer(String os){
        this.os=os;
        this.ram=8;
        this.disk=512;
    }
    public Computer(String os,int ram) {
        this.os=os;
        this.ram=ram;
        this.disk=512;
    }


    public String getOS(){
        return os;

    }

    public int getRam(){
        return ram;
    }
    public  int getDisk(){
        return disk;
    }

}
