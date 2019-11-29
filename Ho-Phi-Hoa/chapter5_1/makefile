SRC_CIL = decode_value.c
OBJ_CIL = decode_value.o
#CIL_INCLUDES = -I/usr/include/apache2 -I. -I/usr/include/apache2 -I/usr/include/apr-1
#CIL_LIBS = -L/usr/lib/mysql -lmysqlclient -L/usr/lib -lgd -
L/home/david/public_html/Ventus/code
all: lib_cil 4-4
lib_cil:
gcc -c $(SRC_CIL)
ar rcs c_in_linux.a $(OBJ_CIL)
$(RM) *.o
4-4:
gcc -o logic4 chapter4_3.c c_in_linux.a -lc `mysql_config --cflags --libs`
cp logic4 /home/david/public_html/cgi-bin/logic4
