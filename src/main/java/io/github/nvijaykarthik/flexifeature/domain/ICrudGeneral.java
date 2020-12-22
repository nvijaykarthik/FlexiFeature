package io.github.nvijaykarthik.flexifeature.domain;

import java.util.List;

public interface ICrudGeneral<T,ID> {
    
    public List<T> getAll();
    public T get(ID id);
    public T add(T t);
    public T update(T t);
    public void delete(T t);
}
