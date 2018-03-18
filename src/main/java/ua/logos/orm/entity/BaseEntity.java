
package ua.logos.orm.entity;

@MappedSuperclass
// @Getter @Setter
@Data
public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

}
