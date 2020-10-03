package com.practice.test2;

public class Teacher extends SchoolMember {

    private String[] courses;
    private int[] credits;
    private int[] feedbacks;
    private int numCourses;
    private static final int MAX_NUMBER_OF_COURSES = 10;
    private static final int REQUIRED_PERCENTAGE_FOR_PROMOTION = 60;


    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[MAX_NUMBER_OF_COURSES];
        this.credits = new int[MAX_NUMBER_OF_COURSES];
        this.feedbacks = new int[MAX_NUMBER_OF_COURSES];
        this.numCourses = 0;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }

    public boolean floatCourse(String course, int credit) {
        for(int i = 0; i < this.numCourses; i++) {
            if (this.courses[i].compareTo(course) == 0) {
                return false;
            }
        }
        this.courses[this.numCourses] = course;
        this.credits[this.numCourses] = credit;
        this.numCourses++;
        return true;
    }

    public boolean addFeedback(String course, int feedback) {
        for (int i = 0; i < this.numCourses; i++) {
            if (this.courses[i].compareTo(course) == 0) {
                this.feedbacks[i] = feedback;
                return true;
            }
        }
        return false;
    }

    public int getAverageFeedback() {
        int averageFeedback = 0;
        if (this.numCourses > 0) {
            for (int i = 0; i < this.numCourses; i++) {
                averageFeedback += this.feedbacks[i];
            }
            averageFeedback /= this.numCourses;
        }
        this.setChanceOfPromotion(averageFeedback);
        return averageFeedback;
    }


}
