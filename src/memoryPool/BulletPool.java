package memoryPool;

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocate() {
        return new Bullet(); // Cấp phát đối tượng Bullet mới
    }
}

