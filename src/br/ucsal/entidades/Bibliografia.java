package br.ucsal.entidades;

public class Bibliografia {
	 private Integer id;
	    private Autor autor;
	    private String titulo;
	    private Integer edicao;
	    private String editora;
	    private Materia materia;
	    private Avaliacao avaliacao;

	    public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }

	    public Avaliacao getAvaliacao() {
	        return avaliacao;
	    }

	    public void setAvaliacao(Avaliacao avaliacao) {
	        this.avaliacao = avaliacao;
	    }

	    public Autor getAutor() {
	        return autor;
	    }

	    public void setAutor(Autor autor) {
	        this.autor = autor;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public int getEdicao() {
	        return edicao;
	    }

	    public void setEdicao(Integer edicao) {
	        this.edicao = edicao;
	    }

	    public Materia getMateria() {
	        return materia;
	    }

	    public void setMateria(Materia materia) {
	        this.materia = materia;
	    }

	    public String getEditora() {
	        return editora;
	    }

	    public void setEditora(String editora) {
	        this.editora = editora;
	    }
}
