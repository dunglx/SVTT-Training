#include <stdlib.h>
#include <string.h>
void decode_value(const char *key, char *value, int size)
{
unsigned int length = 0;
unsigned int i = 0;
int j = 0;
char *pos1 = '\0',*pos2 = '\0', code1 = '\0',code2 = '\0';
strcpy(value,"");
if( ( pos1 = strstr(getenv("QUERY_STRING"), key)) != NULL )
{
for(i=0; i<strlen(key); i++) pos1++;
if( (pos2 = strstr(pos1,"&")) != NULL )
{
length = pos2 - pos1;
}
else length = strlen(pos1);
for(i = 0, j = 0; i < length ; i++, j++)
{
if(j < size)
{
if(pos1[i] == '%')
{
i++;
code1 = pos1[i];
i++;
code2 = pos1[i];
if(code1 == '2' && code2== '0')
value[j] = ' ';//0x20
else if(code1 == '2' && code2== '1')
value[j] = '!';//0x21
}
else value[j] = pos1[i];
}
}
if(j < size)
{
value[j] = '\0';
}
else value[size-1] = '\0';
}
}
