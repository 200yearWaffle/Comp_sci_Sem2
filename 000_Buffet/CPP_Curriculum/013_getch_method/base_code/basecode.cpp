// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int width=11;
	int length=7;
for(int x=0; x<=width; x++)
{
        gotoxy(0+x,7);
        cout<<"-";
        gotoxy(0+x,6+length);
        cout<<"-";
}
for(int y=2; y<=length; y++)
{
    gotoxy(0,6+y);
    cout<<"|";
    gotoxy(0+width,6+y);
    cout<<"|";
}
cout<<endl;
	cout<<"Press something on your keyboard(press 'q' to quit program)";
	while(true)
	{
	char mash = getch();
	int r = random(100);
	gotoxy(5,10);
	cout<<r;
	if(mash=='q')
	{
		break;
	}
	if(r>=100)
	{
		gotoxy(1,15);
		cout<<"You reached 100! How lucky!";
		break;
	}
	}
}
