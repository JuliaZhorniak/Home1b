package ua.logos.orm.entity;



@Entity
@Table(name = "teacher")
@Getter
@Setter
@NoArgsConstructor
public class Teacher extends BaseEntity {

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_details_id")
	private TeacherDetails teacherDetails;

	@OneToMany(mappedBy = "teacher")
	private List<Course> courses = new ArrayList<>();

}