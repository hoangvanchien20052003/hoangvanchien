select * from subjects
where Credit >= all(select Credit from subjects);

select * from subjects
join mark on subjects.SubID = mark.SubID
where Mark >= all(select Mark from mark);

select *, avg(mark.mark) as 'diemtrungbinh' from student
join mark on student.StudentID = mark.StudentID
group by student.StudentID
order by 'diemtrungbinh' desc;