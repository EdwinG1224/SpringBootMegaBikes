CREATE TABLE motos(id INT NOT NULL AUTO_INCREMENT, name VARCHAR(128) NOT NULL, model VARCHAR(128) NOT NULL, chasis_num INT NOT NULL, motor_num int, avalaibility int, PRIMARY KEY(id));

CREATE TABLE types(value_id INT NOT NULL, meaning VARCHAR(128) NOT NULL, type VARCHAR(128) NOT NULL, PRIMARY KEY(value_id));

INSERT INTO motos(name, model, chasis_num, motor_num)
VALUES  ('Kawasaki', 'ZX10R', 3214, 4123),
        ('BMW', 'S1000RR', 9876, 6789),
        ('Ducati', 'Panigale', 4567, 7654),
        ('Pulsar', 'NS200', 1224, 4221);

INSERT INTO types(value_id, meaning, type)
VALUES (1, 'DISPONIBLE', 'avalaibility' ),
       (2, 'PEDIDO', 'avalaibility' ),
       (3, 'INEXISTENTE', 'avalaibility' );