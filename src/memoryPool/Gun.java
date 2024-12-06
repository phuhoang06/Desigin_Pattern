package memoryPool;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000; // Số lượng đạn

    // Bắn súng sử dụng đạn từ Memory Pool
    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0); // Đặt vị trí viên đạn ban đầu
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move(); // Di chuyển viên đạn
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    pool.freeItem(pp); // Giải phóng viên đạn khi đến đích
                    plist.remove(pp); // Xóa viên đạn khỏi danh sách
                }
            }
            System.out.println();
        }
    }

    // Bắn súng mà không sử dụng Memory Pool
    public void fire() {
        List<Bullet> plist = new ArrayList<>();
        for (int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0); // Đặt vị trí viên đạn ban đầu
            plist.add(p);
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move(); // Di chuyển viên đạn
                System.out.print("-" + pp.getPosition());
                if (pp.getPosition() == 10) {
                    plist.remove(pp); // Xóa viên đạn khỏi danh sách khi đến đích
                }
            }
            System.out.println();
        }
    }
}

