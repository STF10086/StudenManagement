create database QLSV
create table student
(	
	ma varchar(20) primary key,
	hoten nvarchar(50) not null,
	gioitinh nvarchar(10)not null,
	email nvarchar(100)
)
insert into student values('14027141',N'Nguyễn Văn Cương',N'Nam','cuongnguyence95@gmail.com')
insert into student values('14027142',N'Nguyễn Cường',N'Nam','bkkv@gmail.com')
insert into student values('14027122',N'Nguyễn Thị Linh',N'Nữ','linhkute@gmail.com')
select *from student