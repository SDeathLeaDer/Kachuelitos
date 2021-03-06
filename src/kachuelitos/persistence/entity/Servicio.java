package kachuelitos.persistence.entity;

// Generated 17-jul-2014 1:32:08 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Servicio generated by hbm2java
 */
@Entity
@Table(name = "servicio", catalog = "mydb")
public class Servicio implements java.io.Serializable {

	private int idServicio;
	private String descripcionServicio;
	private String detalleServicio;

	public Servicio() {
	}

	public Servicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public Servicio(int idServicio, String descripcionServicio,
			String detalleServicio) {
		this.idServicio = idServicio;
		this.descripcionServicio = descripcionServicio;
		this.detalleServicio = detalleServicio;
	}

	@Id
	@Column(name = "idServicio", unique = true, nullable = false)
	public int getIdServicio() {
		return this.idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	@Column(name = "DescripcionServicio", length = 45)
	public String getDescripcionServicio() {
		return this.descripcionServicio;
	}

	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}

	@Column(name = "DetalleServicio", length = 45)
	public String getDetalleServicio() {
		return this.detalleServicio;
	}

	public void setDetalleServicio(String detalleServicio) {
		this.detalleServicio = detalleServicio;
	}

}
