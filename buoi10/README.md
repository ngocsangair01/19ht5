# Buoi 11
Exception, Base Entity

Thường để quản lý các object thì người ta sẽ có các thuộc tính cơ bản mà object nào cũng có , ví dụ: id, created time, created by, update time, update by, status

Exception: là các ngoại lệ khi người dùng không sử dụng theo luồng của hệ thống, nhiêm vụ là phải bắt exception, không để chương trình trả ra lỗi 500
Các status exception hay gặp: 
400: BadRequest - khi người dùng nhập thông tin không theo yêu cầu hệ thống ví dụ: khi nhập thông tin user name bị trùng => báo ra lỗi: user name đã có người sử dụng 
khi để trống trường tên, thì sẽ báo thông tin là : Phải nhập đầy đủ thông tin 
401: Unauthorized - khi người dùng chưa có quyền, ví dụ khi chưa đăng nhập mà muốn comment 1 bài viết trên facebook 
403: Forbidden - Khi người dùng không có quyền, ví dụ không phải quyền admin nhưng muốn đi chỉnh sửa thông tin của 1 admin 
404: Notfound - Khi thông tin không tìm thấy 

Về nhà: Viêt nốt status 400 và validate lại tất cả các thông tin (cứ chỗ nào có tìm theo id thì kiểm tra xem có tồn tại hay không)

