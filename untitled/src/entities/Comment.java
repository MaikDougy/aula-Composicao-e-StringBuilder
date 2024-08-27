package entities;

public class Comment {
    //atributos
    private String comentarios;

    //construtores
    public Comment (){

    }

    public Comment(String comentarios) {
        this.comentarios = comentarios;
    }

    //GET SET


    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
