package ua.logos.orm.entity;


@Entity
@Table(name = "teacher_details")
@Getter
@Setter
@NoArgsConstructor
public class TeacherDetails extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "age")
	private int age;

	@Column(name = "hobby")
	private String hobby;

	@OneToOne(mappedBy = "teacherDetails")
	private Teacher teacher;

}