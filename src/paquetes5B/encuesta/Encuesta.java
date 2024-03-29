package paquetes5B.encuesta;

public class Encuesta {
    private Reactivo[] reactivos;
    private int i = 0;

    public void addReactivo(String r){
        this.reactivos[this.i] = new Reactivo();
        this.reactivos[this.i].setPregunta(r);
        this.i++;
    }
    public String getReactivo(int folio){
        return reactivos == null?null:reactivos[folio].getPregunta();
    }
    public void showEncuesta(){
        for (int j = 0; i < 100 ; j++){
            System.out.println(getReactivo(j));
        }
    }
}
