/*
	Program to find the last index of 1 in a string consisting of only 0s and 1s
*/

#include <iostream>

using namespace std;

int lastIdx(string s)
{
	int n = s.length();
	for(int i=n-1;i>=0;i--)
	{
		if(s[i] == '1')
		return i;
	}
	return -1;
}

int main()
{
	string s = "000000000";
	cout<<"Last idx of 1 is "<<lastIdx(s)<<endl;
	return 0;
}