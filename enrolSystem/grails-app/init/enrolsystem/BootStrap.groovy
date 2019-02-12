package com.enrol

class BootStrap {

    def init = { servletContext ->
def computing=new
Course(
department: 'Computing',
courseCode: 'cs123',
courseTitle: 'BSc Hon Computing',
courseLeader: 'Dr Michelle Murphy',
startDate:new Date ('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents: 55,
studyMode: 'Fulltime',
tuitionFees: 9000.60,
description: 'lorem ipsumdolor sit amet, cum sale error tantas ne. te duo putant detracto. in duo sonet urbanitas, ad vim vide tacimates').save()

def Networks=new
Course(
department: 'Computing Networks',
courseCode: 'cs13',
courseTitle: 'BSc Hon Computing Networks',
courseLeader: 'Dr Mike Orville',
startDate:new Date ('09/09/2019'),
endDate:new Date('07/07/2023'),
numberOfStudents: 50,
studyMode: 'Fulltime',
tuitionFees: 9000.60,
description: 'lorem sit amet, cum sale error tantas ne. te duo putant detracto. in duo sonet urbanitas, ad vim vide tacimates').save()

def lecturer=new
Lecturer(
fullName:'Picard John Luke',
post:'officer',
subject:'Egineering',
lecturerEmail:'Picard@Picard.net',
office:'Bridge',
bio:'The Best').save()

def lecturers=new
Lecturer(
fullName:'Janeway',
post:'officer',
subject:'Science',
lecturerEmail:'Janeway@Janeway.net',
office:'Core',
bio:'The ready').save()

def busy=new
Student(
studentname:'Sisko',
studentID:'101',
dob:new Date('04/10/1992'),
isFundingAvailable:true,
studentEmail:'sisko@sisko.net',
studentUsername:'Sisko',
studentPassword:'fhfjdy',
course:computing).save()

def beez=new
Student(
studentname:'Tom Scott',
studentID:'121',
dob:new Date('06/11/1995'),
isFundingAvailable:true,
studentEmail:'tom@tom.net',
studentUsername:'tom',
studentPassword:'jfjfh',
course:computing).save()

def Tea=new
Module(
module_title:'Programming',
module_code:'mh65',
credits:100,
lecturer:'Another person in a job',
course:'computing',
description:'Turn up, do your work and go home').save()

def coffee=new
Module(
module_title:'Software',
module_code:'mh66',
credits:90,
lecturer:'Another person in a job',
course:'computing',
description:'Turn up, do your work and go home and try to learn').save()

    }
    def destroy = {
    }
}
