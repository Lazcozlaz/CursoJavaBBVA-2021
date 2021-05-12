insert into figuras(fig_tipo, fig_nombre, fig_lado)  values(1,"cua1", 10)
insert into figuras(fig_tipo, fig_nombre, fig_radio)  values(2,"cir1", 10)
insert into figuras(fig_tipo, fig_nombre,fig_base, fig_altura )  values(4,"trianuglo1", 10, 8.4)
insert into figuras(fig_tipo, fig_nombre,fig_base, fig_altura )  values(3,"rect1", 12.3, 8.4)
insert into figuras(fig_tipo, fig_nombre,fig_lado, fig_numlados,fig_apotema )  values(5,"polig1", 10,6, 6.2)

update figuras
set FIG_NOMBRE ='cuadrado' where FIG_TIPO = 1

update figuras
set FIG_NOMBRE ='circulo' where FIG_TIPO = 2

update figuras
set FIG_NOMBRE ='triangulo' where FIG_TIPO = 4

update figuras
set FIG_NOMBRE ='rectangulo' where FIG_TIPO = 3

update figuras
set FIG_NOMBRE ='poligono' where FIG_TIPO = 5