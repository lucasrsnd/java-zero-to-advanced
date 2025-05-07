select 
    e.nome as Estado, 
    c.nome as Cidade, 
    e.regiao as REgião
    from estados
    inner join cidades c on e.id = c.estado_id
