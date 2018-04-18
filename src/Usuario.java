import java.util.ArrayList;

public class Usuario {
	private String usuario;
	private String senha;

	static ArrayList<Usuario> usuarios = new ArrayList<>();

	public void inserirUsuario(Usuario usuario) {
		usuarios.add(usuario);
		imprimirUsuario();
	}

	public boolean verificarUsuario(Usuario usuario) {
		for (Usuario usuario2 : usuarios) {
			if (usuario.usuario.equals(usuario2.usuario)) {
				return true;
			}
		}
		return false;
	}

	public void imprimirUsuario() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.usuario);
		}
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	private void validarUsuario(Usuario usuario) {

	}
}
