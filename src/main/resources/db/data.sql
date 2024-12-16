INSERT INTO STUDENTS (id, first_name, last_name, date_of_birth, email) VALUES 
					 (1, 'Ashley', 'Miller', '1999-12-01', 'ashleymiller@gmail.com');

INSERT INTO STUDENTS (id, first_name, last_name, date_of_birth, email) VALUES 
				 	 (2, 'Julia', 'Lopez', '1999-08-25', 'julialopez@gmail.com');
				 	 
INSERT INTO STUDENTS (id, first_name, last_name, date_of_birth, email) VALUES 
					 (3, 'Eric', 'Smith', '2002-03-15', 'ericsmith@gmail.com');

INSERT INTO STUDENTS (id, first_name, last_name, date_of_birth, email) VALUES 
				 	 (4, 'Joel', 'Hernandez', '2001-10-12', 'jhernandez@gmail.com');
				 	 
INSERT INTO STUDENTS (id, first_name, last_name, date_of_birth, email) VALUES 
				 	 (5, 'Chelsey', 'Woods', '1999-06-12', 'woordsc@gmail.com');

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);


INSERT INTO users (id, username, password, email) VALUES (1, 'Nandini', 'nandhu123', 'nandininandu@gmail.com');
INSERT INTO users (id, username, password, email) VALUES (2, 'Ramya', 'ramya456', 'athurramya654@gmail.com');
INSERT INTO users (id, username, password, email) VALUES (3, 'Poojitha', 'pooji789', 'bollupoojitha@gmail.com');
