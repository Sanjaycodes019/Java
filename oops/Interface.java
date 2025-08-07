interface Callable {
    void makeCall(String number);
}

interface Camera {
    void takePicture();
}

class Smartphone implements Callable, Camera {
    public void makeCall(String number) {
        System.out.println("Calling " + number + "...");
    }

    public void takePicture() {
        System.out.println("Taking a photo...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.makeCall("9876543210");
        s.takePicture();
    }
}
