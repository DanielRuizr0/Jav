public class Clases extends Estudiante{
    private String Carrera;
    private int Semestre;
    private int salon;	

    public Clases(String Carrera, int Semestre,int salon, String nombre, String apellido, int cedula) {
        super(nombre, apellido, cedula);
        this.Carrera = Carrera;
        this.Semestre = Semestre;
	this.salon = salon;
    }

    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nCedula: "+getCedula()+
                "\nCarrera: "+Carrera+
                "\nSemestre: "+Semestre+
		"\nSalon: "+salon);
    }
    
}