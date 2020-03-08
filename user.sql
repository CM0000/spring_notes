/*
SQLyog Ultimate v8.32 
MySQL - 5.5.27 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `user` (
	`id` double ,
	`username` varchar (288),
	`jifen` double 
); 
insert into `user` (`id`, `username`, `jifen`) values('1','张三','90');
insert into `user` (`id`, `username`, `jifen`) values('2','李四','100');
