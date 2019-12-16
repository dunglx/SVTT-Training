#!/bin/bash
echo "Nhap ten nguoi dung:"
read username
echo "Nhap mat khau"
read password

if[[($username == "admin" && $password == "admin")]];then
echo "Nguoi dung hop le"
else
echo "Nguoi dung khong hop le"
fi
