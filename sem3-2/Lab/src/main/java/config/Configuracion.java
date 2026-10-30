package config;
import java.io.InputStream;
import java.util.Properties;

public class Configuracion {
    private final Properties props = new Properties();

    public Configuracion() throws Exception {
        try (InputStream in = getClass()
                .getClassLoader()
                .getResourceAsStream("applications.properties")) {
            if (in == null) {
                throw new IllegalStateException("No se encontró applications.properties en el classpath");
            }
            props.load(in);
        }
    }

    public String getUrlPagos() { return props.getProperty("pagos.url"); }
    public double getUmbralVip() { return Double.parseDouble(props.getProperty("pagos.umbral.vip")); }
}

