drop schema ims;
CREATE SCHEMA IF NOT EXISTS `ims`;

 

DROP TABLE IF EXISTS `items`;
CREATE TABLE IF NOT EXISTS `items`
(
   `item_id` INT (11) NOT NULL AUTO_INCREMENT,
   `item_name` VARCHAR (40) DEFAULT NULL,
   `item_price` DOUBLE (11) DEFAULT NULL,
   PRIMARY KEY (`item_id`)
);
DROP TABLE IF EXISTS `customers`;
CREATE TABLE IF NOT EXISTS `customers`
(
   `id` INT (11) NOT NULL AUTO_INCREMENT,
   `first_name` VARCHAR (40) DEFAULT NULL,
   `surname` VARCHAR (40) DEFAULT NULL,
   PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `orders`
CREATE TABLE IF NOT EXISTS `orders` (
   `order_id` INT(11) NOT NULL AUTO_INCREMENT,
   `id` INT(11) DEFAULT NULL,
   `item_id` INT(11) DEFAULT NULL,
   `qty` INT (10) DEFAULT NULL,
   `total_cost` DOUBLE(12),
   PRIMARY KEY (`order_id`),
   FOREIGN KEY (`id`) REFERENCES customers(`id`),
   FOREIGN KEY (`item_id`) REFERENCES items(`item_id`)
);





