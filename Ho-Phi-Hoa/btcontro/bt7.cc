#include<bits/stdc++.h>
using namespace std;
double* maximum(double* a, int size)
{
  if (size == 0)
    return NULL;
  else {
    double *Max;
    double *ptr;
    Max =a;
    ptr =a+1;

    for (int i = 0; i < (size-1); i++) {
      if (*ptr > *Max)
      Max = ptr;
      ptr++;
}
    return Max;
  }
}

int main(){
	double b[100];
	double* a=b;
	int size;
	cin>>size;
	for(int i=0;i<size;i++)
	{
		cin>>*(a+i);
	}
	cout<<*maximum(a,size);


}
