package za.ac.cput.repository;

public interface IRepository<T,ID>{
    public T get(ID id);
    public T create(T t);
    public T update(ID id);
    public boolean delete(ID id);
}
