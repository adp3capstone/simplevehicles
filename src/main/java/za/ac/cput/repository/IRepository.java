package za.ac.cput.repository;

public interface IRepository<T,ID>{
    public T get(ID id);
    public boolean create(T t);
    public boolean update(ID id);
    public boolean delete(ID id);
}
