-- Create the COURSE table first
CREATE TABLE COURSE (
    ID INT PRIMARY KEY,
    COURSE_NAME VARCHAR(255),
    COURSE_DURATION VARCHAR(255),
    COURSE_FEE DECIMAL
);

-- Insert data into the COURSE table
INSERT INTO COURSE(ID, COURSE_NAME, COURSE_DURATION, COURSE_FEE) 
VALUES(1, 'JAVA', '5.MONTHS', 25000.00);