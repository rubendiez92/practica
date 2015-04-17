
/**
 * Enumeration class EstadoCivil - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum EstadoCivil
{
    SOLTERO("soltero"),CASADO("casado"), VIUDO ("viudo"), DIVORCIADO("divorciado");
    private String estados;
    EstadoCivil (String estados){
        this.estados = estados;
    }
    public String toString(){
        return estados;
    }
}
