[root@localhost ~]# vi test_2.sh
#!/bin/sh
#Su dung bien dac biet $*
for a in $*
do
	echo $a
done
#Su dung bien dac biet $@
for a in $@
do
	echo $a
done
echo "Trang thai thoat cua lenh cuoi cung duoc thuc thi: $?"
