#include <bits/stdc++.h>

using namespace std;

int check(int ar[],int n)
{
	sort(ar,ar+n);
	for(int i=0;i<n;i++)
	ar[i] = ar[i] * ar[i];
	for(int i=n-1;i>1;i--)
	{
		int left = 0;
		int right = i - 1;
		while(left < right)
		{
			if(ar[left] + ar[right] > ar[i])
			right--;
			else if(ar[left] + ar[right] < ar[i])
			left++;
			else
			return 1;
		}
	}
	return 0;
}

int main()
{
	int ar[] = {10,4,6,12,5};
	int n = sizeof(ar)/sizeof(int);
	if(check(ar,n))
	cout<<"YES"<<endl;
	else
	cout<<"NO"<<endl;
	return 0;
}