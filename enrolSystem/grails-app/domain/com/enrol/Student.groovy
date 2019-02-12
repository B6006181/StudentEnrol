package com.enrol

class Student {
String studentname
String studentID
Date dob
Boolean isFundingAvailable
String studentEmail
String studentUsername
String studentPassword
Course course
    static constraints = {
studentname blank:false, nullable:false
studentID blank:false, nullable:false
dob blank:false, nullable:false
isFundingAvailable blank:false, nullable:false
studentEmail blank:false, nullable:false, email:true
studentUsername blank:false, nullable:false
studentPassword blank:false, nullable:false
course blank:false, nullable:false
    }
}
