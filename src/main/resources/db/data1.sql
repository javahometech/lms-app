CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);


INSERT INTO users (id, username, password, email) VALUES (1, 'Nandini', 'nandhu123', 'nandininandu@gmail.com');
INSERT INTO users (id, username, password, email) VALUES (2, 'Ramya', 'ramya456', 'athurramya654@gmail.com');
INSERT INTO users (id, username, password, email) VALUES (3, 'Poojitha', 'pooji789', 'bollupoojitha@gmail.com');
