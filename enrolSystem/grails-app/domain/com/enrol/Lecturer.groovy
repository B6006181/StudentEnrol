package com.enrol

class Lecturer {
String fullName
String post
String subject
String lecturerEmail
String office
String bio
    static constraints = {
fullName blank:false, null:false
post blank:false, null:false
subject blank:false, null:false
lecturerEmail blank:false, null:false, email:true
office blank:false, null:false
bio blank:false, null:false, maxSize:5000, widget:'textarea'
    }
}
