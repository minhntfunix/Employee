# Employee
Chi tiết chương trình 

Hệ thống quản lý ứng viên bao gồm một số chức năng là tạo, cập nhật, xóa cũng như tìm kiếm.

Tạo ba lớp với ba loại ứng viên: Có kinh nghiệm, Fresher, Intern (Thực tập sinh)

Tất cả các Ứng viên đều có các thuộc tính chung: Mã ứng viên, Họ, Tên, Ngày sinh, Địa chỉ, Điện thoại, Email và Loại ứng viên. Có ba giá trị của loại ứng cử viên:

0: cho ứng viên có kinh nghiệm

1: cho ứng viên Fresher 

2: cho ứng viên Intern 

Tuy nhiên, mỗi loại ứng cử viên có thêm các thuộc tính khác nhau:

Ứng viên có kinh nghiệm: số năm kinh nghiệm (ExpInYear), Kỹ năng chuyên môn (ProSkill) 

Ứng viên Fresher có các thuộc tính bổ sung: thời gian tốt nghiệp (Graduation_date), Xếp hạng tốt nghiệp (Graduation_rank) và trường đại học sinh viên đã tốt nghiệp (Education)

Ứng viên thực tập sinh: Chuyên ngành, Học kỳ, Tên trường đại học

1. Màn hình chính như sau:

HỆ THỐNG QUẢN LÝ ỨNG VIÊN

1. Có kinh nghiệm
2. Fresher
3. Thực tập sinh
4. Đang tìm kiếm
5. Thoát

2. Chi tiết hàm:

2.1. Tạo ứng cử viên và lưu trữ trong ArrayList.

Yêu cầu: 

- Chương trình phải kiểm tra dữ liệu hợp lệ về: Ngày sinh, Điện thoại, Email, Năm kinh nghiệm, Xếp hạng tốt nghiệp.

  Ngày sinh: là số có độ dài là 4 ký tự (1900.. Năm hiện tại)  
  Điện thoại: là số có tối thiểu 10 ký tự  
  Email: với định dạng <tên tài khoản> @ <tên miền>. (ví dụ: annguyen@fpt.edu.vn)  
  Năm kinh nghiệm: là số từ 0 đến 100  
  Xếp loại Tốt nghiệp: với một trong 4 giá trị (Xuất sắc, Tốt, Khá, Kém)
  
- Từ “Màn hình chính”, chọn một mục (1,2,3) để tạo đề xuất. Sau khi tạo xong mỗi ứng viên, hệ thống hiển thị thông báo: Bạn có muốn tiếp tục (Y/N) không ? Người dùng chọn Y để tiếp tục, nếu chọn N, chương trình sẽ trả về màn hình chính và hiển thị tất cả các ứng viên được tạo.

2.2. Hàm tìm kiếm

- Người dùng chọn mục 4, chương trình hiển thị tất cả các ứng viên và yêu cầu người dùng nhập Tên ứng viên (Họ hoặc Tên) và loại ứng viên. Chương trình sẽ tìm kiếm và hiển thị kết quả với: Tên thí sinh (Họ + Tên), Ngày sinh, Địa chỉ, Điện thoại, Email và Loại thí sinh
