# Buoi 4
## Put mapping vs patch mapping
1. Put mapping và patch mapping dùng để chỉnh sửa đối tượng
2. Để chỉnh sửa đối tượng thì cần phải xác định 2 yếu tố: Đối tượng đó là gì, cần phải chỉnh sửa thông tin gì
3. Suy ra sẽ có 2 đối số cần truyền vào: id, các tham số cần sửa đổi 
4. Có 2 cách truyền tham số sửa đổi: truyền thẳng 1 thuộc tính (ví dụ: tên, tuổi,..), truyền 1 đối tượng để đè lên đối tượng cũ(ví dụ có đối tượng A:1,Sang,15, truyền 1 đối tượng A':1,Sáng,15 )
## Delete mapping
1. Delete mapping dùng để xóa đối tượng
2. Để xóa đối tượng, ta phải xác định được: id @PathVariable
3. Khi 1 đối tượng đã được xác định theo id: thì đối tượng phải chắc chắn có, vậy nếu đối tượng đó bị null thì sẽ xảy ra lỗi.
4. Suy ra ta cần 1 đối tượng là optional
## Cơ chế của save trong jpa
1. Tìm theo id,khi save 1 đối tượng không truyền id, thì sẽ là thêm mới
2. Khi save 1 đối tượng truyền id, thì nó là chỉnh sửa
3. Khi tạo đối tượng, thì id sẽ được tự gen.