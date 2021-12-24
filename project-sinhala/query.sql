-- insert 
INSERT INTO tbl_subject VALUES (1,'Maths')
INSERT INTO tbl_subject (subject_name) VALUES ('Science')

-- select 
SELECT * FROM tbl_subject
SELECT subject_name FROM tbl_subject
SELECT id,nic,fname,lname FROM tbl_student WHERE id = 1
SELECT * FROM tbl_student WHERE gender = 'M' AND city = 'Negombo' 

-- update 
UPDATE tbl_subject SET subject_name = 'Sinhala' WHERE id = 2

-- delete 
DELETE FROM tbl_subject WHERE id = 2


TRUNCATE tbl_subject