drop table information
create table information(info_id int primary key, info_key varchar(250), info_value varchar(4000))
drop table aventure
create table aventure(avt_id int primary key,avt_label varchar(250))
drop table section
create table section(sec_id int primary key, sec_avt_id int, sec_page int, sec_text varchar(4000))
drop table redirection
create table redirection(red_id int primary key,red_sec_page_from int, red_sec_page_to int, red_label varchar(1000))
drop table fighting
create table fighting(fig_id int primary key,fig_sec_page int, fig_ene_code varchar(500))
drop table enemy
create table enemy(ene_id int primary key, ene_code varchar(100), ene_name varchar(500), ene_stamina int, ene_fitness int)
drop table preaction
create table preaction(pac_id int primary key, pac_sec_page int, pac_attribute varchar(50), pac_method varchar(1), pac_value int)

insert into information (info_id,info_key,info_value) values (1,'VERSION','0.1')
--insert into enemy (ene_id,ene_code,ene_name,ene_stamina,ene_fitness) values (1, 'DEFAULT', 'Default', 20, 10)
--insert into enemy (ene_id,ene_code,ene_name,ene_stamina,ene_fitness) values (2, 'LICORNE', 'Licorne', 22, 11)
--insert into section (sec_id,sec_page,sec_text) values (1,1,'Bienvenue dans le monde de .... si vous désirez allez à droite rendez vous en 2 sinon rendez vous en 3')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (1,1,2,'droite')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (2,1,3,'tout droit')
--insert into section (sec_id,sec_page,sec_text) values (2,2,'Vous arrivez dans une étrange clairière ... une licorne ... passez près de la licorne rendez vous en 4 sinon rendez vous en 5')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (3,2,4,'licorne')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (4,2,5,'continuer')
--insert into section (sec_id,sec_page,sec_text) values (3,3,'Un long sentier s''offre devant vous, vous remarquez ... traversez à la nage rendez vous en 6 ou passez le pont rendez vous en 5')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (5,3,6,'nage')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (6,3,5,'pont')
--insert into section (sec_id,sec_page,sec_text) values (4,4,'La licorne vous charge, vous devez vous battre !')
--insert into redirection (red_id,red_sec_page_from,red_sec_page_to,red_label) values (7,4,3,'continuer')
--insert into fighting (fig_id,fig_sec_page,fig_ene_code) values (1,4,'LICORNE')
--insert into section (sec_id,sec_page,sec_text) values (5,5,'Tout vas bien pour le moment')
--insert into section (sec_id,sec_page,sec_text) values (6,6,'Le courant vous emporte, vous êtes mort')
--insert into preaction (pac_id, pac_sec_page, pac_attribute, pac_method, pac_value) values (1, 6, 'stamina', '=', -1)