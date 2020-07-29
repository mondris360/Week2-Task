

// composition
public class School {
    private Principal principal;
    private Teacher teacher;
    private  NoneAcademyStaff noneAcademyStaff;
    private Student student;

    public School(Principal principal, Teacher teacher, NoneAcademyStaff noneAcademyStaff, Student student) {
        this.principal = principal;
        this.teacher = teacher;
        this.noneAcademyStaff = noneAcademyStaff;
        this.student = student;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public NoneAcademyStaff getNoneAcademyStaff() {
        return noneAcademyStaff;
    }

    public Student getStudent() {
        return student;
    }
}
