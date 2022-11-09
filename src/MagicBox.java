
import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int maxObjects) {
        this.items = (T[]) new Object[maxObjects];

    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Магическая коробка еще не полная, осталось " + (items.length - i));
            }
        }
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return (T) items[randomInt];
        }

    }

