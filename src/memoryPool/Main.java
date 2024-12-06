package memoryPool;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        System.out.println("Start");
        gun.fire(); // Sử dụng phương thức fire() để bắn súng
        System.out.println("Game over");
        System.out.println("Total bullet created: " + Bullet.count); // In ra tổng số đạn đã được tạo
    }
}

