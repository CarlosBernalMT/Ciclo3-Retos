DROP TABLE IF EXISTS car;
CREATE TABLE car (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    brand VARCHAR(45) NOT NULL,
    year NUMBER(4) NOT NULL,
    description VARCHAR(250) NOT NULL);

INSERT INTO car (name, brand, year, description) VALUES
('Sentra', 'Nissan', 2015,'A nissan sentra from Nissan'),
('Civi', 'Honda', 2005, 'Honda civi from Madagascar'),
('Spark', 'Chevrolet', 2009, 'The shoesito');
