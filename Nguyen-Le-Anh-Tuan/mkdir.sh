# vi folder2.sh
#!/bin/bash
echo "Nhap ten thu muc can tao: "
read name
if [ -d "$name" ]
then
echo "Ten thu muc da ton tai"
else
'mkdir $name'
echo "Tao thu muc thanh cong"
fi

