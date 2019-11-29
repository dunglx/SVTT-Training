
all: lib_cil 4-4
lib_cil:
	gcc -c decode_value.c
	ar rcs c_in_linux.a decode_value.o
4-4: 
	gcc -o gd1 chapter6_1.c c_in_linux.a -lgd
	cp gd1 /usr/lib/cgi-bin/gd1

