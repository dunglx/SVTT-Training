[root@localhost ~]# vi test.sh
#!/bin/sh
echo "Ten file hien tai: $0"
echo "Doi so 1: $1"
echo "Doi so 2: $2"
echo "Doi so 3: $3"
echo "Tong cac doi so: $#"
echo "Tat ca doi so duoc trich dan|: $@"
echo "Tat ca doi so duoc trich dan: $*"
