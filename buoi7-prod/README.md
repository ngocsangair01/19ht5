# Buoi 6
1. Thực hành tìm kiếm theo thực tế, có sort, phân trang
2. Mapping input, output với model: Nếu 1 object có ít thuộc tính thì không sao, nhưng 1 object có nhiều thuộc tính (khoảng 20) thì sẽ convert rất mệt => sử dụng thư viện mapstruct
3. Luồng đi của dự án: sẽ không nhập trực tiếp model vào input và không xuất trực tiếp model ra output mà sẽ nhập input sau đó convert từ input qua model , sau đó convert model qua output
4. Bài tập: Get list có phân trang và chỉ nhập vào keyword, nếu không nhập vào keyyword thì in ra tất cả danh sách,làm tiếp sửa, xóa thông tin, tìm hiểu pageable có các thông tin page, size offset, sort,...