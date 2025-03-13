Có 3 kiểu kế thừa trong java:
+ đơn kế thừa (single),
+ kế thừa nhiều cấp (multilevel),
+ kế thừa thứ bậc (hierarchical).

Khi một class được kế thừa từ nhiều class đươc gọi là đa kế thừa.

Trong java, một class không được phép thừa kế từ nhiều class,
có thể cài đặt (implement) nhiều interface. Tuy nhiên, một interface có thể thừa kế nhiều interface.

Kế thừa là sự liên quan giữa hai class với nhau,
trong đó có class cha (superclass) và class con (subclass).
Khi kế thừa class con được hưởng tất cả các phương thức và thuộc tính của class cha.
Tuy nhiên, truy cập public và protected của class cha. Trừ private của class cha.

Tư tưởng của kế thừa trong java là có thể tạo ra một class mới được xây dựng trên các lớp đang tồn tại.
Khi kế thừa từ một lớp đang tồn tại bạn có sử dụng lại các phương thức và thuộc tính của lớp cha,
đồng thời có thể khai báo thêm các phương thức và thuộc tính khác.

Từ khóa extends được sử dụng để thể hiện sự kế thừa của một lớp.