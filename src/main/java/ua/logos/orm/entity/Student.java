package ua.logos.orm.entity;



@Entity
@Table(name = "student")
@Getter @Setter
@NoArgsConstructor
public class Student extends BaseEntity {

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "age")
	private int age;

	@ManyToMany
	@JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> courses = new ArrayList<>();

	

}