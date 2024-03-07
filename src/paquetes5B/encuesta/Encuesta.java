package paquetes5B.encuesta;

public class Encuesta {
    private Reactivo[] reactivos;
    private int i = 0;

    public void addReactivo(String r){
        this.reactivos[this.i] = r;
        this.i++;
    }
    public String getReactivo(int folio){

        return reactivos == null?null:reactivos[folio].getReactivo();
    }
}