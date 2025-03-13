Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.

Nói cách khác, nếu lớp con cung cấp sự cài đặt cụ thể cho phương thức đã được cung cấp bởi một lớp cha của nó được gọi là ghi đè
phương thức (method overriding) trong java.

Ghi đè phương thức được sử dụng để thu được tính đa hình tại runtime.

Nguyên tắc ghi đè phương thức:

Phương thức phải có tên giống với lớp cha.
Phương thức phải có tham số giống với lớp cha.
Lớp con và lớp cha có mối quan hệ kế thừa.

===================================================
Có ghi đè được phương thức static không?
Không, phương thức static không thể ghi đè được, bởi vì ghi đè phương thức được thực thi lúc runtime (tính đa hình).

Tại sao không ghi đè được phương thức static?
Vì phương thức static được ràng buộc với class, còn phương thức instance được ràng buộc với đối tượng.
Static thuộc về vùng nhớ class còn instance thuộc về vùng nhớ heap.

Có ghi đè phương thức main được không?
Không, vì main là phương thức static.