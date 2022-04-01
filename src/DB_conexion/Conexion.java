package DB_conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {

        //Atributos
        private String _url = "jdbc:mysql://localhost/bd_car_wash?useSSL=false";
        private String _user = "root";
        private String _contrasena = "";
        private Connection conn = null;
       
        //Contructor
        
        public Conexion(){
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String _url) {
        this._url = _url;
    }

    public String getUser() {
        return _user;
    }

    public void setUser(String _user) {
        this._user = _user;
    }

    public String getContrasena() {
        return _contrasena;
    }

    public void setContrasena(String _contrasena) {
        this._contrasena = _contrasena;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

        //Metodo de la clase
    
        public void cerrarConexion(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            
        }
    }
}
