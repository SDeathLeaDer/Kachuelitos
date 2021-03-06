package kachuelitos.persistence.entity;

// Generated 17-jul-2014 1:32:08 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Comentario generated by hbm2java
 */
@Entity
@Table(name = "comentario", catalog = "mydb")
public class Comentario implements java.io.Serializable {

	private ComentarioId id;
	private String descripcionComentario;
	private String detalleComentario;

	public Comentario() {
	}

	public Comentario(ComentarioId id) {
		this.id = id;
	}

	public Comentario(ComentarioId id, String descripcionComentario,
			String detalleComentario) {
		this.id = id;
		this.descripcionComentario = descripcionComentario;
		this.detalleComentario = detalleComentario;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idTrabajo", column = @Column(name = "idTrabajo", nullable = false)),
			@AttributeOverride(name = "dniuser", column = @Column(name = "DNIUser", nullable = false)),
			@AttributeOverride(name = "idTrabajador", column = @Column(name = "idTrabajador", nullable = false)) })
	public ComentarioId getId() {
		return this.id;
	}

	public void setId(ComentarioId id) {
		this.id = id;
	}

	@Column(name = "DescripcionComentario", length = 45)
	public String getDescripcionComentario() {
		return this.descripcionComentario;
	}

	public void setDescripcionComentario(String descripcionComentario) {
		this.descripcionComentario = descripcionComentario;
	}

	@Column(name = "DetalleComentario", length = 145)
	public String getDetalleComentario() {
		return this.detalleComentario;
	}

	public void setDetalleComentario(String detalleComentario) {
		this.detalleComentario = detalleComentario;
	}

}
