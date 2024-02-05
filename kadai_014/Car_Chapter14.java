package kadai_014;

public class Car_Chapter14 {
    private int gear = 1;
    private int speed = 10;

    public void gearChange(int afterGear) {
        gear = afterGear; 
        speed = switch (gear) { 
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            case 4 -> 40;
            case 5 -> 50;
            default -> speed; 
        };
    }

    public void run() {
        System.out.println("ギアは1から" + gear + "に切り替えました");
        System.out.println("速度は" + speed + "kmです");
    }
}

