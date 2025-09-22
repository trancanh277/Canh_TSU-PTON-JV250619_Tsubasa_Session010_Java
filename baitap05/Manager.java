package baitap05;

public interface Manager<T> {
    void add(T item);
    void update(int index, T item);
    void delete(int index);
    void display();
}
