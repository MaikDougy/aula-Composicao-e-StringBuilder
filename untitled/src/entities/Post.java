package entities;
import java.util.ArrayList;
import java.util.List;
import java.time.Instant;

public class Post {
    //atributos
    private Instant dataDoPost;
    private String tituloDopost;
    private Integer numeroDeLikes;

    //atributos com associação
    /*OBS: nao se usa get e set psrs atributos de associaçao
    porque onstancia outra lista e apaga a anterior, o correto
    é criar metodos para adicionar e remover os itens*/
    
    private List <Comment>  listaDeComentarios = new ArrayList<>();

    //construtores
    public Post(){

    }

    public Post(Instant dataDoPost, String tituloDoPost, Integer numeroDeLikes){
        this.dataDoPost = dataDoPost;
        this.tituloDopost = tituloDoPost;
        this.numeroDeLikes = numeroDeLikes;
    }

    //get sett
    public Instant getDataDoPost() {
        return dataDoPost;
    }
    public void setDataDoPost(Instant dataDoPost) {
        this.dataDoPost = dataDoPost;
    }

    public String getTituloDopost() {
        return tituloDopost;
    }
    public void setTituloDopost(String tituloDopost) {
        this.tituloDopost = tituloDopost;
    }

    public Integer getNumeroDeLikes() {
        return numeroDeLikes;
    }
    public void setNumeroDeLikes(Integer numeroDeLikes) {
        this.numeroDeLikes = numeroDeLikes;
    }

    //métodos

    //adiciona comentario
    public void adicionrComentario(Comment comentario){
        listaDeComentarios.add(comentario);
    }

    //remove comentario
    public void removerComentario(Comment comentario){
        listaDeComentarios.remove(comentario);
    }


}
