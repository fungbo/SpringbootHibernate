DROP TABLE IF EXISTS users;

CREATE TABLE users (
  `id` INT(5) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(20) DEFAULT '',
  `msisdn` VARCHAR(20) NOT NULL,
  `region` VARCHAR(10),
  `birthday` DATE,
  `group` INT(4) DEFAULT 0,
  PRIMARY KEY (id),
  UNIQUE (msisdn)
);

INSERT INTO users VALUES (0, 'mike', '139', 'A1', '1982-01-01', 0);
INSERT INTO users (name, msisdn, region, birthday, `group`) VALUES
  ('jack', '138', 'A2', '1980-02-02', 1),
  ('yale', '136', 'A3', '1981-03-03', 2);
INSERT INTO users (name, msisdn, region, birthday) VALUES
  ('james', '135', 'B1', '1990-10-10');

select * from users;
