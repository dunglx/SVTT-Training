#!/bin/sh
echo "Nhap vao cac so can tinh tong, nhap so am de exit"
sum=0
read i
while [$i -ge 0 ]
do 
sum='expr $sum + $i'
read i
done
echo "Total: $sum."
