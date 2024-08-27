package entities;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.Instant;

public class Post {
    //constatnte para formataçao de data e hora
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    //atributos
    private Instant dataDoPost;
    private String tituloDopost;
    private String conteudoDopost;
    private Integer numeroDeLikes;

    //atributos com associação
    /*OBS: nao se usa get e set psrs atributos de associaçao
    porque onstancia outra lista e apaga a anterior, o correto
    é criar metodos para adicionar e remover os itens*/

    private List <Comment>  listaDeComentarios = new ArrayList<>();

    //construtores
    public Post(){

    }

    public Post(Instant dataDoPost, String tituloDoPost, String conteudoDopost, Integer numeroDeLikes){
        this.dataDoPost = dataDoPost;
        this.tituloDopost = tituloDoPost;
        this.conteudoDopost = conteudoDopost;
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

    public String getConteudoDopost() {
        return conteudoDopost;
    }
    public void setConteudoDopost(String conteudoDopost) {
        this.conteudoDopost = conteudoDopost;
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

    //metodo toString usando StringBuilder
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(tituloDopost + "\n");
        sb.append(numeroDeLikes);
        sb.append(" likes - ");

        //Converte o "Instant" para "Date" antes de formatar
        sb.append(sdf.format(Date.from(dataDoPost)) + "\n");


        sb.append(conteudoDopost + "\n");
        sb.append("comentarios: " + "\n");

        //adicionando os comentarios da lista no String Builder
        for (Comment comentario : listaDeComentarios){
            sb.append(comentario.getComentarios() + "\n");
        }

        //converte o objeto "sb" para "String" e retorna ele
        return sb.toString();

    }


}
