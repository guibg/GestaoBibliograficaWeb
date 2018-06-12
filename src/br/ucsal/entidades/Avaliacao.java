package br.ucsal.entidades;

public class Avaliacao {
	private int id;
    private Usuario id_usuario;
    private Bibliografia id_bibliografia;
    private int nota;
   private  String comentario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Bibliografia getId_bibliografia() {
        return id_bibliografia;
    }

    public void setId_bibliografia(Bibliografia id_bibliografia) {
        this.id_bibliografia = id_bibliografia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
