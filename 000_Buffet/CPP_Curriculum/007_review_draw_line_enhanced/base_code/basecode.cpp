// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
char symbol;
int x1=0;
int y=5;
int y1=0;
int length=0;
cout<<"Enter line symbol:";
cin>>symbol;
cout<<"Enter line length(1-10):";
cin>>length;
cout<<"Enter x cordinate(1-10):";
cin>>x1;
cout<<"Enter y cordinate(1-10):";
cin>>y1;
for(int x=1; x<=length; x++)
{
	gotoxy(x+x1,y+y1);
    cout<<symbol;
}

}
