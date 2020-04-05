DROP TABLE IF EXISTS billionaires;

CREATE TABLE taxRegistry (
  nationalId INT NOT NULL PRIMARY KEY,
  panNumber VARCHAR(250) NOT NULL,
  taxSlab VARCHAR(250) NOT NULL,
  taxDefaulter INT NOT NULL DEFAULT 0,
  taxRegistryDate date not null
);

INSERT INTO taxRegistry (nationalId,panNumber,taxSlab,taxDefaulter,taxRegistryDate) VALUES
(1001, 'PAN1001', 'LOW', 0, '2018-01-25'),
(1002, 'PAN1002', 'LOW', 0, '2018-01-25'),
(1003, 'PAN1003', 'MEDIUM', 1, '2016-01-25'),
(1004, 'PAN1004', 'MEDIUM', 0, '2017-01-25'),
(1005, 'PAN1005', 'MED-HIGH', 0, '2015-01-25');

CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nationalId INT NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL,
  FOREIGN KEY (nationalId) REFERENCES taxRegistry(nationalId)
);

INSERT INTO billionaires (first_name, nationalId, last_name, career) VALUES
  ('Aliko', 1001, 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 1002, 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 1003, 'Alakija', 'Billionaire Oil Magnate');

