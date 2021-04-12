#include<stdio.h>
#include<math.h>
int main()
{
    float xCoOrd=300,yCoOrd=300,xNew,yNew,theta;
    for (theta = 0;theta <= 180;theta = theta + 45)
	{
		if(theta!=361)
        {
        xNew = xCoOrd*cos(theta) - yCoOrd*sin(theta);
		yNew = xCoOrd*sin(theta) + yCoOrd*cos(theta);
        }
        printf("%f %f\n",xNew,yNew);


	}
	return 0;
}
