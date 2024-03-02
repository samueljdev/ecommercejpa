insert into tb_produto (id, nome, preco, descricao) values (default, 'Kindle', 499.0, 'Conheça o novo Kindle, agora com iluminação embutida ajustável, que permite que você leia em ambientes abertos ou fechados, a qualquer hora do dia.');
insert into tb_produto (id, nome, preco, descricao) values (default, 'Câmera GoPro Hero 7', 1400.0, 'Desempenho 2x melhor.');

insert into tb_cliente (id, nome, sexo) values (default, 'Fernanda Fernandez', 'FEMININO');
insert into tb_cliente (id, nome, sexo) values (default, 'Fernanda Lemos', 'FEMININO');

insert into tb_pedido (id, cliente_id, data_pedido, total, status) values (default, 1, sysdate(), 100.0, 'AGUARDANDO');

insert into tb_item_pedido (id, pedido_id, produto_id, preco_produto, quantidade) values (default, 1, 1, 5.0, 2);

insert into tb_categoria (id, nome) values (default, 'Eletrônicos');