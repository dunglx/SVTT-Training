#include<bits/stdc++.h>
using namespace std;
int CountEven(int a[10],int dem)
{	int * p=a;	
	for(int i=0;i<10;i++)
{	if(*(p+i)%2==0)
	dem++;}
	return dem;
}
int main(){
	int a[10];
	int*p=a;
	int dem;
        for(int i=0;i<10;i++)
        cin>>a[i];
	cout<<CountEven(a,dem);	


}
