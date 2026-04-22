

/*JAVA INTERFACES AND DEFAULT METHODS*/
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){//Private Method
        System.out.println("Good Morning");
    }
    default void record4KVideo(){//Default Method
        greet();
        System.out.println("Recording in 4K");
    }
}
interface Wifi{
    String []getNetworks();
    void connectToNetwork();
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(int phoneNumber){
        System.out.println("Connecting");
    }
}
class MySmartPhone extends MyCellPhone implements Camera,Wifi{
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording Video");
    }
//    @Override
//    public void record4KVideo(){//OverWrite defaultMethod
//        System.out.println("Video Recording 4K   ");
//    }

    @Override
    public String []getNetworks(){
        System.out.println("List of Networks");
        String[] networkList = {"OppoA-31","Vivo-Y12","Harry"};
        return networkList;
    }
    @Override
    public void connectToNetwork(){
        System.out.println("connected To Network");
    }
}
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
public class Interfaces_DefaultMethods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] arr = ms.getNetworks();
        for (String element:arr){
            System.out.println(element);
        }
        ms.connectToNetwork();













    }
}
