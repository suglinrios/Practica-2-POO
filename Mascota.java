public class Mascota {
    private String nombre;
    private String raza;
    private int anioNacimiento;
    private Persona miVeterinario;

    // Constructor sin año de nacimiento.
    public Mascota(String pNombre, String pRaza) {
        this.nombre = pNombre;
        this.raza = pRaza;
        this.anioNacimiento = 0;
        this.miVeterinario = null;
    }

    // Constructor con año de nacimiento.
    public Mascota(String pNombre, String pRaza, int pAnioNacimiento) {
        this.nombre = pNombre;
        this.raza = pRaza;
        this.anioNacimiento = pAnioNacimiento;
        this.miVeterinario = null;
    }

    // Devuelve el nombre del veterinario asignado.
    public String consultarNombreVeterinario() {
        String resultado;

        if (miVeterinario == null) {
            resultado = "Sin veterinario asignado";
        } else {
            resultado = miVeterinario.getNombre();
        }

        return resultado;
    }

    // Asigna la persona veterinaria de esta mascota.
    public void asignarVeterinario(Persona vet) {
        this.miVeterinario = vet;
    }

    // Año actual.
    private int obtenerAnioActual() {
        int anioActual;
        anioActual = java.time.LocalDate.now().getYear();
        return anioActual;
    }

    // Calcula la edad canina de la forma: Edad canina = anioActual - anioNacimiento (0 si no hay año registrado).
    private int calcularEdadCanina() {
        int edadCanina;

        if (anioNacimiento == 0) {
            edadCanina = 0;
        } else {
            edadCanina = obtenerAnioActual() - anioNacimiento;
        }

        return edadCanina;
    }

    // Calcula la edad humana de la forma: Edad humana = edad canina x 7 (0 si no hay año registrado).
    private int calcularEdadHumana() {
        int edadHumana;
        int edadCanina;

        edadCanina = calcularEdadCanina();

        if (anioNacimiento == 0) {
            edadHumana = 0;
        } else {
            edadHumana = edadCanina * 7;
        }

        return edadHumana;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        String texto;

        texto = "Mascota: " + nombre
                + ", Raza: " + raza
                + ", Año de nacimiento: " + anioNacimiento
                + ", Edad canina: " + calcularEdadCanina()
                + ", Edad humana: " + calcularEdadHumana();

        return texto;
    }
}
