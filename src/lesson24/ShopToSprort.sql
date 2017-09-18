CREATE DATABASE IF NOT EXISTS `shoptosport` DEFAULT CHARACTER SET utf8 ;
USE `shoptosport`;
CREATE TABLE `catalog` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;

CREATE TABLE `goods` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(250) NOT NULL,
	`category_id` INT(11) NOT NULL,
	`price` DOUBLE NOT NULL,
	`rank` INT(10) NOT NULL,
	PRIMARY KEY (`id`)
)basket
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=9;

CREATE TABLE `user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`login` VARCHAR(20) NULL DEFAULT NULL,
	`password` VARCHAR(20) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB;

CREATE TABLE `basket` (
	`user_id` INT(11) NOT NULL,
	`good_id` INT(11) NOT NULL,
	PRIMARY KEY (`user_id`, `good_id`),
	INDEX `user_id` (`user_id`),
	INDEX `good_id` (`good_id`),
	CONSTRAINT `FK__goods` FOREIGN KEY (`good_id`) REFERENCES `goods` (`id`),
	CONSTRAINT `FK__user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
)
ENGINE=InnoDB;

INSERT INTO `user` (`login`, `password`) VALUES 
			('milkina', 'milkina'),
			('roman', 'roman');
			
INSERT INTO `catalog` (`id`, `name`) VALUES (3, 'Child Clothes');
INSERT INTO `catalog` (`id`, `name`) VALUES (4, 'Inventory');
INSERT INTO `catalog` (`id`, `name`) VALUES (1, 'Men Clothes');
INSERT INTO `catalog` (`id`, `name`) VALUES (2, 'Wonen Clothes');

INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (1, 'Pierre Cardin Web Belt Mens Jeans', 1, 150.6, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (2, 'Firetrap Skinny Mens Jeans', 1, 2600, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (3, 'LA Gear Full Zip Hoody Ladies', 2, 600, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (4, 'LA Gear Full Zip Hoody Ladies', 2, 550.3, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (5, 'Team Football Sleepsuit Baby Boys', 3, 120, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (6, 'Character Pyjama Set Unisex Baby', 3, 220.9, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (7, 'Dunlop Rubber Ball', 4, 60, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (8, 'Wilson MVP Basketball', 4, 68, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (9, 'PLAYER DRESS AQUAMARINE', 2, 195, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (10, 'PLAYER SKIRT AQUAMARINE', 2, 145, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (11, 'VICTORY TANK CITRINE', 2, 90, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (12, 'ATHLETE LEGGINGS DARK SAPPHIRE', 2, 110, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (13, 'ESSENTIAL BRA DARK SAPPHIRE', 2, 92, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (14, 'FEATHERWEIGHT JACKET DARK SAPPHIRE', 2, 162, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (15, 'Action Windbreaker Dark Sapphire', 2, 168, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (16, 'Airstream Top White', 2, 75, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (17, 'Energy Leggings Mosaic Print', 2, 78, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (18, 'Energy Leggings Medina Print Lapis', 2, 175, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (19, 'SoulCal Embroidered Playsuit Ladies', 2, 17.99, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (20, 'Golddigga Jumpsuit Ladies', 2, 20.4, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (21, 'Pepe Jeans Jumpsuit Felton Ld52', 2, 79.5, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (22, 'Puma No1 Logo Ladies Hoody', 2, 33, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (23, 'Everlast 2 Way Zip Hoody Ladies', 2, 12.6, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (24, 'SoulCal Signature Zip Hoodie', 2, 33.2, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (25, 'Karrimor Aspen Zip Off Trousers Ladies', 2, 21, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (26, 'Craghoppers Kiwi Trousers Ladies', 2, 26.3, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (27, 'Slazenger Plain Golf Polo Shirt Ladies', 2, 29.59, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (28, 'Lonsdale Lion Polo Shirt Ladies', 2, 27.3, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (29, 'Dunlop Performance Polo Shirt Ladies', 2, 40, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (30, 'Miso Stripe Polo Shirt Ladies', 2, 19.29, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (31, 'Donnay 10 Pack Trainer Socks', 1, 3.6, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (32, 'Sondico Football Socks', 1, 6.3, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (33, 'Karrimor 2 Pack Running Socks Mens', 1, 5.4, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (34, 'Pierre Cardin V Neck Knit Jumper Mens', 1, 12.6, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (35, 'Nike Academy Mid Layer Top Mens', 1, 59.59, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (36, 'Nike Academy Mid Layer Top Mens', 1, 39.59, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (37, 'Pierre Cardin Crew Knit Jumper Mens', 1, 12.6, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES(38, 'Everlast Crew Sweater Mens', 1, 15.6, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (39, 'Firetrap Church Crew Sweater', 1, 10.79, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (40, 'Jack and Jones Core Cope Crew Sweater', 1, 10.5, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (41, 'Slazenger Plain T Shirt Mens', 1, 4.46, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (42, 'Pierre Cardin Print T Shirt Mens', 1, 6, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (43, 'adidas 3 Stripe Estro T Shirt Mens', 1, 18, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (44, 'Hot Tuna T Shirt Mens', 1, 5.4, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (45, 'Everlast Logo T Shirt Mens', 1, 9.6, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (46, 'Donnay 3 Pack T Shirts Mens', 1, 7.89, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (47, 'Firetrap Sub T Shirt', 1, 14.4, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (48, 'Karrimor 3 in 1 Jacket Mens', 1, 42.5, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (49, 'Gelert Packaway Jacket Mens', 1, 20.25, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (50, 'Karrimor Munro Trousers Mens', 1, 24, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (51, 'Nike Golf Storm Fit Waterproof Suit', 1, 99.99, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (52, 'Gelert Rain Jacket Unisex', 1, 15.69, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (53, '\r\nHelly Hansen Dinghy Smock Top Mens', 1, 16.98, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (54, 'No Fear Motocycle Pants Mens', 1, 120, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (55, 'Craghoppers Kiwi Pant Mens', 1, 18, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (56, 'Helly Hansen Ocean Jacket Mens', 1, 260, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (57, 'Helly Hansen Flekkerf Pant Mens', 1, 10.87, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (58, 'Dynafit Transalper Mens Jacket', 1, 52.39, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (59, 'Millet Touring Power Pants Mens', 1, 120, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (60, 'Millet Tribology GTX Jacket Mens', 1, 410, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (61, 'Karrimor Short Sleeved Running Top Girls', 3, 9.6, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (62, 'Karrimor 2 Pack Running Socks Junior', 3, 5.6, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (63, 'Karrimor Run Shorts Junior Boys', 3, 5.99, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (64, 'Karrimor Xlite Vest Junior Boys', 3, 5.99, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (65, 'Karrimor Xlite Vest Junior Boys', 3, 3, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (66, 'Karrimor Long Sleeved Running Top Girls', 3, 8.99, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (67, 'adidas TF Training Tights Junior Girls', 3, 19.2, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (68, 'Skins DNAmic Tights Junior Boys', 3, 22.1, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (69, 'Loffler Swt Transtex Jn44', 3, 32.4, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (70, 'Nike Tempo Running Shorts Junior', 3, 22.8, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (71, 'Slazenger Cricket Trousers Juniors', 3, 6.9, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (72, 'Kookaburra Elite Cricket Trousers Junior Boys', 3, 6.9, 10);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (73, 'New Balance England Test Shirt 2017 Junior', 3, 38.9, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (74, 'Slazenger Cricket Pro Briefs Junior Boys', 3, 4.5, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (75, 'Slazenger Full Zipped Hoody Junior', 3, 23, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (76, 'Nike Academy Mid Layer Top Junior Boys', 3, 32.6, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (77, 'Gelert Ottawa Fleece Jacket Infants', 3, 6, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (78, 'Lonsdale Inter Lock Hoody Junior Girls', 3, 11.2, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (79, 'Gelert Atlantis Fleece Boys', 3, 7.2, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (80, 'NUFC Pool Cue and Soft Case', 4, 11, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (81, 'BCE Hard Cue Case', 4, 9.99, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (82, 'BCE Green Tri Chalk', 4, 1.65, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (83, 'Riley American Pool Balls Se', 4, 17.99, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (84, 'Muddyfox Spark Junior Bike Helmet', 4, 15.55, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (85, 'Cosmic Bike Helmet and Pad Set Childrens', 4, 9.99, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (86, 'No Fear Urban Scooter', 4, 56.99, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (87, 'No Fear Urban Scooter', 4, 49.55, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (88, 'Muddyfox Recoil24 Boys Mountain Bike', 4, 79.88, 3);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (89, 'Muddyfox Synergy24 Girls', 4, 89.99, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (90, 'Muddyfox Energy24 Boys', 4, 89.99, 6);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (91, 'Wilson AVP Volleyball', 4, 4, 5);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (92, 'Dunlop Smash Knee Pads Mens', 4, 14.52, 8);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (93, 'Gelert Quickpitch 3DLX Pop Up Tent', 4, 29.99, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (94, 'Gelert Rocky 3 Tent', 4, 38, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (95, 'Salomon Pearl Boa Snowboarding Boots Ladies', 4, 96, 7);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (96, 'Volkl Squad Snowboard Junior', 4, 100, 2);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (97, 'Salomon Spell Ladies Snowboard Bindings', 4, 48, 4);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (98, 'TSL Symbioz Snow Shoe Adults', 4, 120, 9);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (99, 'HEAD Super Shape I.Speed Ski Set Mens', 4, 540, 1);
INSERT INTO `goods` (`id`, `name`, `category_id`, `price`, `rank`) VALUES (100, 'HEAD World Cup Rebels I.SLR 12 Ski Set Mens', 4, 244, 10);

INSERT INTO `basket` (`user_id`, `good_id`) VALUES (1, 3);