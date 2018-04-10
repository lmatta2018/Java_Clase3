package pe.edu.cibertec.proyemp.jpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_DEPARTAMENTO")
public class Departamento {
	
	@Id
	@GeneratedValue
	@Column(name="DEP_ID", nullable = false, unique = true)
	private Long id;
	
	@Column(name="DEP_NOMBRE", nullable = false, unique = true)
	private String nombre;
	
	@OneToMany(mappedBy="departamento", cascade=CascadeType.PERSIST)
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	
	public Departamento(){}

	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
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

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	
}
