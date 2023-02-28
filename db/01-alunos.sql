
CREATE DATABASE alunos;

\c alunos;

CREATE TABLE alunos (
    "id" INT NOT NULL,
    "created_at" TIME NOT NULL,
    "external_id" VARCHAR(36) NOT NULL,
    "nome" VARCHAR(100) NOT NULL,
    "endereco" VARCHAR(250) NOT NULL,
    "curso" VARCHAR(250) NOT NULL,
    "periodo" INT NOT NULL
);


INSERT INTO alunos (id, external_id, created_at, nome, endereco, curso, periodo)
VALUES (1, '349bc903-fad5-4c91-bc4d-e1c5e0e5e923', '2019-02-07 00:00:00', 'Gabriela Barbosa', 'Estrada Sana Efigenia, 339 casa 27', 'Fisica', 1);

INSERT INTO alunos (id, external_id, created_at, nome, endereco, curso, periodo)
VALUES (2, '049ced06-d453-484c-8ce5-e55ed4e9cfab','2019-02-07 00:00:00', 'Andrew Silva', 'Rua José Maria de Abreu 436, Realengo', 'Matematica', 2);

INSERT INTO alunos (id, external_id, created_at, nome, endereco, curso, periodo)
VALUES (3, '6ec5e5cf-37e0-4c30-a8c6-e1d7d29b3f5d', '2019-02-07 00:00:00', 'Marcos Gabriel', 'Avenida das americas 500, Barra da Tijuca', 'Letras', 3);