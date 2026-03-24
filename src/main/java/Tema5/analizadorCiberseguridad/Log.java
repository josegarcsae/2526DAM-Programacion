package Tema5.analizadorCiberseguridad;

import java.util.Objects;

public abstract class Log {

    int idLog;
    String ipOrigen;
    String ubicacion;

    public Log(int idLog, String ipOrigen, String ubicacion) {
        this.idLog = idLog;
        this.ipOrigen = ipOrigen;
        this.ubicacion = ubicacion;
    }

    // TODO el equals y el hashcode solo funcionaran con el id


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Log log)) return false;
        return idLog == log.idLog;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idLog);
    }

    public String toString() {
        return "[" + idLog + ", " + ipOrigen + ", " + ubicacion + "]";
    }

}
