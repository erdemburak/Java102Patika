/*
1 - test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
2 - Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
3 - Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
4 - Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
*/



1 - CREATE TABLE employee (
	    id INTEGER PRIMARY KEY NOT NULL,
	    name VARCHAR(50) NOT NULL,
	    birthday DATE,
	    email VARCHAR(100)
    );

2 - insert into employee (id, name, birthday, email) values (1, 'Bibi Cordeiro', '1960-12-10', 'bcordeiro0@cnn.com');
    insert into employee (id, name, birthday, email) values (2, 'Vergil Britzius', '1960-09-01', 'vbritzius1@hostgator.com');
    insert into employee (id, name, birthday, email) values (3, 'Samantha Krojn', '1978-09-07', 'skrojn2@ycombinator.com');
    insert into employee (id, name, birthday, email) values (4, 'Jacklin Flewan', '1994-04-04', 'jflewan3@wunderground.com');
    ...

3 - UPDATE employee
    SET birthday = '1985-11-26'
    WHERE id = 6;

    UPDATE employee
    SET email = NULL
    WHERE name = 'Samantha Krojn'
    RETURNING *;

    UPDATE employee
    SET name = 'Burak Erdem'
    WHERE id = 1
    RETURNING *;

    UPDATE employee
    SET birthday = '1995-12-06'
    WHERE name = 'Burak Erdem'
    RETURNING *;

    UPDATE employee
    SET email = 'burakerdem@gmail.com'
    WHERE id = 1
    RETURNING *;

4 - DELETE FROM employee
    WHERE id = 2;

    DELETE FROM employee
    WHERE name LIKE 'M%';

    DELETE FROM employee
    WHERE birthday = NULL;

    DELETE FROM employee
    WHERE id BETWEEN 25 AND 30
    RETURNING *;

    DELETE FROM employee
    WHERE name = 'Burak Erdem';
