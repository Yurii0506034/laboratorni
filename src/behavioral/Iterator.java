package behavioral;

import java.util.List;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}

class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int currentIndex = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < items.size();
    }

    @Override
    public T next() {
        return items.get(currentIndex++);
    }
}
