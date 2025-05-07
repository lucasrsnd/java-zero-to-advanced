INSERT INTO cidades (nome, area, estado_id)
VALUES
    ('Salvador', 706.80, 72),
    ('Fortaleza', 313.80, 73),
    ('Brasília', 5802.00, 74),
    ('Vitória', 93.38, 75),
    ('Goiânia', 739.50, 76),
    ('São Luís', 834.80, 77),
    ('Cuiabá', 3524.50, 78),
    ('Campo Grande', 8096.05, (SELECT id FROM estados WHERE sigla = 'MS'));