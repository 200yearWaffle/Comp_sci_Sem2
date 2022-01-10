// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
char symbol;
int length = 0;
char orientation;
cout<<"Input a symbol"<<endl;
cin>>symbol;
cout<<"please enter a length(1-10)"<<endl;
cin>>length;
cout<<"please input the orientation(h or v)"<<endl;
cin>>orientation;
if(orientation=='h')
{
for(int count = 1; count<=length; count=count+1)
{
    cout<<symbol;
}
}
if(orientation=='v')
{
for(int count = 1; count<=length; count=count+1)
{
    cout<<symbol<<endl;
}
}
}