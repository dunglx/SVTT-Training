[root@localhost ~]#vi if_or.sh
#!/bin/bash
echo "Nhap gia tri vao:"
read n

if [[($n == 150 || $n || 400)]]
then 
echo "Ban da nhap dung"
else
echo "Ban da nhap sai"
fi

