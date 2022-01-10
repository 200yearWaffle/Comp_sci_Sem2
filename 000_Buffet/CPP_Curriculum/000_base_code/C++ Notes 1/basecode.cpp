// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
srand(time(NULL));
int x = 0;
char quit = 'x';
while(true)
{
	cout << "You've been gnomed";
	cout << x;
	cin >> quit;
	if(quit == 'q')
	{
		cout << "hogrider";
		break;	
	}
	if(x == 100)
	{
		break;
	}
	x = x + 1;
}
}