import java.util.List;
import java.util.ArrayList;

class Student extends Personas{



    private float averageGrade;

    private List<Course> enrolledCourses;

    public Student(String id, String name, float averageGrade) {
        super(id,name);
        this.enrolledCourses = enrolledCourses;
        this.averageGrade = 0f;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setAverageGrade(float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public boolean enrroll(Course course) {
        if (enrolledCourses == null) {
            enrolledCourses = new ArrayList<Course>();
        }
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "averageGrade=" + averageGrade +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }
}

