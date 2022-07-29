# StudentManagementApplication

Student Management CRUD Application using Java, JDBC and MySQL on Docker

# MySQL Docker Connection

### MySQL Docker Setup

```
docker volume create mysql-volume

docker run --name=mk-mysql -p3306:3306 -v mysql-volume:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql/mysql-server:8.0.20

docker exec -it mk-mysql bash

mysql -u root -p
```

### Inside MySQL interactive terminal

```
update mysql.user set host = % where user=root;

create database StudentDB;

use StudentDB;

create table students(id int primary key auto_increment, sname varchar(20) not null, sphone varchar(10), scity varchar(20));

GRANT CREATE USER ON *.* TO 'root'@'%';
```

### Run main() method from Main.java
