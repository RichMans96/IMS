DROP TABLE IF EXISTS `customers`;
DROP TABLE IF EXISTS `items`;
DROP TABLE IF EXISTS `orders`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `items` (
    `item_id` INT(11) NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `item_price` DOUBLE(8, 2) DEFAULT NULL,
    PRIMARY KEY (`item_id`) 
);

CREATE TABLE IF NOT EXISTS `orders` (
   `order_id` INT(11) NOT NULL AUTO_INCREMENT,
   `id` INT(11),
   `item_id` INT(11),
   `qty` INT (10),
   `total_cost` DOUBLE(12, 2),
   PRIMARY KEY (`order_id`),
   FOREIGN KEY (`id`) REFERENCES customers(`id`),
   FOREIGN KEY (`item_id`) REFERENCES items(`item_id`)
);
