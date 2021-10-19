use sys;
CREATE TABLE Student(
studentID INT NOT NULL AUTO_INCREMENT,
FName VARCHAR(20),
LName VARCHAR(20),
Address VARCHAR(30),
City VARCHAR(15),
Marks INT,
PRIMARY KEY(studentID)
);

create  TABLE teacher(
teacherID INT NOT NULL AUTO_INCREMENT,
FName VARCHAR(20),
LName VARCHAR(20),
Address VARCHAR(30),
PRIMARY KEY(teacherID)
);

CREATE TRIGGER calculate
before INSERT 
ON student
FOR EACH ROW
SET new.marks = new.marks+100;
insert into Student (studentID, FName, LName, Address, City, Marks) values(4, "vimal" , "jose" , "kottayam", "kottayam", 5);
insert into teacher (teacherID, fName, lName, Address) values(4, "james" , "mathew" , "kottayam");
select * from Student;
select * from teacher;

CREATE VIEW newrecord AS
SELECT Student.Fname, teacher.LName
FROM Student, teacher;

select* from newrecord;
