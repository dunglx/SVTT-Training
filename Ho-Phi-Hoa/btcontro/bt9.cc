#include<bits/stdc++.h>
using namespace std;
bool contains(char* s, char ch[4])
{
  for(int i=0;i<4;i++)
	if(*(s+i)==ch[i])
	{ return true;
}	
	return false;	
}
int main(){
char str[4];
char ch[4];
char *s=str;
for(int i=0;i<4;i++){
	cin>>*(s+i);
}
for(int i=0;i<4;i++){
	cin>>ch[i];
}
	cout<<contains(s,ch);

}
