public class ejecutor {
    public static void main(String []args){
        Thread hilo1=new Thread(new Hilo());
        hilo1.start();
        Clases ext= new Clases("Programacion",3,201,"Samira","Rodrigez",154510);
        ext.mostrar();
    }
}
