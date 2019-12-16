[root@localhost ~]# vi case.sh
#!/bin/bash
echo "Nhap gia tri n:"
read n
case $n in
10|15)
echo "Ban doan dung so n thu nhat" ;;
119)
echo "Ban doan dung so n thu hai" ;;
389)
echo "Ban doan dung so n thu ba" ;;
*)
echo "Thu lai lan tiep theo" ;;
esac
