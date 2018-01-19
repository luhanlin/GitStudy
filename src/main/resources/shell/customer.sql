CREATE TABLE IF NOT EXISTS `DEMO`.`CUSTOMER`(
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(255) DEFAULT NULL,
  `CONTACT` VARCHAR(255) DEFAULT NULL,
  `TELEPHONE` VARCHAR(255) DEFAULT NULL,
  `EMAIL` VARCHAR(255) DEFAULT NULL,
  `REMARK` TEXT,
  PRIMARY KEY (`ID`)
) ENGINE=INNODB DEFAULT CHARSET=UTF8;

insert into customer values (1,"customer01","jack","13674857223","22218737@qq.com",null);
insert into customer values (2,"customer02","allen","1323485723","22223737@qq.com",null);
insert into customer values (3,"customer03","nice","13673532572","34218737@qq.com",null);
insert into customer values (4,"customer04","huke","136742ee372","22245737@qq.com",null);