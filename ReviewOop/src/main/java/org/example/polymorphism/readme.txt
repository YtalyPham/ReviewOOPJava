Tính đa hình là khả năng một đối tượng có thể thực hiện một tác vụ theo nhiều cách khác nhau.

Tính chất, được thể hiện rõ nhất qua việc gọi phương thức của đối tượng.
Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau.
Nói cách khác: Tính đa hình cung cấp khả năng cho phép người lập trình gọi trước một phương thức của đối tượng,
tuy chưa xác định đối tượng có phương thức muốn gọi hay không. Đến khi thực hiện (run-time),
chương trình mới xác định được đối tượng và gọi phương thức tương ứng của đối tượng đó.
Kết nối trễ giúp chương trình được uyển chuyển hơn, chỉ yêu cầu đối tượng cung cấp đúng phương thức cần thiết là đủ.

Trong Java, chúng ta sử dụng nạp chồng phương thức (method overloading) và ghi đè phương thức (method overriding) để có tính đa hình.

Upcasting là gì?
Khi biến tham chiếu của lớp cha tham chiếu tới đối tượng của lớp con

Nạp chồng (Overloading): Đây là khả năng cho phép một lớp có nhiều thuộc tính,
phương thức cùng tên nhưng với các tham số khác nhau về loại cũng như về số lượng.
Khi được gọi, dựa vào tham số truyền vào, phương thức tương ứng sẽ được thực hiện.

Ghi đè (Overriding): là hai phương thức cùng tên, cùng tham số, cùng kiểu trả về nhưng thằng con viết lại và dùng theo cách của nó,
 và xuất hiện ở lớp cha và tiếp tục xuất hiện ở lớp con. Khi dùng override, lúc thực thi,
 nếu lớp Con không có phương thức riêng, phương thức của lớp Cha sẽ được gọi, ngược lại nếu có, phương thức của lớp Con được gọi.

 =========================================================
Nạp chồng phương thức !=!	Ghi đè phương thức
Nạp chồng phương thức được sử dụng để tăng tính có thể đọc của chương trình
Ghi đè phương thức được sử dụng để cung cấp trình triển khai cụ thể của phương thức mà đã được cung cấp bởi lớp cha của nó

Nạp chồng phương thức được thực hiện bên trong lớp (class)
Ghi đè phương thức xuất hiện trong hai lớp mà có mối quan hệ IS-A (kế thừa)

Trong Nạp chồng phương thức, tham số phải khác nhau
Trong Ghi đè phương thức, tham số phải là giống nhau

Nạp chồng phương thức là ví dụ của đa hình tại biên dịch (compile)
Ghi đè phương thức là ví dụ của đa hình tại thực thi (runtime)

Trong Java, Nạp chồng phương thức không thể được thực hiện bởi thay đổi kiểu trả về của phương thức.Kiểu trả về có thể là giống hoặc khác
trong Nạp chồng phương thức. Nhưng bạn phải thay đổi tham số Kiểu trả về phải là giống.