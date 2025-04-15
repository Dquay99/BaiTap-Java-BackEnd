package Buoi9.BaiTap;

class CourseAlreadyRegisteredException extends Exception{
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

}
