
REPLACE INTO Course (course_id, course_name, trainer, duration_in_weeks)
VALUES 
    ('C101', 'Java Programming', 'Mr. Anand', 5),
    ('C102', 'Python Programming', 'Mr. Dhana', 6),
    ('C103', 'C++ Programming', 'Mr. Mohan', 7);
show tables
select * from Course;
desc course_regis
select * from course_registry;

insert into course_registry(coursename,emailId,name)
values("python for ML","dhanapriyan81@gmail.com","dhana")

