package dao_crud;

import java.util.List;

public interface CRUD_car_wash <T> {

    public int agregar (T t);
    public int editar (T t);
    public int eliminar (int id);
    
    public List<T> obtenerTodos();
    public List<T> obtenerPor(String columna, String dato);
    public T obtenerId(int id);
    
}
