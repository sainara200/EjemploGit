package model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


/**
 * The persistent class for the tb_tipos database table.
 * 
 */
@Getter
@Setter
@NoArgsConstructor



@Entity
@Table(name="tb_tipos")
@NamedQuery(name="Tipo.findAll", query="SELECT t FROM Tipo t")
public class Tipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idtipo;

	private String descripcion;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="tbTipo")
	private List<Usuario> tbUsuarios;

 

}