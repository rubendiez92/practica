
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    //constantes
    private static int numInstancias = 0;
    private final String ESTADO_NO_VALIDO = "no es un estado valido";
    private final String YA_CASADO = "Una de las 2 personas esta casadas";
    private final static String CABEZERA = "Los estados civiles que hay son: ";
    // instance variables - replace the example below with your o
    private String nombre;
    private int edad;
    private EstadoCivil estado;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, int edad)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.edad = edad;
        estado = EstadoCivil.SOLTERO;
        numInstancias++;
    }

    /**
     * Devuelve el estado civil
     * @return String Cadena con el estado civil de la persona
     */
    public String getEstadoCivil()
    {
        // put your code here
        return estado.toString();
    }
    
    /**
     * Casa a 2 personas, les cambia el estado civil
     * @param persona2 Persona con la que se va a casar
     */
    public void casar (Persona persona2)
    {
        if (getEstadoCivil() != EstadoCivil.CASADO.toString() && persona2.getEstadoCivil() != EstadoCivil.CASADO.toString()){
            estado = EstadoCivil.CASADO;
            persona2.estado = EstadoCivil.CASADO;
        }
        else{
            System.out.println(YA_CASADO);
        }
    }
    
    /**
     * Devuelve el numero de estados civiles
     * @return int Numeor de estados civiles que hay
     */
    public static int numEstadosCiviles()
    {
        EstadoCivil [] estados = EstadoCivil.values();
        return estados.length;
    }
        
    /**
     * Devuelve en numero de personas creadas
     * @return int Numero de personas creadas
     */
    public static int numInstancias ()
    {
        return numInstancias;
    }
    
    /**
     * Establece un estado civil
     * @param estadoCivil Estado civil que queremos introducir
     */
    public void setEstadoCivil(String estadoCivil)
    {
        String estadoCivilMinusculas = estadoCivil.toLowerCase();
        if (esValido(estadoCivil) != null){
            estado = esValido(estadoCivil);
        }
        else {
            System.out.println(ESTADO_NO_VALIDO);
        }
    }
    
    /**
     * Devuelve el estado al que corresponda la cadena introducida o null si no coincide
     * @param estadoCivil Estado civil introducido
     * @return EstadoCivil Estado civil encontrado o null
     */
    private EstadoCivil esValido(String estadoCivil)
    {
        String estadoAMinusculas = estadoCivil;
        for (EstadoCivil estado : EstadoCivil.values()){
            if (estadoCivil.equals(estado.toString().toLowerCase())){
                return estado;
            }
        } 
        return null;        
    }

    /**
     * Muestra los distintos estados civiles que hay
     */
    public static void verEstadosCiviles()
    {
        System.out.println(CABEZERA);
        for (EstadoCivil estado : EstadoCivil.values()){
            System.out.println("\t" + estado);
        }
    }
}

