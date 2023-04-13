package model;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the tb_usuarios database table.
 * 
 */
@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name="tb_usuarios")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cod_usua")
	private int codUsua;

	@Column(name="ape_usua")
	private String apeUsua;

	@Column(name="cla_usua")
	private String claUsua;

	@Column(name="est_usua")
	private int estUsua;

	@Temporal(TemporalType.DATE)
	@Column(name="fna_usua")
	private Date fnaUsua;

	@Column(name="nom_usua")
	private String nomUsua;

	@Column(name="usr_usua")
	private String usrUsua;

	//bi-directional many-to-one association to CabBoleta
	@OneToMany(mappedBy="tbUsuario")
	private List<CabBoleta> tbCabBoletas;

	//bi-directional many-to-one association to Tipo
	@ManyToOne
	@JoinColumn(name="idtipo")
	private Tipo tbTipo;

	 

}