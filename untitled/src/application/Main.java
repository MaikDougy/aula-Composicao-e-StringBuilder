package application;

import entities.Comment;
import entities.Post;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comentario1 = new Comment("Have a nice trip! ");
        Comment comentario2 = new Comment("Wow that s awesome ");
        Date data1 = sdf.parse("21/06/2018 13:05:44");

        //converte o objeto tipo "Date" para o tipo "Instant"
        Instant i1 = data1.toInstant();

        Post post1 = new Post(i1,
                "Traveling to new Zeeland",
                "im going to visit this wonderful country",
                12);

        post1.adicionrComentario(comentario1);
        post1.adicionrComentario(comentario2);

        System.out.println(post1.toString());






        leitor.close();
    }
}