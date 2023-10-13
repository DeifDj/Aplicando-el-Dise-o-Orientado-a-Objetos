import java.util.List;

class Mentor extends Personas{



    private float yearsOfExperience;

    private boolean isActive;

    private List<Course> coursesToTeach;

    public Mentor(String id, String name, float yearsOfExperience, boolean isActive, List<Course> coursesToTeach){
        super(id, name);
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = isActive;
        this.coursesToTeach = coursesToTeach;
    }



    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public boolean isActive() {
        return isActive;
    }


    public List<Course> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setCoursesToTeach(List<Course> coursesToTeach) {
        this.coursesToTeach = coursesToTeach;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", isActive=" + isActive +
                ", coursesToTeach=" + coursesToTeach +
                '}';
    }
}
