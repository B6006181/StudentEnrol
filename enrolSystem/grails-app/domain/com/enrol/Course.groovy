package com.enrol

class Course {
String department;
String courseTitle
String courseLeader
String courseCode
Date startDate
Date endDate
String description
int numberOfStudents
double tuitionFees
String studyMode
    static constraints = {
courseTitle blank:false, nullable:false
department blank:false, nullable:false
courseLeader blank:false, nullable:false
courseCode blank:false, nullable:false
numberOfStudents blank:false, nullable:false, minSize:20, maxSize:60
startDate blank:false, nullable:false
endDate blank:false, nullable:false
studyMode nullable:false, maxSize:20;
description nullable:false, maxsize:5000, widget:'textarea'
tuitionFees nullable:false, blank:false, scale:2
    }
}
