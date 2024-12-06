package memoryPool;

import java.util.LinkedList;

public abstract class MemoryPool<T> {
    private LinkedList<T> free_items = new LinkedList<>(); // Danh sách các đối tượng chưa sử dụng

    public void freeItem(T item) {
        free_items.add(item); // Giải phóng đối tượng vào Pool
    }

    protected abstract T allocate(); // Phương thức cấp phát đối tượng mới

    public T newItem() {
        T out = null;
        if (free_items.size() == 0) {
            out = allocate(); // Nếu không có đối tượng trong Pool, tạo mới
        } else {
            out = free_items.getFirst(); // Lấy đối tượng đầu tiên từ Pool
            free_items.removeFirst(); // Xóa đối tượng khỏi Pool
        }
        return out;
    }
}
