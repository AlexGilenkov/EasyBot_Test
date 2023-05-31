create table test(
    _id int not null AUTO_INCREMENT,
    _type varchar(50) not null,
    _serialNumber varchar(50),
    _manufacturer varchar(50),
    _price float not null,
    _count int not null,
    _additionally varchar(50),
    PRIMARY KEY (_id)
    );
insert into test (_id, _type, _serialNumber, _manufacturer, _price, _count, _additionally)
    values (1, 'Notebook', 's87e2', 'HP', 2999.99, 3, 'D17');
insert into test (_id, _type, _serialNumber, _manufacturer, _price, _count, _additionally)
    values (2, 'Computer', 's8701', 'Intel', 4999.99, 5, 'DESKTOP');
insert into test (_id, _type, _serialNumber, _manufacturer, _price, _count, _additionally)
    values (3, 'Monitor', '0t72h', 'Samsung', 1000.00, 2, '23.5');
insert into test (_id, _type, _serialNumber, _manufacturer, _price, _count, _additionally)
    values (4, 'HDD', 'pr4l2', 'Western Digital', 500, 10, '1000');