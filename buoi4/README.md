# Buoi 4
## Connect to database by sql
1. sql: structure query language,
2. mỗi 1 object sẽ được định danh bởi id 
3. quan hệ: 1 - n , n - n , 1 - 1
Ví dụ: quan hệ 1 - n (1 lớp học có nhiều sinh viên)
 - Lớp học A - có 20 sinh viên 
   => có 2 object: Lớp học, Sinh viên 
   => có 2 class: Lớp học, sinh viên 
 - id: primary key (Khóa chính)
 - id_lophoc: foreign key (Khóa phụ)
 - Class lớp học sẽ được định danh bởi các thông tin: id(),name, số lượng sinh viên
 - Class sinh viên sẽ được định danh bởi các thông tin: id, name, age, id_lophoc
## Sử dụng jpa kết hợp với post mapping và get mapping
## kiểm tra lý thuyết về database, sql
## Kết nối posgreSql thông qua pgadmin4
## Tạo 1 class mới
## Lấy thông tin tất cả các class
## Lấy thông tin 1 class theo id
## Lấy thông tin class theo tên
## Lấy thông tin class theo lớp
## Lấy thông tin tất cả các class  nhưng chỉ có id với tên, không có lớp
## Lấy thông tin 1 các class  nhưng chỉ có id với tên, không có lớp