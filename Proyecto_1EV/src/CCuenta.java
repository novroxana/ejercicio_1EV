
/**
 * Esta es una clase
 * @author nolvi
 *
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * 
     */
    public CCuenta()
    {
    }

 /**
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * obtiene nombre
     * @return
     */
    public String obtenerNombre()
    {
        return getNombre();
    }


    /**
     * @return
     */
    public double estado()
    {
        return saldo;
    }


    /**
     * ingesa cantidad 
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retirar una cantidad
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    /**
     * obtiene una cuenta
     * @return
     */
    public String obtenerCuenta()
    {
        return cuenta;
    }


    /**
     * esta es una descipcion
     * @return
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * da un nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * obtiene el tipo de interes
     * @return
     */
    public double getTipoInteres() {
        return tipoInteres;
    }


    /**
     * da un tipo de intres
     * @param tipoInteres
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
