package memoryPool;

public class Bullet {
    public static int count = 0; // Đếm số lượng đạn đã tạo
    private int position; // Vị trí của viên đạn

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Bullet() {
        count++; // Tăng số lượng đạn khi tạo mới
    }

    public void move() {
        position++; // Cập nhật vị trí của viên đạn
    }
}

