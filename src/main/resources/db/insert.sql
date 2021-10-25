set foreign_key_checks=0;

truncate table product;
truncate table feedback;


insert into product(`id`, `currency`, `details`, `name`, `price`)
values (2, 'USD', 'black ivory luxury ergonomic desk', 'Luxury desk', 2000.00),
(3, 'GHC', 'brown ergonomic work bench', 'Work bench', 560.00),
(4, 'GBP', 'blue work chair with lumbar support', 'Chair', 1250.00),
(5, 'CAD', 'soft brown living room carpet', 'Carpet', 869.99);

set foreign_key_checks=1;
