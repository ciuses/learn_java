package access_layer;

public interface accessToDB<T, ID, P> {
    void create(T entity);
    T read (ID gemId);
    void update(ID gemId, P gemPrice);
    void delete(ID gemId);

}
