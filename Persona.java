import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String codigoLicencia;
    private ArrayList<Mascota> misMascotas;

    public Persona(String pNombre, String pCodigoLicencia) {
        this.nombre = pNombre;
        this.codigoLicencia = pCodigoLicencia;
        this.misMascotas = new ArrayList<Mascota>();
    }

    // Agrega una mascota a la lista de mascotas asignadas a esta persona.
    public void asignarMascota(Mascota mascota) {
        misMascotas.add(mascota);
    }

    // Devuelve los nombres de todas las mascotas asignadas, separados por coma.
    public String consultarNombreMisMascotas() {
        String resultado;
        int i;

        resultado = "";
        i = 0;

        while (i < misMascotas.size()) {
            if (i == 0) {
                resultado = misMascotas.get(i).getNombre();
            } else {
                resultado = resultado + ", " + misMascotas.get(i).getNombre();
            }
            i = i + 1;
        }

        if (misMascotas.size() == 0) {
            resultado = "Sin mascotas asignadas";
        }

        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        String texto;

        texto = "Persona: " + nombre
                + ", Licencia: " + codigoLicencia
                + ", Mascotas asignadas: " + consultarNombreMisMascotas();

        return texto;
    }
}
