package students_project;

import students_project.products.coursesProducts.Course;
import students_project.products.degreeDocumentProducts.DegreeDocument;
import students_project.products.paperProducts.Paper;

public class Student {
    String type;
    Course course;
    Paper paper;
    DegreeDocument document;

    public String getType() {
        return type;
    }

    public Student withType(String type) {
        this.type = type;
        return this;
    }

    public Course getCourse() {
        return course;
    }

    public Student withCourse(Course course) {
        this.course = course;
        return this;
    }

    public Paper getPaper() {
        return paper;
    }

    public Student withPaper(Paper paper) {
        this.paper = paper;
        return this;
    }

    public DegreeDocument getDocument() {
        return document;
    }

    public Student withDocument(DegreeDocument document) {
        this.document = document;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "type='" + type + '\'' +
                ", course=" + course +
                ", paper=" + paper +
                ", document=" + document +
                '}';
    }
}
