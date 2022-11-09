create database QuanLySinhVien;

create table Class(
	ClassID int,
    ClassName nvarchar(50),
    StartDate date,
    Statuss bit,
    constraint pk_classID primary key(CLassID)
);

create table Student(
	StudentID int,
    StudentName nvarchar(50),
    Address nvarchar(50),
    Phone varchar(10),
    Statuss bit,
    ClassID int,
    constraint pk_studentID primary key(StudentID),
    constraint fk_ClassID foreign key(ClassID) references Class(ClassID)
);

create table Subjects(
	SubID int,
    SubName nvarchar(50),
    Credit int,
    Statuss bit,
    constraint pk_SubID primary key(SubID)
);

create table Mark(
	MarkID int,
    SubID int,
    StudentID int,
    Mark int,
    ExamTimes int,
    constraint pk_MarkID primary key(MarkID),
    constraint fk_subID foreign key(SubID) references Subjects(SubID),
    constraint fk_studentID foreign key(StudentID) references Student(StudentID)
);



INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);

INSERT INTO Student (StudentID, StudentName, Address, Phone, Statuss, ClassId)
VALUES (1, 'Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentID, StudentName, Address, Statuss, ClassId)
VALUES (2, 'Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentID, StudentName, Address, Phone, Statuss, ClassId)
VALUES (3, 'Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subjects
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (MarkID, SubId, StudentId, Mark, ExamTimes)
VALUES (1 ,1, 1, 8, 1),
       (2, 1, 2, 10, 2),
       (3, 2, 1, 12, 1);
       
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’       
Select StudentName
from Student s
where s.studentName Like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
Select * from Class
where month(quanlysinhvien.Class.Startdate) = '12';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
Select * from Subjects
where subjects.Credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2
update student
set ClassID = 2
where StudentName = 'hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.StudentName, subjects.SubName, mark.Mark
from student
join mark on student.StudentID = mark.StudentID
join subjects on subjects.SubID = mark.SubID
order by mark desc;

