[root@localhost ~]# vi until.sh
#!/bin/sh
a = 10
until [ ! $a -le 15 ]
do
	echo $a
	a= 'expr $a + 1'
done

