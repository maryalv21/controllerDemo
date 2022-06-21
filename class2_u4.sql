-- CREATE SCHEMA class2_u4;
-- CREATE SCHEMA class2_u4_test;

USE class2_u4;

CREATE TABLE course(
    course_code VARCHAR(6) NOT NULL,
    course_name VARCHAR(255),
    PRIMARY KEY(course_code)
);

INSERT INTO course (course_code, course_name) VALUES
('CS101', 'Intro to Java'),
('CS103', 'Databases');