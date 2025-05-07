select 
    regiao as 'Região',
    sum(populacao) as Total
from `estados`
group by regiao
