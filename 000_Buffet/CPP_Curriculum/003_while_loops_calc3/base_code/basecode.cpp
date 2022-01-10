// base code file
#include "./hfiles/poole.h"
main(){
	srand(time(NULL));
int x = 0;
int y = 0;
char opprand;
char a;
cout<<"Please input a number."<<endl;
cin>>x;
cout<<"Please input another number."<<endl;
cin>>y;
cout<<"Please enter an opperation out of the following: +, -, *, /"<<endl;
cin>>opprand;
while(true)
{
if(opprand=='+')
{
	cout<<x+y<<endl;
}
else if(opprand=='-')
{
	cout<<x-y<<endl;
}
else if(opprand=='*')
{
	cout<<x*y<<endl;
}
else if(opprand=='/')
{
	cout<<x/y<<endl;
}
cout<<"Would you like to continue?(y or n)"<<endl;
cin>>a;
if(a=='y')
{
cout<<"Please input a number."<<endl;
cin>>x;
cout<<"Please input another number."<<endl;
cin>>y;
cout<<"Please enter an opperation out of the following: +, -, *, /"<<endl;
cin>>opprand;
if(opprand=='+')
{
	cout<<x+y<<endl;
}
else if(opprand=='-')
{
	cout<<x-y<<endl;
}
else if(opprand=='*')
{
	cout<<x*y<<endl;
}
else if(opprand=='/')
{
	cout<<x/y<<endl;
}
}
if(a=='n'|| a=='N')
{
	break;
}
}
}
