package mx.gob.senasica.quetetraes.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuario", schema = "login")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -3846394731209089675L;
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "id_usuario", unique = true)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellidos")
	private String aps;

	@Column(name = "correo", unique = true)
	private String correo;

	@Column(name = "cargo")
	private String cargo;

	@Column(name = "nombre_usuario", unique = true)
	private String nombreUsuario;

	@Column(name = "contrasenia")
	private String contrasenia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_edicion")
	private Date fechaEdicion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_registro")
	private Date fechaRegistro;

	@Column(name = "estatus")
	private boolean estatus;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "perfil_usuario",schema = "login", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_rol"))
	private Set<Rol> roles = new HashSet<>();

	public Usuario() {

	}
	

	public Usuario(Long id, String nombre, String aps, String correo, String cargo, String nombreUsuario,
			String contrasenia, Date fechaEdicion, Date fechaRegistro, boolean estatus, Set<Rol> roles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.aps = aps;
		this.correo = correo;
		this.cargo = cargo;
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia;
		this.fechaEdicion = fechaEdicion;
		this.fechaRegistro = fechaRegistro;
		this.estatus = estatus;
		this.roles = roles;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAps() {
		return aps;
	}

	public void setAps(String aps) {
		this.aps = aps;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(Date fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}
	
















}
